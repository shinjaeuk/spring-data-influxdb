package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringDataInfluxDBApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataInfluxDBApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("start");
	}
}
