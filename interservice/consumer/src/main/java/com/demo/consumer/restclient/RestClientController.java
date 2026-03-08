package com.demo.consumer.restclient;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest-client")
@RequiredArgsConstructor
public class RestClientController {

    private final ProviderRestClient providerRestClient;

    @GetMapping("/instance")
    public String getInstanceInfo() {
//        RestClient restClient = RestClient.create();
//        String response = restClient.get()
//                .uri("http://localhost:8080/instance")
//                .retrieve()
//                .body(String.class);
//
//        return response;
        return providerRestClient.getInstanceInfo();
    }
}
