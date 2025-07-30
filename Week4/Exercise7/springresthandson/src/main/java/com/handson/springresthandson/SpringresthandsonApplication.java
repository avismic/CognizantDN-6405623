package com.handson.springresthandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration; // Add this import

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }) // Add the exclude parameter
@ImportResource({"classpath:employee.xml"})
public class SpringresthandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringresthandsonApplication.class, args);
	}

}
