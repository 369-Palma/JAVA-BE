package com.palma.jdbc_project.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.palma.jdbc_project.model.User;

@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {

	@Value("${user.admin.name}") private String adminName;
	@Value("${user.admin.lastname}") private String adminLastname;
	@Value("${user.admin.email}") private String adminEmail;
	@Value("${user.admin.age}") private Integer adminAge;
	@Value("${user.admin.password}") private String adminPassword;
	
	@Bean @Scope("singleton")
	public User adminUser() {
		return new User(adminName, adminLastname, adminEmail, adminAge, adminPassword );
	}
	
	@Bean @Scope("prototype")	
	public User newUser() {
		return new User();		
	}
	
	@Bean @Scope("prototype")	
	public User customUser() {
		User u = new User();
		u.setName("Pippo");
		u.setLastname("Baudo");
		return u;
	}
	
	@Bean @Scope("prototype")	
	public User randomUser() {
		
		Faker f = Faker.instance();
		User u = new User();
		u.setName(f.name().firstName());
		u.setLastname(f.name().lastName());
		u.setEmail(u.getName() + "." + u.getLastname() + "@gmail.com");
		u.setAge(f.number().numberBetween(18,80));
		u.setPassword(f.internet().password(5, 10, true, true));
		
		return u;
	}
	
}
