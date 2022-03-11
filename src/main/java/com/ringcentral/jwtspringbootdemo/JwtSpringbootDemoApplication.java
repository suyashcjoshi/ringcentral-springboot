package com.ringcentral.jwtspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtSpringbootDemoApplication {

	public static void main(String[] args) {
    System.out.println("Hello from RingCentral SpringBoot App!");
		SpringApplication.run(JwtSpringbootDemoApplication.class, args);
	}

}
