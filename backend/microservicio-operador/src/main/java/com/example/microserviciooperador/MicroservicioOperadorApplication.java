package com.example.microserviciooperador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicioOperadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioOperadorApplication.class, args);
	}

}
