package com.example.microserviciobuscador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicioBuscadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioBuscadorApplication.class, args);
	}

}
