package com.example.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableEurekaServer
public class SpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}

}

