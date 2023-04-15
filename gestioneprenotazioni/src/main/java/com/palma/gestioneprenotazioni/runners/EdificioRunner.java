package com.palma.gestioneprenotazioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.palma.gestioneprenotazioni.services.EdificioService;

public class EdificioRunner implements ApplicationRunner{
	
@Autowired EdificioService edificioService;

@Override
public void run(ApplicationArguments args) throws Exception {
	//Creo nuovi EDIFICI
//	edificioService.createCustomBuilding();	
//	edificioService.createCustomBuilding2();
//	edificioService.createRandomBuilding();
	
	
}

}
