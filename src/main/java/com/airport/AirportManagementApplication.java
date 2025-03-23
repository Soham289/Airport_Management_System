package com.airport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirportManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirportManagementApplication.class, args);
        System.out.println("🚀 Airport Management System is running at http://localhost:8080");
    }
}

