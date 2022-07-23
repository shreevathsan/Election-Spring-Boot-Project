package com.project.election;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.project.election.repository")
@ComponentScan("com.project.election")
@EntityScan("com.project.election.entity")
public class ElectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectionApplication.class, args);
	}

}