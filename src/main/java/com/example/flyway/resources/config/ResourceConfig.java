package com.example.flyway.resources.config;

import org.springframework.stereotype.Component;

@Component
public class ResourceConfig extends org.glassfish.jersey.server.ResourceConfig {
    /**
     * registering resources by package name
     */
    public ResourceConfig(){
        packages("com.example.flyway.resources");
    }
}
