package com.example.electronicshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class ElectronicShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicShopApplication.class, args);
    }

}
