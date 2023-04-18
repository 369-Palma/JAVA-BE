package com.palma.gestioneprenotazioni.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;



@Service
public class IstruzioniService {

	@Value("${gestioneprenotazioni.istruzioniInglese}")
	private String istruzioniInglese;
	@Value("${gestioneprenotazioni.istruzioniItaliano}")
	private String istruzioniItaliano;
	@Value("${gestioneprenotazioni.istruzioniErrore}")
	private String istruzioniErrore;
	
	public String getIstruzioni(@PathVariable String lingua) {
		if("italiano".equals(lingua)) {
			System.out.println("Hei scelto italiano");
		return istruzioniItaliano;
	} else if ("inglese".equals(lingua)) {
		System.out.println("Hei scelto inglese");
		return istruzioniInglese;
	} else {
		System.out.println("Scelta non valida. Si prega di scegliere tra italiano e inglese");
		return istruzioniErrore;
	}
	}
}
