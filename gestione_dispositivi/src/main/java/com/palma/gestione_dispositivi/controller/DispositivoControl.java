package com.palma.gestione_dispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.services.DispositivoService;

public class DispositivoControl {

@Autowired DispositivoService DispositivoService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Dispositivo>>(DispositivoService.getAllDipendenti(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDispositivo(@PathVariable Long id){
		return new ResponseEntity<Dispositivo>(DispositivoService.getDispositivo(id), HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<?> createDispositivo(@RequestBody Dispositivo Dispositivo) {
		return new ResponseEntity<Dispositivo>(DispositivoService.createDispositivo(Dispositivo), HttpStatus.CREATED);

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDispositivo(@PathVariable Long id){
		return new ResponseEntity<String>(DispositivoService.removeDispositivo(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDispositivo(@RequestBody Dispositivo Dispositivo) {
		return new ResponseEntity<Dispositivo>(DispositivoService.updateDispositivo(Dispositivo), HttpStatus.CREATED);

	}
}
