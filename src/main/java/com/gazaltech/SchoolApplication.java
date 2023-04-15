package com.gazaltech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

}
