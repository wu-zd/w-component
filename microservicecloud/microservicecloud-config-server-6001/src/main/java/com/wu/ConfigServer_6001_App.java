package com.wu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_6001_App {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer_6001_App.class, args);
	}
}
