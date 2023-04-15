package com.palma.gestioneprenotazioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.palma.gestioneprenotazioni.services.EdificioService;

@Component
public class EdificioRunner implements ApplicationRunner{
	
@Autowired EdificioService edificioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Wait for it...");
		
		//edificioService.createCustomBuilding();	
		edificioService.createCustomBuilding2();
		edificioService.createRandomBuilding();
	}
	
}
