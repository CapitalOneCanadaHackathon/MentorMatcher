# Application

## System requirements

You need to install `Docker`, `Java`, `Maven`, `postgres` (from homebrew)

## Before

Run `sh init.sh`

## Run application

Run `sh run.sh`

To connect to postgres, use `psql -h localhost -p 5432 -U pguser` and input password

## Health check

Endpoint `http://localhost:8080/health`

Method `GET`

## To register a new customer with the system

Endpoint `http://localhost:8080/registernewcustomer`

Method `POST`

Data format `JSON`

Sample `curl -v -d "hello" http://localhost:8080/registernewcustomer`

## To get matches of customers

Endpoint `http://localhost:8080/getcustomermatches`

Method `GET`

Sample `curl -v http://localhost:8080/getcustomermatches`
