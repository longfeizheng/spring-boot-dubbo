package com.niocoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:provider.xml")
@SpringBootApplication
public class BootStrapUserServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootStrapUserServiceProviderApplication.class, args);
    }
}
