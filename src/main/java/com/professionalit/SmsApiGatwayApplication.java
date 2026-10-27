

package com.professionalit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SmsApiGatwayApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmsApiGatwayApplication.class, args);
	}

}
