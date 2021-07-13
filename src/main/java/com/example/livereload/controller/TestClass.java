package com.example.livereload.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@EnableAutoConfiguration
@ConfigurationProperties(value = "test.type")
public class TestClass {
    private String name;
    private Map<String, Details> details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Details> getDetails() {
        return details;
    }

    public void setDetails(Map<String, Details> details) {
        this.details = details;
    }

    public static class Details {
        private String age;
        private String country;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
