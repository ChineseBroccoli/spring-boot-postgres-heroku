package com.example.springbootpostgresheroku;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPostgresHerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPostgresHerokuApplication.class, args);
    }

}
