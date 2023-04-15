package com.palma.gestioneprenotazioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.palma.gestioneprenotazioni.services.EdificioService;
import com.palma.gestioneprenotazioni.services.PostazioneService;
import com.palma.gestioneprenotazioni.services.UtenteService;

@Component
public class MainRunner implements ApplicationRunner{
	
@Autowired EdificioService edificioService;
@Autowired PostazioneService postazioneService;
@Autowired UtenteService utenteService;

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
	}
	
}
