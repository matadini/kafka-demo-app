# kafka-demo-application

Run using `docker-compose.yaml`.

Create the `kafka-demo-app-topic` topic on a Kafka broker using `kafka-ui` in a web browser at `localhost:8080`.

Send an HTTP request to the producer service at `localhost:8081/send`.

The `consumer-service` should receive a message from the `producer-service`.
