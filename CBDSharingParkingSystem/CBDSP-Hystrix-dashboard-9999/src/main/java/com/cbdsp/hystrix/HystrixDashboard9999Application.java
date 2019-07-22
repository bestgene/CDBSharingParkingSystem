package com.cbdsp.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9999Application {
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboard9999Application.class, args);
	}
}
