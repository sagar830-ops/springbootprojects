package com.example.demo.cb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		System.out.println("Hello java");
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}

}
