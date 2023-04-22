package com.palma.gestione_dispositivi.controller;

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

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.services.DispositivoService;

@RestController
@RequestMapping("/api/dispositivo")
public class DispositivoController {

@Autowired DispositivoService dispositivoService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<List<Dispositivo>>(dispositivoService.getAllDipendenti(), HttpStatus.OK);
	}
	
	@GetMapping("/pageable")
	public ResponseEntity<Page<Dispositivo>> getAllPageable(Pageable pageable) {
		return new ResponseEntity<Page<Dispositivo>>(dispositivoService.getAllDispositivoPageable(pageable), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDispositivo(@PathVariable Long id){
		return new ResponseEntity<Dispositivo>(dispositivoService.getDispositivo(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createDispositivo(@RequestBody Dispositivo Dispositivo) {
		return new ResponseEntity<Dispositivo>(dispositivoService.createDispositivo(Dispositivo), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDispositivo(@PathVariable Long id){
		return new ResponseEntity<String>(dispositivoService.removeDispositivo(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDispositivo(@RequestBody Dispositivo Dispositivo) {
		return new ResponseEntity<Dispositivo>(dispositivoService.updateDispositivo(Dispositivo), HttpStatus.CREATED);

	}
}
