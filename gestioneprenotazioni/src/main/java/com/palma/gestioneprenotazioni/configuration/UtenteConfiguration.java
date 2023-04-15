package com.palma.gestioneprenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.palma.gestioneprenotazioni.model.Utente;

@Configuration
public class UtenteConfiguration {

	
@Bean("RandomUtente") 
@Scope("prototype")
public Utente RandomUtente() {
	Utente u = new Utente();
	Faker f = new Faker(new Locale("it-IT"));
	u.setUsername(f.name().suffix() + f.number());		
	u.setFullName(f.name().fullName());
	u.setEmail(u.getUsername() + "@gmail.com");
	return u;
}
}
