package com.example.electronicshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan(basePackages = "com/example/electronicshop/entity")
@SpringBootApplication
public class ElectronicShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicShopApplication.class, args);
    }

}
