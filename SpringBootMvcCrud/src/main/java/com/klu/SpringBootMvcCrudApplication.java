package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // ✅ This automatically scans com.klu.* packages
public class SpringBootMvcCrudApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMvcCrudApplication.class, args);
    }
}
