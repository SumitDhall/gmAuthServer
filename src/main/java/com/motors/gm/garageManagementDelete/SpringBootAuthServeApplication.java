package com.motors.gm.garageManagementDelete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringBootAuthServeApplication {

	public static void main(String[] args) {
		System.out.println("AuthZ Server started");
		SpringApplication.run(SpringBootAuthServeApplication.class, args);
	}

}
