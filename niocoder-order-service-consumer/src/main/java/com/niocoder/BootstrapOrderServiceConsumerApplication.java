package com.niocoder;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "com.niocoder")
@SpringBootApplication
public class BootstrapOrderServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootstrapOrderServiceConsumerApplication.class, args);
    }
}
