#!/bin/sh
curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Frodo",  "lastName" : "Baggins" }' http://ra-api-dev.cloud.which.co.uk:8081/customer