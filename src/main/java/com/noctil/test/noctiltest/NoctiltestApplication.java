package com.noctil.test.noctiltest;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan({"com.noctil.test.noctiltest.controller"})
public class NoctiltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoctiltestApplication.class, args);
	}

}
