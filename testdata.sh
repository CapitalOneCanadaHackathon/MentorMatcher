curl -H "Content-Type: application/json" -d '{"firstName":"Jack","lastName":"Smith", "age": 20, "education": "professional", "isEducator": true, "programTrack": "mentor", "province": "Ontario", "gender": "male", "isIndigenous": true, "comments": "Has won olympic math awards."}' http://localhost:8080/registernewcustomer

curl -H "Content-Type: application/json" -d '{"firstName":"Rosey","lastName":"Johnson", "age": 17, "education": "highschool", "isEducator": false, "programTrack": "mentee", "grade": 11, "fieldOfStudy": "music", "province": "Ontario", "gender": "female", "isIndigenous": true, "comments": "Is looking for someone to tutor her."}' http://localhost:8080/registernewcustomer

curl -H "Content-Type: application/json" -d '{"firstName":"Hunter","lastName":"Locker", "age": 18, "education": "postsecondary", "programTrack": "both", "gender": "male", "province": "Ontario", "isIndigenous": false}' http://localhost:8080/registernewcustomer