package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping(value = "/spring")
	public String welcome(){
		return "hello welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
