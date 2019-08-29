package com.elouazzani.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.elouazzani.manager", "com.elouazzani.dao"})
@SpringBootApplication
public class Springboot102ManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot102ManagerApplication.class, args);
		System.out.println("Manager Loaded");
	}

}
