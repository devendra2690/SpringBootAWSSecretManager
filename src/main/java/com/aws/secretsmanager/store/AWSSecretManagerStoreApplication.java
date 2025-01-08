package com.aws.secretsmanager.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AWSSecretManagerStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(AWSSecretManagerStoreApplication.class, args);
    }

}
