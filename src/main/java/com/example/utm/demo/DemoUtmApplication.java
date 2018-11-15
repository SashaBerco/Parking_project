package com.example.utm.demo;

import com.example.utm.demo.controllers.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= MainController.class)
public class DemoUtmApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoUtmApplication.class, args);
	}
}
