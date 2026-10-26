#!/usr/bin/env bash
# À exécuter DANS le conteneur : docker exec -it olist-tools bash /project/sqoop/import_all.sh
hdfs dfs -mkdir -p /data/olist
hdfs dfs -rm -r -f /data/olist/sqoop
sqoop import-all-tables \
  --connect jdbc:mysql://mysql:3306/olist --username root --password root123 \
  --warehouse-dir /data/olist/sqoop \
  --fields-terminated-by '\t' --null-string '\\N' --null-non-string '\\N' \
  --hive-drop-import-delims --exclude-tables kpi_sales_by_state \
  -m 1
hdfs dfs -ls /data/olist/sqoop
