package com.palma.gestioneprenotazioni.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.palma.gestioneprenotazioni.model.Postazione;
import com.palma.gestioneprenotazioni.model.TipoPostazione;

@Configuration
@PropertySource("classpath:application.properties")
public class PostazioneConfigurazione {
	
	@Bean("PostazioneOpenSpace")
	@Scope("prototype")
	public Postazione postazioneOpenSpace() {
		Faker f = new Faker(new Locale("it-IT"));
		Postazione p = new Postazione();
		p.setTipo(TipoPostazione.OPENSPACE);
		p.setNumeroMax(f.number().numberBetween(20, 40));
		p.setDescrizione("Postazione di tipo" + " " + p.getTipo() + ". " + "Può accogliere massimo" + " " + p.getNumeroMax() + " occupanti.");
		return p;
	}
	
	@Bean("PostazionePrivata")
	@Scope("prototype")
	public Postazione postazionePrivata() {
		Faker f = new Faker(new Locale("it-IT"));
		Postazione p = new Postazione();
		p.setTipo(TipoPostazione.PRIVATO);
		p.setNumeroMax(f.number().numberBetween(1, 5));
		p.setDescrizione("Postazione di tipo" + " " + p.getTipo() + ". " + "Può accogliere massimo" + " " + p.getNumeroMax() + " occupanti.");
		return p;
	}
	
	@Bean("PostazioneSalaRiunioni")
	@Scope("prototype")
	public Postazione postazioneSalaRiunioni() {
		Faker f = new Faker(new Locale("it-IT"));
		Postazione p = new Postazione();
		p.setTipo(TipoPostazione.SALA_RIUNIONI);
		p.setNumeroMax(f.number().numberBetween(5,20));
		p.setDescrizione("Postazione di tipo" + " " + p.getTipo() + ". " + "Può accogliere massimo" + " " + p.getNumeroMax() + " occupanti.");
		return p;
	}
}

