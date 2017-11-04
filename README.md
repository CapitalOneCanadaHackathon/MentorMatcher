# Application

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
