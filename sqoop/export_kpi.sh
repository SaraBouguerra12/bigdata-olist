#!/usr/bin/env bash
# Exporte le résultat Hive (HDFS) vers la table MySQL kpi_sales_by_state
sqoop export \
  --connect jdbc:mysql://mysql:3306/olist --username root --password root123 \
  --table kpi_sales_by_state --export-dir /data/olist/export/kpi_state \
  --input-fields-terminated-by '\t' --input-null-string '\\N' --input-null-non-string '\\N' -m 1
