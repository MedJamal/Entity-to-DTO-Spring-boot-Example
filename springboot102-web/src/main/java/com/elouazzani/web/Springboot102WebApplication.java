package com.elouazzani.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.elouazzani.web", "com.elouazzani.manager"})
@SpringBootApplication
public class Springboot102WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot102WebApplication.class, args);
		System.out.println("Web Loaded");
	}

}
