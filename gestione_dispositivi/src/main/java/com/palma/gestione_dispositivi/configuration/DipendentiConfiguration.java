package com.palma.gestione_dispositivi.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.util.Locale;
import com.github.javafaker.Faker;
import com.palma.gestione_dispositivi.model.Dipendente;

@Configuration
public class DipendentiConfiguration {
	@Value("${user.admin.username}") private String adminUsername;
	@Value("${user.admin.firstname}") private String adminName;
	@Value("${user.admin.lastname}") private String adminLastname;
	@Value("${user.admin.email}") private String adminEmail;
	
	@Bean("RandomDipendente")
	@Scope("prototype")
	public Dipendente randomDipendente() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		return Dipendente.builder()
				.username(fake.name().username())
				.fullname(fake.name().firstName() + " " + fake.name().lastName())				
				.email(fake.internet().emailAddress())
				.build();
	}
	
	@Bean("AdminDipendente")
	@Scope("singleton")
	public Dipendente adminDipendente() {
		return Dipendente.builder()
				.username(adminUsername)
				.fullname(adminName + adminLastname)				
				.email(adminEmail)
				.build();
	}
	
}
