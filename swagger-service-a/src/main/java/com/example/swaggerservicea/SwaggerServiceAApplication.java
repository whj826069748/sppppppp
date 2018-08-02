package com.example.swaggerservicea;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableSwagger2Doc
@EnableDiscoveryClient
@SpringBootApplication
public class SwaggerServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerServiceAApplication.class, args);
	}
}
