package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("--> System.getenv(): " + System.getenv().entrySet().stream().map((entry) -> String.format("%s=%s", entry.getKey(), entry.getValue())).collect(Collectors.joining(",")));
		System.out.println("--> System properties: " + System.getProperties().entrySet().stream().map((property) -> property.getKey() + ": " + property.getValue()).collect(Collectors.joining("\n  ")));
		SpringApplication.run(DemoApplication.class, args);
	}

}
