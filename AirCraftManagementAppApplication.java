package com.aircraft.app.AirCraftManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aircraft")
public class AirCraftManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirCraftManagementAppApplication.class, args);
	}
}
