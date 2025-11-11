package com.easybytes.easystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.easybytes")
public class EasystoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasystoreApplication.class, args);
    }
}
