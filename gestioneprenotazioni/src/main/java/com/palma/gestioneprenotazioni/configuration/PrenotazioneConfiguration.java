package com.palma.gestioneprenotazioni.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import com.palma.gestioneprenotazioni.model.Postazione;
import com.palma.gestioneprenotazioni.model.Prenotazione;


@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioneConfiguration {
	@Bean("PrenotazioneCustom")
	@Scope("prototype")
	public Prenotazione prenotazioneCustom(Boolean prenotato, LocalDate data) {
		Prenotazione p = new Prenotazione();
		p.setPrenotato(prenotato);
		p.setData(data);
		p.setGiornoPrenotazione(1);
		return p;	
	}
	
	
		@Bean("PrenotazioneVerificata")
		@Scope("prototype")
		public Prenotazione prenotazioneVerificata(LocalDate data, Prenotazione p, Postazione postazione) {
	if((postazione.getOccupato()!=true) && (p.getData()!= data) && (p.getGiornoPrenotazione() <1)) {
		Prenotazione prenotazione = new Prenotazione();
	prenotazione.setPrenotato(true);
	prenotazione.setData(data);
	prenotazione.setGiornoPrenotazione(1);
	return prenotazione;	
	} else {
		System.out.println("Non è possibile prenotare presso questa sede. Si prega di scegliere un altro giorno");
	}
	return null;
}
		
}
