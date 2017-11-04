docker rm -f postgres_instance

docker run --name postgres_instance -p 5432:5432 -e POSTGRES_USER=pguser -e POSTGRES_PASSWORD=password -d postgres