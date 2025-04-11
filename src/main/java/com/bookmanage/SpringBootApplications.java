package com.bookmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mapper")
public class SpringBootApplications {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplications.class,args);
    }
}