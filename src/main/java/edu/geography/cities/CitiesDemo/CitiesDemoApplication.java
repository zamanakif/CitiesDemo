package edu.geography.cities.CitiesDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaClient;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "edu.geography.cities")
//@EnableEurekaClient
public class CitiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesDemoApplication.class, args);
	}

}

