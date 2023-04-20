package com.palma.gestioneprenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palma.gestioneprenotazioni.model.Utente;
import com.palma.gestioneprenotazioni.services.UtenteService;

@RestController
@RequestMapping("/api/utente")
public class UtenteController {

	@Autowired UtenteService utenteService;
	
	//find all 
	@GetMapping
	public ResponseEntity <List<Utente>> getAllUtenti(){
		return new ResponseEntity <List<Utente>>(utenteService.findAllUtenti(),HttpStatus.OK);
	}
	
	//find all con paginazione
	@GetMapping(path= "/pageable")
	public ResponseEntity <Page<Utente>> getAllPageable(Pageable page){
		return new ResponseEntity <Page<Utente>>(utenteService.findAllUtentiPaginable(page), HttpStatus.NO_CONTENT);
	}
	
	//find by Id
	@GetMapping("/{id}")
	public ResponseEntity<?> getUtente(@PathVariable Long id){
		return new ResponseEntity<Utente>(utenteService.findUtenteById(id), HttpStatus.OK);
	}
	
	//aggiungere utente
	@PostMapping
	public ResponseEntity<?> createUtente(@RequestBody Utente u){
		return new ResponseEntity<Utente> (utenteService.createUtente(u),HttpStatus.CREATED);
	}
	
	//update utente
	@PutMapping
	public ResponseEntity <?> updateUtente(@RequestBody Utente u){
		return new ResponseEntity <Utente> (utenteService.updateUtente(u), HttpStatus.CREATED);
	}
	
	//eliminare utente dall'id
	@DeleteMapping("/{id}")
	public ResponseEntity<?> removeUtente(@PathVariable Long id){
		return new ResponseEntity <String> (utenteService.removeUtente(id), HttpStatus.OK);
	}
	
}
