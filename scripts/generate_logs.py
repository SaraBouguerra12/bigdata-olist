"""Génère des journaux de navigation e-commerce (pour Flume) à partir des clients/produits Olist.
Les fichiers sont écrits dans data/logs/staging puis déplacés dans data/logs/spool (fichiers complets).
Usage : python scripts/generate_logs.py --files 3 --lines 2000
"""
import argparse, os, random, shutil, uuid
from datetime import datetime, timedelta
import pandas as pd

p = argparse.ArgumentParser()
p.add_argument("--files", type=int, default=3)
p.add_argument("--lines", type=int, default=2000)
a = p.parse_args()
random.seed(7)
cust = pd.read_csv("data/raw/olist_customers_dataset.csv", usecols=["customer_id"])["customer_id"].tolist()
prod = pd.read_csv("data/raw/olist_products_dataset.csv", usecols=["product_id", "product_category_name"]).dropna()
prod = list(prod.itertuples(index=False))
events = ["page_view"] * 55 + ["search"] * 15 + ["click"] * 15 + ["add_to_cart"] * 10 + ["purchase"] * 5
agents = ["Mozilla/5.0 (Windows NT 10.0)", "Mozilla/5.0 (iPhone; CPU iPhone OS 16)", "Mozilla/5.0 (Linux; Android 13)"]
os.makedirs("data/logs/staging", exist_ok=True); os.makedirs("data/logs/spool", exist_ok=True)
t0 = datetime.now()
for i in range(a.files):
    name = f"weblog_{t0:%Y%m%d_%H%M%S}_{i}.log"
    path = os.path.join("data/logs/staging", name)
    with open(path, "w", encoding="utf-8") as f:
        for _ in range(a.lines):
            ts = t0 + timedelta(seconds=random.randint(0, 3600))
            pid, cat = random.choice(prod)
            f.write(f"{ts:%Y-%m-%d %H:%M:%S}|{uuid.uuid4().hex[:12]}|{random.choice(cust)}|"
                    f"{random.choice(events)}|{pid}|{cat}|{random.choice(agents)}\n")
    shutil.move(path, os.path.join("data/logs/spool", name))
    print("fichier prêt pour Flume :", name)
