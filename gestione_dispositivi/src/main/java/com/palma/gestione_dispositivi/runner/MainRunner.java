package com.palma.gestione_dispositivi.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.palma.gestione_dispositivi.services.DipendenteService;

@Component
public class MainRunner implements ApplicationRunner{

	@Autowired DipendenteService dipendenteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Wait for it...");
		
	//DIPENDENTI
	
		//creo nuovo dipendente
		
		dipendenteService.createDipendenteRandom();
		//dipendenteService.createDipendenteAdmin();
	}

}
