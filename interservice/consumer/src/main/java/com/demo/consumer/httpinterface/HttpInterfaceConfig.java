package com.demo.consumer.httpinterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class HttpInterfaceConfig {

    /**
     *
     * @param webClientBuilder bean already defined in webclient package
     * @return service bean
     */
//    @Bean
//    public ProviderHttpInterface webClientHttpInterface(WebClient.Builder webClientBuilder) {
//        WebClient webClient = webClientBuilder.baseUrl("http://provider").build();
//        WebClientAdapter adapter = WebClientAdapter.create(webClient);
//
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//
//        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
//        return service;
//    }

    /**
     *
     * @param restClientBuilder bean already defined in restclient package
     * @return service bean
     */
    @Bean
    public ProviderHttpInterface restClientHttpInterface(@Qualifier("loadBalanced") RestClient.Builder restClientBuilder) {
        RestClient restClient = restClientBuilder.baseUrl("http://provider").build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);

        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();

        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
        return service;
    }

    /**
     *
     * @param restTemplate bean already defined in resttemplate package
     * @return service bean
     */
//    @Bean
//    public ProviderHttpInterface restTemplateHttpInterface(RestTemplate restTemplate) {
//        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://provider"));
//        RestTemplateAdapter adapter = RestTemplateAdapter.create(restTemplate);
//
//        HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(adapter).build();
//
//        ProviderHttpInterface service = factory.createClient(ProviderHttpInterface.class);
//        return service;
//    }
}
