package com.basant.spring.cloud.foundry.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudFoundryApplication {
	
	@GetMapping("/greeting")
	public String greetingMessage() {
		return "Waoo! Congrats sabre team your application deployed successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFoundryApplication.class, args);
	}
}
