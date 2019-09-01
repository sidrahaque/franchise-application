package com.franchise.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FranchiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FranchiseApplication.class, args);
	}
	
}
