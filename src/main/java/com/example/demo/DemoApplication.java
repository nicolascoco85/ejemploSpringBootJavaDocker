package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import io.github.cdimascio.dotenv.Dotenv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ConfigurationProperties(prefix = "application.properties")
public class DemoApplication {

	@Value("${NAME_DB}")
	String name; // = dotenv.get("NAME_DB");


	@RequestMapping("/")
	String home() {
		
		String saludo = System.getenv().get("SALUDO");// by solapa Environment

		return "Hello World!" + name + saludo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}