package com.example.demo.cb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SpringbootCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudOperationsApplication.class, args);
	}

}
