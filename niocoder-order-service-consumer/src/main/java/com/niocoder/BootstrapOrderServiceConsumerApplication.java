package com.niocoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:consumer.xml")
@SpringBootApplication
public class BootstrapOrderServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootstrapOrderServiceConsumerApplication.class, args);
    }
}
