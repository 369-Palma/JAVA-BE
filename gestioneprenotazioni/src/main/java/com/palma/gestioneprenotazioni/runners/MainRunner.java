package com.palma.gestioneprenotazioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.palma.gestioneprenotazioni.model.TipoPostazione;
import com.palma.gestioneprenotazioni.services.EdificioService;
import com.palma.gestioneprenotazioni.services.PostazioneService;
import com.palma.gestioneprenotazioni.services.PrenotazioneService;
import com.palma.gestioneprenotazioni.services.UtenteService;

@Component
public class MainRunner implements ApplicationRunner{
	
@Autowired EdificioService edificioService;
@Autowired PostazioneService postazioneService;
@Autowired UtenteService utenteService;
@Autowired PrenotazioneService prenotazioneService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Wait for it...");
		
		//EDIFICI
		//edificioService.createCustomBuilding();	
		//edificioService.createCustomBuilding2();
		edificioService.createRandomBuilding();
		
		//POSTAZIONI
		postazioneService.createPostazioneSR();
		postazioneService.createPostazionePrivata();
		postazioneService.createPostazioneOpenSpace();
		
		//UTENTI
		utenteService.createUtenteRandom();
		
		//PRENOTAZIONI
		//prenotazioneService.createPrenotazioneCustom();
		
		//RICERCA PER CITTA'
		edificioService.findByCity("Bari").forEach(e -> System.out.println(e));
				
		//RICERCA PER TIPO DI POSTAZIONE
		//postazioneService.findPostazionePerTipo(TipoPostazione.SALA_RIUNIONI).forEach(p->System.out.println(p));
	}
	
}
