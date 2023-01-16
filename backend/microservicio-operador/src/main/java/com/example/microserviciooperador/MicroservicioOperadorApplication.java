package com.example.microserviciooperador;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicioOperadorApplication {

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseaServer() throws SQLException {
		return Server.createTcpServer(
				"-tcp", "-tcpAllowOthers", "-tcpPort", "8090");
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioOperadorApplication.class, args);
	}

}
