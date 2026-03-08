package com.demo.consumer.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

/**
 * You Can create a configuration for every external service (different base url). In this case we have only one,
 * so it's called RestClientConfig.
 */
@Configuration
public class RestClientConfig {

    @Bean
    public RestClient restClient() {
        return RestClient.builder().baseUrl("http://localhost:8081").build();
    }
}
