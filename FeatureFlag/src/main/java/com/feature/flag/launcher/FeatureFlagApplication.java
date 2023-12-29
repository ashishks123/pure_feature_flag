package com.feature.flag.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.feature")
public class FeatureFlagApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FeatureFlagApplication.class, args);
	}
}
