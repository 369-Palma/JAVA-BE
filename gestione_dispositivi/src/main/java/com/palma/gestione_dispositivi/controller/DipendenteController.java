package com.palma.gestione_dispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.palma.gestione_dispositivi.model.Dipendente;
import com.palma.gestione_dispositivi.services.DipendenteService;

public class DipendenteController {

	

	@Autowired DipendenteService dipendenteService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Dipendente>>(dipendenteService.getAllDipendenti(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDipendente(@PathVariable Long id){
		return new ResponseEntity<Dipendente>(dipendenteService.getDipendente(id), HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<?> createDipendente(@RequestBody Dipendente Dipendente) {
		return new ResponseEntity<Dipendente>(dipendenteService.createDipendente(Dipendente), HttpStatus.CREATED);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDipendente(@PathVariable Long id){
		return new ResponseEntity<String>(dipendenteService.removeDipendente(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDipendente(@RequestBody Dipendente Dipendente) {
		return new ResponseEntity<Dipendente>(dipendenteService.updateDipendente(Dipendente), HttpStatus.CREATED);

	}
}
