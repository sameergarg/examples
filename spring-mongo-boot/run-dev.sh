#!/bin/sh
java -jar gs-spring-mongo-boot-0.1.0.jar --server.port=8081 --spring.data.mongodb.port=27017 --spring.data.mongodb.host=ra-mongo-dev.cloud.which.co.uk --spring.data.mongodb.database=dev --debug > console.out &
