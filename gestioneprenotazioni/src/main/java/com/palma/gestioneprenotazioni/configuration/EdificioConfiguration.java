package com.palma.gestioneprenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.palma.gestioneprenotazioni.model.Edificio;

@Configuration
@PropertySource("classpath:application.properties")
public class EdificioConfiguration {
	
@Bean("NewBuilding")
@Scope("prototype")
public Edificio newBuilding() {
	return new Edificio();
}


@Bean("CustomBuilding")
@Scope("prototype")
public Edificio customBuilding(String address, String city) {
	Edificio e = new Edificio();
	e.setNome("Inps");
	e.setIndirizzo(address);
	e.setCitta(city);
	return e;
}

@Bean("RandomBuilding")
@Scope("prototype")
public Edificio randomBuilding() {
	Faker f = new Faker(new Locale("it-IT"));
	Edificio e = new Edificio();
	e.setNome("Inps");
	e.setIndirizzo(f.address().streetName() + " " + f.address().streetAddressNumber());
	e.setCitta(f.address().city());
	return e;
}

}
