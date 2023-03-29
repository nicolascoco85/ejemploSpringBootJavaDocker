package com.example.demo;

import org.springframework.boot.SpringApplication;
import io.github.cdimascio.dotenv.Dotenv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    String home() {
    	Dotenv dotenv = Dotenv.load();
    	String name = dotenv.get("NAME_DB");
        return "Hello World!" + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}