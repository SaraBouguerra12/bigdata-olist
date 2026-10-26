CREATE DATABASE IF NOT EXISTS olist CHARACTER SET utf8mb4;
USE olist;
DROP TABLE IF EXISTS customers, orders, order_items, order_payments, order_reviews,
  products, sellers, geolocation, product_category_name_translation;

CREATE TABLE customers (
  customer_id VARCHAR(40) PRIMARY KEY, customer_unique_id VARCHAR(40),
  customer_zip_code_prefix VARCHAR(10), customer_city VARCHAR(100), customer_state CHAR(2));
CREATE TABLE orders (
  order_id VARCHAR(40) PRIMARY KEY, customer_id VARCHAR(40), order_status VARCHAR(20),
  order_purchase_timestamp DATETIME NULL, order_approved_at DATETIME NULL,
  order_delivered_carrier_date DATETIME NULL, order_delivered_customer_date DATETIME NULL,
  order_estimated_delivery_date DATETIME NULL, INDEX(customer_id));
CREATE TABLE order_items (
  order_id VARCHAR(40), order_item_id INT, product_id VARCHAR(40), seller_id VARCHAR(40),
  shipping_limit_date DATETIME NULL, price DECIMAL(10,2), freight_value DECIMAL(10,2),
  PRIMARY KEY (order_id, order_item_id));
CREATE TABLE order_payments (
  order_id VARCHAR(40), payment_sequential INT, payment_type VARCHAR(20),
  payment_installments INT, payment_value DECIMAL(10,2),
  PRIMARY KEY (order_id, payment_sequential));
CREATE TABLE order_reviews (
  review_id VARCHAR(40), order_id VARCHAR(40), review_score INT,
  review_comment_title TEXT, review_comment_message TEXT,
  review_creation_date DATETIME NULL, review_answer_timestamp DATETIME NULL, INDEX(order_id));
CREATE TABLE products (
  product_id VARCHAR(40) PRIMARY KEY, product_category_name VARCHAR(100),
  product_name_lenght INT NULL, product_description_lenght INT NULL, product_photos_qty INT NULL,
  product_weight_g INT NULL, product_length_cm INT NULL, product_height_cm INT NULL, product_width_cm INT NULL);
CREATE TABLE sellers (
  seller_id VARCHAR(40) PRIMARY KEY, seller_zip_code_prefix VARCHAR(10),
  seller_city VARCHAR(100), seller_state CHAR(2));
CREATE TABLE geolocation (
  geolocation_zip_code_prefix VARCHAR(10), geolocation_lat DOUBLE, geolocation_lng DOUBLE,
  geolocation_city VARCHAR(100), geolocation_state CHAR(2));
CREATE TABLE product_category_name_translation (
  product_category_name VARCHAR(100), product_category_name_english VARCHAR(100));

-- Table de résultats alimentée par l'export Sqoop (HDFS -> MySQL)
CREATE TABLE IF NOT EXISTS kpi_sales_by_state (
  customer_state CHAR(2) PRIMARY KEY, nb_orders BIGINT, revenue DOUBLE, avg_ticket DOUBLE);
