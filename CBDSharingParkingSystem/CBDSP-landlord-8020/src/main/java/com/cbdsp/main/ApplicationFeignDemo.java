package com.cbdsp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.cbdsp.interfaces")
@ComponentScan({"com.cbdsp.controller","com.cbdsp.interfaces"})
public class ApplicationFeignDemo {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationFeignDemo.class, args);
	}
}
