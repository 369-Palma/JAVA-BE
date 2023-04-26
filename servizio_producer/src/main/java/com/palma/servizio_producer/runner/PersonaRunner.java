package com.palma.servizio_producer.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.palma.servizio_producer.service.PersonaService;

@Component
public class PersonaRunner implements ApplicationRunner{
@Autowired PersonaService personaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Run ...");
		
		//aggiungo 5 persone random
//		for(int i=0; i<5; i++) {
//		personaService.generaPersone();		
//		}
	}

}
