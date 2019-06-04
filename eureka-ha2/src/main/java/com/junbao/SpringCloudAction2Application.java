package com.junbao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudAction2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAction2Application.class, args);
	}
}
