-- Tables externes Hive sur les données importées par Sqoop (HDFS /data/olist/sqoop)
CREATE DATABASE IF NOT EXISTS olist;
USE olist;

CREATE EXTERNAL TABLE IF NOT EXISTS customers (
  customer_id STRING, customer_unique_id STRING, customer_zip_code_prefix STRING,
  customer_city STRING, customer_state STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/customers';

CREATE EXTERNAL TABLE IF NOT EXISTS orders (
  order_id STRING, customer_id STRING, order_status STRING, order_purchase_timestamp STRING,
  order_approved_at STRING, order_delivered_carrier_date STRING,
  order_delivered_customer_date STRING, order_estimated_delivery_date STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/orders';

CREATE EXTERNAL TABLE IF NOT EXISTS order_items (
  order_id STRING, order_item_id INT, product_id STRING, seller_id STRING,
  shipping_limit_date STRING, price DOUBLE, freight_value DOUBLE)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/order_items';

CREATE EXTERNAL TABLE IF NOT EXISTS order_payments (
  order_id STRING, payment_sequential INT, payment_type STRING,
  payment_installments INT, payment_value DOUBLE)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/order_payments';

CREATE EXTERNAL TABLE IF NOT EXISTS order_reviews (
  review_id STRING, order_id STRING, review_score INT, review_comment_title STRING,
  review_comment_message STRING, review_creation_date STRING, review_answer_timestamp STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/order_reviews';

CREATE EXTERNAL TABLE IF NOT EXISTS products (
  product_id STRING, product_category_name STRING, product_name_lenght INT,
  product_description_lenght INT, product_photos_qty INT, product_weight_g INT,
  product_length_cm INT, product_height_cm INT, product_width_cm INT)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/products';

CREATE EXTERNAL TABLE IF NOT EXISTS product_category_name_translation (
  product_category_name STRING, product_category_name_english STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '\t' LOCATION '/data/olist/sqoop/product_category_name_translation';

-- Logs collectés par Flume (format : ts|session|customer_id|event|product_id|category|user_agent)
CREATE EXTERNAL TABLE IF NOT EXISTS weblogs (
  ts STRING, session_id STRING, customer_id STRING, event_type STRING,
  product_id STRING, product_category STRING, user_agent STRING)
ROW FORMAT DELIMITED FIELDS TERMINATED BY '|' LOCATION '/data/olist/logs';
