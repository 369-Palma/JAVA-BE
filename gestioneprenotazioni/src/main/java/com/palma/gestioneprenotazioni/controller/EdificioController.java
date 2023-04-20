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

import com.palma.gestioneprenotazioni.model.Edificio;
import com.palma.gestioneprenotazioni.services.EdificioService;

@RestController
@RequestMapping("/api/edifici")
public class EdificioController {
	
	@Autowired EdificioService edificioService;
	
	//find all 
		@GetMapping
		public ResponseEntity <List<Edificio>> findAllBuildings(){
			return new ResponseEntity <List<Edificio>>(edificioService.findAllBuildings(),HttpStatus.OK);
		}
		
		//find all con paginazione
//		@GetMapping(path= "/pageable")
//		public ResponseEntity <Page<Edificio>> getAllPageable(Pageable page){
//			return new ResponseEntity <Page<Edificio>>(edificioService.findAllBuildingPageable(page), HttpStatus.NO_CONTENT);
//		}
//		
		//find by Id
		@GetMapping("/{id}")
		public ResponseEntity<?> getEdificio(@PathVariable Long id){
			return new ResponseEntity<Edificio>(edificioService.findBuildingById(id), HttpStatus.OK);
		}
		
		//aggiungere Edificio
		@PostMapping
		public ResponseEntity<?> createEdificio(@RequestBody Edificio u){
			return new ResponseEntity<Edificio> (edificioService.createBuilding(u),HttpStatus.CREATED);
		}
		
		//update Edificio
		@PutMapping
		public ResponseEntity <?> updateEdificio(@RequestBody Edificio u){
			return new ResponseEntity <Edificio> (edificioService.updateBuilding(u), HttpStatus.CREATED);
		}
		
		//eliminare Edificio dall'id
		@DeleteMapping("/{id}")
		public ResponseEntity<?> removeEdificio(@PathVariable Long id){
			return new ResponseEntity <String> (edificioService.removeBuilding(id), HttpStatus.OK);
		}
}
