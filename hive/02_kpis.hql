
USE olist;

-- Configuration Hive
SET hive.mapred.mode=nonstrict;

-- KPI 1 : chiffre d'affaires et commandes par mois
SELECT
    substr(o.order_purchase_timestamp, 1, 7) AS mois,
    COUNT(DISTINCT o.order_id) AS nb_commandes,
    ROUND(SUM(p.payment_value), 2) AS ca
FROM orders o
JOIN order_payments p
    ON o.order_id = p.order_id
WHERE o.order_status <> 'canceled'
GROUP BY substr(o.order_purchase_timestamp, 1, 7)
ORDER BY mois;

-- KPI 2 : top 10 catégories par chiffre d'affaires
SELECT
    COALESCE(
        t.product_category_name_english,
        pr.product_category_name
    ) AS categorie,
    ROUND(SUM(i.price), 2) AS ca,
    COUNT(*) AS nb_articles
FROM order_items i
JOIN products pr
    ON i.product_id = pr.product_id
LEFT JOIN product_category_name_translation t
    ON pr.product_category_name = t.product_category_name
GROUP BY COALESCE(
    t.product_category_name_english,
    pr.product_category_name
)
ORDER BY ca DESC
LIMIT 10;

-- KPI 3 : répartition des moyens de paiement
SELECT
    payment_type,
    COUNT(*) AS nb,
    ROUND(SUM(payment_value), 2) AS montant
FROM order_payments
GROUP BY payment_type
ORDER BY montant DESC;

-- KPI 4 : délai moyen de livraison et note moyenne par État
SELECT
    c.customer_state,
    ROUND(
        AVG(
            datediff(
                substr(o.order_delivered_customer_date, 1, 10),
                substr(o.order_purchase_timestamp, 1, 10)
            )
        ),
        1
    ) AS delai_moyen_j,
    ROUND(AVG(r.review_score), 2) AS note_moyenne
FROM orders o
JOIN customers c
    ON o.customer_id = c.customer_id
JOIN order_reviews r
    ON o.order_id = r.order_id
WHERE o.order_status = 'delivered'
  AND o.order_delivered_customer_date IS NOT NULL
GROUP BY c.customer_state
ORDER BY delai_moyen_j DESC;

-- KPI 5 : répartition des événements de navigation collectés par Flume
SELECT
    event_type,
    COUNT(*) AS nb
FROM weblogs
GROUP BY event_type
ORDER BY nb DESC;

-- Export du chiffre d'affaires par État vers HDFS pour Sqoop
INSERT OVERWRITE DIRECTORY '/data/olist/export/kpi_state'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY '\t'
SELECT
    c.customer_state,
    COUNT(DISTINCT o.order_id),
    ROUND(SUM(p.payment_value), 2),
    ROUND(
        SUM(p.payment_value) / COUNT(DISTINCT o.order_id),
        2
    )
FROM orders o
JOIN customers c
    ON o.customer_id = c.customer_id
JOIN order_payments p
    ON o.order_id = p.order_id
WHERE o.order_status <> 'canceled'
GROUP BY c.customer_state;
