package com.logan.repo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.logan.repo")
@SpringBootApplication
public class RepositoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepositoryServiceApplication.class, args);
	}
}
