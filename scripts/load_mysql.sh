#!/usr/bin/env bash
# Usage (depuis la racine du projet) : bash scripts/load_mysql.sh
set -e
docker exec -i olist-mysql mysql -uroot -proot123 --local-infile=1 < sql/01_schema.sql
docker exec -i olist-mysql mysql -uroot -proot123 --local-infile=1 < sql/02_load.sql
