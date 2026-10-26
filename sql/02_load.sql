USE olist;
LOAD DATA LOCAL INFILE '/data/raw/olist_customers_dataset.csv' INTO TABLE customers
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '/data/raw/olist_sellers_dataset.csv' INTO TABLE sellers
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '/data/raw/olist_orders_dataset.csv' INTO TABLE orders
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES
  (order_id, customer_id, order_status, @a, @b, @c, @d, @e)
  SET order_purchase_timestamp=NULLIF(@a,''), order_approved_at=NULLIF(@b,''),
      order_delivered_carrier_date=NULLIF(@c,''), order_delivered_customer_date=NULLIF(@d,''),
      order_estimated_delivery_date=NULLIF(@e,'');
LOAD DATA LOCAL INFILE '/data/raw/olist_order_items_dataset.csv' INTO TABLE order_items
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '/data/raw/olist_order_payments_dataset.csv' INTO TABLE order_payments
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '/data/raw/olist_order_reviews_dataset.csv' INTO TABLE order_reviews
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES
  (review_id, order_id, review_score, review_comment_title, review_comment_message, @a, @b)
  SET review_creation_date=NULLIF(@a,''), review_answer_timestamp=NULLIF(@b,'');
LOAD DATA LOCAL INFILE '/data/raw/olist_products_dataset.csv' INTO TABLE products
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES
  (product_id, product_category_name, @a, @b, @c, @d, @e, @f, @g)
  SET product_name_lenght=NULLIF(@a,''), product_description_lenght=NULLIF(@b,''),
      product_photos_qty=NULLIF(@c,''), product_weight_g=NULLIF(@d,''),
      product_length_cm=NULLIF(@e,''), product_height_cm=NULLIF(@f,''), product_width_cm=NULLIF(@g,'');
LOAD DATA LOCAL INFILE '/data/raw/olist_geolocation_dataset.csv' INTO TABLE geolocation
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;
LOAD DATA LOCAL INFILE '/data/raw/product_category_name_translation.csv' INTO TABLE product_category_name_translation
  FIELDS TERMINATED BY ',' OPTIONALLY ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 LINES;

SELECT 'customers' t, COUNT(*) n FROM customers UNION ALL SELECT 'orders', COUNT(*) FROM orders
UNION ALL SELECT 'order_items', COUNT(*) FROM order_items UNION ALL SELECT 'order_payments', COUNT(*) FROM order_payments
UNION ALL SELECT 'order_reviews', COUNT(*) FROM order_reviews UNION ALL SELECT 'products', COUNT(*) FROM products
UNION ALL SELECT 'sellers', COUNT(*) FROM sellers UNION ALL SELECT 'geolocation', COUNT(*) FROM geolocation;
