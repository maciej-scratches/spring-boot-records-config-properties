package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("app")
@ConstructorBinding
public record AppProperties(String name, String env) {

    boolean exceedsThreshold() {
        return false;
    }
}
