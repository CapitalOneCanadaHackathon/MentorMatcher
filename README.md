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

Sample `curl -v http://localhost:8080/health`

## To register a new customer with the system

Endpoint `http://localhost:8080/registernewcustomer`

Method `POST`

Data format `JSON`

Sample

`curl -H "Content-Type: application/json" -d '{"firstName":"Jack","lastName":"Smith", "age": 20, "education": "professional", "isEducator": true, "programTrack": "mentor", "grade": null, "fieldOfStudy": null, "province": "Ontario", "gender": "male", "isIndigenous": true, "comments": "Has won olympic math awards."}' http://localhost:8080/registernewcustomer`

`curl -H "Content-Type: application/json" -d '{"firstName":"Rosey","lastName":"Johnson", "age": 17, "education": "highschool", "isEducator": false, "programTrack": "mentee", "grade": 11, "fieldOfStudy": "music", "province": "Ontario", "gender": "female", "isIndigenous": true, "comments": "Is looking for someone to tutor her."}' http://localhost:8080/registernewcustomer`

To validate

```
psql> \connect postgres
psql> \dt
psql> SELECT * FROM customer;
```

## To get a list of all customers

To get those who are mentees and a certain level of education (high school or postsecondary)

`curl -d "hello" http://localhost:8080/findcustomers`

To get those who are mentees and an educator

``

## To get matches of customers

Endpoint `http://localhost:8080/getcustomermatches`

Method `GET`

Sample `curl -v http://localhost:8080/getcustomermatches`
