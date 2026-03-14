package com.example.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private final String instanceId = java.util.UUID.randomUUID().toString();

    @GetMapping("/instance-info")
    public String getInstanceInfo(){
        log.trace("Request received at instance running on port: {}", port);
        log.debug("Request received at instance running on port: {}", port);
        log.info("Request received at instance running on port: {}", port);
        log.warn("Request received at instance running on port: {}", port);
        log.error("Request received at instance running on port: {}", port);
        System.out.println("Request received at instance running on port: " + port);
        return "Instance served by port:" + port + ". Instance ID: " + instanceId;
    }
}
