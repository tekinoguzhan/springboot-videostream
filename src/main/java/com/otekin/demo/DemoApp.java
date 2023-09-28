package com.otekin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({ "com" })

public class DemoApp {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}

	

}
