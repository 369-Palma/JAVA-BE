package com.palma.gestioneprenotazioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.palma.gestioneprenotazioni.services.PostazioneService;

@Component
public class PostazioneRunner implements ApplicationRunner{

	@Autowired PostazioneService postazioneService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		postazioneService.createPostazioneSR();
		
	}
	
	
}
