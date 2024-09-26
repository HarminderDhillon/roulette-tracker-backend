package com.dhillon.roulette_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RouletteTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouletteTrackerApplication.class, args);
	}

}
