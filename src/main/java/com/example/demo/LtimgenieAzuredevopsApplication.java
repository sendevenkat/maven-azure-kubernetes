package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LtimgenieAzuredevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtimgenieAzuredevopsApplication.class, args);
	}
	
	@GetMapping("/")
	public String Hello() {
		return "welcome to ltimindtree this the LTIMGENIE v 1.9 for CICD Azure pipeline " ;
	}

}
