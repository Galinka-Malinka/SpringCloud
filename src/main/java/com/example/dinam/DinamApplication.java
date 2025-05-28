package com.example.dinam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DinamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DinamApplication.class, args);
	}

}
