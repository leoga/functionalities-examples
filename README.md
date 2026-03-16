# Repository for testing miscellaneous functionalities

## Project config-mgmt

To test loading different configurations in Spring Boot, separating them by environment:
- Using separate files within the project, one for each environment.
- Loading them from a database.
- Using a configuration server with Spring Cloud features.
- Loading them from an [external repository](https://github.com/leoga/app-configuration).
- Using RabbitMQ for dynamically updating configuration properties.
- Encrypting sensitive data.

## Project interservice

To test different ways of interservice communication:
- Using FeignClient (legacy).
- Using RestTemplate (legacy).
- Using RestClient.
- Using WebClient.
- Implementing them with HttpInterface proxy.

Eureka service registry features has been added.

## Evaluate-loki
- Log monitoring with Grafana, configured for the previous projects. ([Guide for setup Grafana with docker compose](https://grafana.com/docs/loki/latest/get-started/quick-start/quick-start/))
## Evaluate-prometheus
- Log monitoring (Loki) and Prometheus for metrics observability for the previous projects ([Guide for setup Grafana with docker compose](https://grafana.com/docs/loki/latest/get-started/quick-start/quick-start/))
- Configure Zipkin distributed tracing for the interservice projects.
