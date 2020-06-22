package com.loong.spsysspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpsysSpringboootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpsysSpringboootApplication.class, args);
    }

}
