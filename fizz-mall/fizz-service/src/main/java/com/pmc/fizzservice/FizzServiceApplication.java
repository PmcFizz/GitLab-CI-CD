package com.pmc.fizzservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FizzServiceApplication {

	@GetMapping("/")
	String home() {
		return "Spring is here! 2022年1月14日21:49:47";
	}

	public static void main(String[] args) {
		SpringApplication.run(FizzServiceApplication.class, args);
	}

}
