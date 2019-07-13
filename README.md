# kafka-start

[![Build Status](https://secure.travis-ci.org/elasticjob/elastic-job-lite.png?branch=master)](https://travis-ci.org/elasticjob/elastic-job-lite)
[![Maven Status](https://maven-badges.herokuapp.com/maven-central/com.dangdang/elastic-job-lite/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.dangdang/elastic-job-lite)
[![Gitter](https://badges.gitter.im/Elastic-JOB/elastic-job-lite.svg)](https://gitter.im/Elastic-JOB/elasticjob?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![Coverage Status](https://coveralls.io/repos/elasticjob/elastic-job/badge.svg?branch=master&service=github)](https://coveralls.io/github/elasticjob/elastic-job?branch=master)
[![GitHub release](https://img.shields.io/github/release/elasticjob/elastic-job.svg)](https://github.com/elasticjob/elastic-job/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

### 参考文章
- https://www.cnblogs.com/frankdeng/p/9584870.html  kafka-manager简介
- https://github.com/wurstmeister/kafka-docker/blob/master/docker-compose-single-broker.yml  官网启动文件
- https://hub.docker.com/r/wurstmeister/kafka   hub.docker

### 创建kafka容器 单机模式
```text
cd service/docker-start

# 启动kafka
sh kafka.sh
```
### 创建多个kafka容器 集群模式
```text
cd service/docker-start
sh kafka-cluster.sh
```
