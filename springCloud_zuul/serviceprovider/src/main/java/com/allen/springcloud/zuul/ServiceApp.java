package com.allen.springcloud.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServiceApp.class).web(true).run(args);
	}

}
