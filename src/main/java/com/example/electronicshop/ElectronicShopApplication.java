package com.example.electronicshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan(basePackages = "com/example/electronicshop/entity")
@SpringBootApplication
@EnableJpaRepositories
//@EnableConfigurationProperties()
@ConfigurationPropertiesScan
public class ElectronicShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectronicShopApplication.class, args);
    }

}
