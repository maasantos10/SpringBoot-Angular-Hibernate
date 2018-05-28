package com.mas.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.mas.spring.configuration.JpaConfiguration;

/*
 * MAS - CRUD - Spring / JPA / AngularJS / Hibernate
 * 
 */

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.mas.spring"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringCRUDAngularApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringCRUDAngularApp.class, args);
	}
}
