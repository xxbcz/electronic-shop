package com.example.electronicshop.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "app.filter.default.page")
public class PageProperties {
    private int size;
    private int number;
    private int maxSize;
}
