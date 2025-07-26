package com.cognizant.countrycode.countrycodeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.cognizant.countrycode")  
@ImportResource("classpath:country.xml")  // we’ll create this next
public class CountryCodeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CountryCodeServiceApplication.class, args);
    }
}
