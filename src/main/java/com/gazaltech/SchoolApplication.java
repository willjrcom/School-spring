package com.gazaltech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Spring webflux School",
		version = "1.0",
		description = "Rest Api"))
public class SchoolApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args); 
	}

}
