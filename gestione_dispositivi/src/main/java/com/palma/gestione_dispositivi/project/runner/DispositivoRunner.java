package com.palma.gestione_dispositivi.project.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.palma.gestione_dispositivi.project.service.DispositivoService;

@Component
public class DispositivoRunner implements ApplicationRunner {

	@Autowired DispositivoService dispService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Wait for it...");
		//DISPOSITIVI
		dispService.createDispositivoSmartphone();
		dispService.createDispositivoLaptop();
		dispService.createDispositivoTablet();
		dispService.createLaptopManutenzione();
		
	//DIPENDENTI
		
	}

}
