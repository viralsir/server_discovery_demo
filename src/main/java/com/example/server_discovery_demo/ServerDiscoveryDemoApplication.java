package com.example.server_discovery_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerDiscoveryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDiscoveryDemoApplication.class, args);
	}

}
