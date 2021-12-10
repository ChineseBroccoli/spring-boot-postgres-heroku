package com.example.springbootpostgresheroku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPostgresHerokuApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootPostgresHerokuApplication.class);

    @Value("${testing}")
    private String testing;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPostgresHerokuApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("testing {}", testing);
    }
}
