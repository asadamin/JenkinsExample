package com.test.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

    public static void main(String[] args) {
        System.out.println("Example Project");
        SpringApplication.run(JenkinsApplication.class, args);
    }

}
