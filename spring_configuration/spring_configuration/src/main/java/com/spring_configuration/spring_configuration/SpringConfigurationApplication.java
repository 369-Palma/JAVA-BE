package com.spring_configuration.spring_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationApplication.class, args);
	}

	
	public static void configWithBeans1() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurazioneTest.class);
		
	Test t1 = (Test) appContext.getBean("test");
	System.out.println(t1.saluta());
	}
}
