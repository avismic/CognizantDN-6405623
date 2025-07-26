package com.cognizant.spring_country;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCountryApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCountryApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        displayCountryFromXml();
        SpringApplication.run(SpringCountryApplication.class, args);
        LOGGER.info("END");
    }

    private static void displayCountryFromXml() {
			  System.out.println(">>> displayCountryFromXml() called");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("country.xml");
        Country country = ctx.getBean("country", Country.class);
        LOGGER.debug("Loaded Country: {}", country);
    }
}
