package com.capsella.vineguards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class VineguardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VineguardsApplication.class, args);
	}
}
