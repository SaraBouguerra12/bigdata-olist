FROM eclipse-temurin:8-jdk-focal
RUN apt-get update && apt-get install -y curl procps netcat-openbsd && rm -rf /var/lib/apt/lists/*
RUN curl -fsSL https://archive.apache.org/dist/hadoop/common/hadoop-2.7.7/hadoop-2.7.7.tar.gz | tar -xz -C /opt && ln -s /opt/hadoop-2.7.7 /opt/hadoop
RUN curl -fsSL https://archive.apache.org/dist/sqoop/1.4.7/sqoop-1.4.7.bin__hadoop-2.6.0.tar.gz | tar -xz -C /opt && mv /opt/sqoop-1.4.7.bin__hadoop-2.6.0 /opt/sqoop
RUN curl -fsSL https://archive.apache.org/dist/flume/1.9.0/apache-flume-1.9.0-bin.tar.gz | tar -xz -C /opt && mv /opt/apache-flume-1.9.0-bin /opt/flume
RUN curl -fsSL -o /opt/sqoop/lib/mysql-connector-java-5.1.49.jar https://repo1.maven.org/maven2/mysql/mysql-connector-java/5.1.49/mysql-connector-java-5.1.49.jar \
 && curl -fsSL -o /opt/sqoop/lib/commons-lang-2.6.jar https://repo1.maven.org/maven2/commons-lang/commons-lang/2.6/commons-lang-2.6.jar
COPY hadoop-conf/*.xml /opt/hadoop/etc/hadoop/
ENV HADOOP_HOME=/opt/hadoop HADOOP_COMMON_HOME=/opt/hadoop HADOOP_HDFS_HOME=/opt/hadoop \
    HADOOP_MAPRED_HOME=/opt/hadoop HADOOP_CONF_DIR=/opt/hadoop/etc/hadoop \
    SQOOP_HOME=/opt/sqoop FLUME_HOME=/opt/flume
ENV PATH=$PATH:/opt/hadoop/bin:/opt/sqoop/bin:/opt/flume/bin
