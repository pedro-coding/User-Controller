package com.firstapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"controller", "model"})
@SpringBootApplication
public class FirstapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstapiApplication.class, args);
	}

}
