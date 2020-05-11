#!/usr/bin/env bash

mvn clean install;

docker build -t something-crud:latest . ;

docker-compose -f docker-compose-local.yml down;

docker-compose -f docker-compose-local.yml up;