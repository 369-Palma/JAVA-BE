package com.palma.gestioneprenotazioni.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.palma.gestioneprenotazioni.model.Postazione;
import com.palma.gestioneprenotazioni.model.Prenotazione;
import com.palma.gestioneprenotazioni.model.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioneConfiguration {
	@Bean("PrenotazioneCustom")
	@Scope("request")
	public Prenotazione prenotazioneCustom(Utente u, Boolean prenotato, LocalDate data, Integer giorno) {
		Prenotazione p = new Prenotazione();
		p.setPrenotato(!prenotato);
		p.setData(data);
		p.setGiornoPrenotazione(p.getGiornoPrenotazione()+1);
		//p.setPrenotazioni(p.getPrenotazioni().add(postazione));;
		return p;
	}
	
}
