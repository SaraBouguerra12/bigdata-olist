"""Consommateur Kafka : agrégation du chiffre d'affaires par État.
Les événements historiques et les anciens messages de test sont tolérés.
"""
import argparse
import json
import os
from collections import defaultdict

from kafka import KafkaConsumer

p = argparse.ArgumentParser()
p.add_argument("--bootstrap", default="localhost:29092")
p.add_argument("--topic", default="orders")
p.add_argument("--max", type=int, default=500)
a = p.parse_args()

os.makedirs("output", exist_ok=True)

# Pas de groupe fixe : chaque exécution relit les messages depuis le début.
cons = KafkaConsumer(
    a.topic,
    bootstrap_servers=a.bootstrap,
    group_id=None,
    auto_offset_reset="earliest",
    consumer_timeout_ms=10000,
   value_deserializer=lambda b: b
)

rev = defaultdict(float)
cnt = defaultdict(int)
n = 0

with open("output/kafka_orders.jsonl", "w", encoding="utf-8") as f:
    
    for msg in cons:
        try:
            e = json.loads(msg.value.decode("utf-8"))
        except (json.JSONDecodeError, UnicodeDecodeError, AttributeError):
            print(f"[IGNORÉ] Message non JSON : partition={msg.partition}, offset={msg.offset}")
            continue

        if not isinstance(e, dict):
            print(f"[IGNORÉ] Message JSON inattendu : partition={msg.partition}, offset={msg.offset}")
            continue

        state = e.get("customer_state") or e.get("state") or "INCONNU"

        try:
            payment = float(e.get("payment_value") or 0)
        except (ValueError, TypeError):
            payment = 0.0

        f.write(json.dumps(e, ensure_ascii=False) + "\n")
        rev[state] += payment
        cnt[state] += 1
        n += 1

        if n % 25 == 0:
            top = sorted(rev.items(), key=lambda x: -x[1])[:3]
            print(
                f"[{n}] événements reçus | top États : "
                + ", ".join(f"{s}={v:.2f} R$" for s, v in top)
            )

        if n >= a.max:
            break

cons.close()

print(f"\n{n} événements consommés -> output/kafka_orders.jsonl")
print("\nChiffre d'affaires par État :")
for state, amount in sorted(rev.items(), key=lambda x: -x[1]):
    print(f"  {state}: {amount:.2f} R$ ({cnt[state]} événements)")

