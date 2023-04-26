package com.palma.servizio_producer.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.palma.servizio_producer.model.Persona;

@Configuration
public class PersonaConfiguration {

@Bean("RandomPerson")
@Scope("prototype")
public Persona RandomPerson() {
	
	Faker f = new Faker(new Locale("it-IT"));
	return Persona.builder()
	.name(f.name().firstName())
	.lastname(f.name().lastName())
	.email(f.internet().emailAddress())
	.age(f.number().numberBetween(18, 80))
	.city(f.address().cityName())
	.build();
}
}
