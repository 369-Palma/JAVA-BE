package com.palma.gestioneprenotazioni.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palma.gestioneprenotazioni.services.IstruzioniService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class InformazioniPrenotazione {

	@Autowired IstruzioniService istruzioniService;
	
	@GetMapping(path = "/istruzioni/{language}")
	public ResponseEntity<String> getInfo(@PathVariable String language) {
		String istruzioni = istruzioniService.getIstruzioni(language);
		return new ResponseEntity<>(istruzioni, HttpStatus.OK);
	}
	

}


