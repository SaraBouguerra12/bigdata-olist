"""Analyses Olist en pandas (mêmes KPI que Hive) + graphiques pour le PowerPoint.
Usage : pip install pandas matplotlib ; python scripts/analysis_kpis.py
Sorties : output/*.csv et output/*.png
"""
import pandas as pd, matplotlib
matplotlib.use("Agg")
import matplotlib.pyplot as plt

R = "data/raw/"
o = pd.read_csv(R + "olist_orders_dataset.csv", parse_dates=["order_purchase_timestamp", "order_delivered_customer_date"])
c = pd.read_csv(R + "olist_customers_dataset.csv")
i = pd.read_csv(R + "olist_order_items_dataset.csv")
p = pd.read_csv(R + "olist_order_payments_dataset.csv")
r = pd.read_csv(R + "olist_order_reviews_dataset.csv")
pr = pd.read_csv(R + "olist_products_dataset.csv")
t = pd.read_csv(R + "product_category_name_translation.csv")

ok = o[o.order_status != "canceled"].merge(p.groupby("order_id").payment_value.sum().reset_index(), on="order_id")
m = ok.assign(mois=ok.order_purchase_timestamp.dt.to_period("M").astype(str)).groupby("mois").agg(
    nb_commandes=("order_id", "count"), ca=("payment_value", "sum")).reset_index()
m.to_csv("output/kpi_ca_mensuel.csv", index=False)
ax = m.plot(x="mois", y="ca", kind="bar", legend=False, figsize=(11, 4.5), color="#2563EB")
ax.set_title("Chiffre d'affaires mensuel (R$)"); ax.set_xlabel(""); plt.xticks(rotation=70); plt.tight_layout()
plt.savefig("output/ca_mensuel.png", dpi=150); plt.close()

cat = (i.merge(pr, on="product_id").merge(t, on="product_category_name", how="left")
       .assign(categorie=lambda d: d.product_category_name_english.fillna(d.product_category_name))
       .groupby("categorie").price.sum().sort_values(ascending=False).head(10))
cat.to_csv("output/kpi_top_categories.csv")
ax = cat.sort_values().plot(kind="barh", figsize=(9, 4.5), color="#0EA5A4")
ax.set_title("Top 10 catégories par chiffre d'affaires (R$)"); plt.tight_layout()
plt.savefig("output/top_categories.png", dpi=150); plt.close()

pay = p.groupby("payment_type").payment_value.sum().sort_values(ascending=False)
pay.to_csv("output/kpi_paiements.csv")
ax = pay.plot(kind="pie", autopct="%1.0f%%", figsize=(5.5, 5.5), ylabel="")
ax.set_title("Moyens de paiement (montant)"); plt.tight_layout()
plt.savefig("output/paiements.png", dpi=150); plt.close()

d = o[(o.order_status == "delivered") & o.order_delivered_customer_date.notna()].merge(c, on="customer_id").merge(
    r.groupby("order_id").review_score.mean().reset_index(), on="order_id")
d["delai_j"] = (d.order_delivered_customer_date - d.order_purchase_timestamp).dt.days
s = d.groupby("customer_state").agg(delai_moyen_j=("delai_j", "mean"), note_moyenne=("review_score", "mean"),
                                    nb=("order_id", "count")).round(2).sort_values("delai_moyen_j", ascending=False)
s.to_csv("output/kpi_livraison_satisfaction.csv")
ax = s.plot.scatter(x="delai_moyen_j", y="note_moyenne", s=s.nb / 20, figsize=(8, 5), color="#E11D48", alpha=.7)
for st, row in s.iterrows():
    ax.annotate(st, (row.delai_moyen_j, row.note_moyenne), fontsize=8)
ax.set_title("Délai de livraison vs note client, par État"); plt.tight_layout()
plt.savefig("output/livraison_vs_note.png", dpi=150); plt.close()
print(m.ca.sum().round(0), "R$ de CA |", len(ok), "commandes |", "note moyenne", round(r.review_score.mean(), 2))
