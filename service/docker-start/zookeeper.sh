#!/usr/bin/env bash
# 单独启动zookeeper
docker run -d --name zookeeper -p 2181:2181 -t zookeeper:latest