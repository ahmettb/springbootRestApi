package com.ornekRest.iller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@EnableAutoConfiguration
@SpringBootApplication
public class IllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IllerApplication.class, args);
	}

}
