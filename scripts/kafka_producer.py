"""Producteur Kafka : rejoue les commandes Olist comme un flux temps réel.
Usage : python scripts/kafka_producer.py --rate 5 --limit 500
"""
import argparse, json, time, uuid
from datetime import datetime
import pandas as pd
from kafka import KafkaProducer

p = argparse.ArgumentParser()
p.add_argument("--bootstrap", default="localhost:29092")
p.add_argument("--topic", default="orders")
p.add_argument("--rate", type=float, default=5, help="événements par seconde")
p.add_argument("--limit", type=int, default=500)
a = p.parse_args()

R = "data/raw/"
items = pd.read_csv(R + "olist_order_items_dataset.csv")
orders = pd.read_csv(R + "olist_orders_dataset.csv", usecols=["order_id", "customer_id"])
cust = pd.read_csv(R + "olist_customers_dataset.csv", usecols=["customer_id", "customer_state"])
pay = pd.read_csv(R + "olist_order_payments_dataset.csv").groupby("order_id").agg(
    payment_type=("payment_type", "first"), payment_value=("payment_value", "sum")).reset_index()
df = (items.groupby("order_id").agg(nb_items=("order_item_id", "count"), freight=("freight_value", "sum"))
      .reset_index().merge(orders, on="order_id").merge(cust, on="customer_id").merge(pay, on="order_id"))
df = df.sample(n=min(a.limit, len(df)), random_state=42)

prod = KafkaProducer(bootstrap_servers=a.bootstrap,
                     value_serializer=lambda v: json.dumps(v).encode("utf-8"),
                     key_serializer=lambda k: k.encode("utf-8"))
for i, r in enumerate(df.itertuples(index=False), 1):
    evt = {"event_id": str(uuid.uuid4()), "event_time": datetime.now().isoformat(timespec="seconds"),
           "order_id": r.order_id, "customer_id": r.customer_id, "customer_state": r.customer_state,
           "nb_items": int(r.nb_items), "payment_type": r.payment_type,
           "payment_value": round(float(r.payment_value), 2), "freight": round(float(r.freight), 2)}
    prod.send(a.topic, key=r.customer_state, value=evt)
    print(f"[{i}] envoyé {evt['order_id'][:8]} {evt['customer_state']} {evt['payment_value']}")
    time.sleep(1 / a.rate)
prod.flush()
print("Terminé.")
