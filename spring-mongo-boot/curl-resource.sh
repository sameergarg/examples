#!/bin/sh

HOST="localhost"
PORT="8081"

while getopts "h:p:" option
do
    case "${option}"
    in
            h) HOST=${OPTARG};;
            p) PORT=${OPTARG};;
    esac
done

echo Using host=$HOST, port=$PORT

curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Frodo",  "lastName" : "Baggins" }' http://$HOST:$PORT/customer

curl http://$HOST:$PORT/customer

curl http://$HOST:$PORT/customer/search/findByFirstName?firstName=Frodo

# 0 0-23/4 * *  * webadmin /ca/applications/spring-mongo-boot/curl-dev.sh