package com.palma.servizio_producer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palma.servizio_producer.model.Persona;
import com.palma.servizio_producer.service.PersonaService;

@RestController
@RequestMapping("/app")
public class PersonaController {

	@Autowired PersonaService pservice;
	
	@GetMapping("/data1")
	public String test() {
		return "Test response!";
	}
	
	@GetMapping("/data2")
	public List<Persona> stampaListaPersone() {
		return pservice.getListaPersone();
	}
	
	@GetMapping(value="/data3", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Persona> listaPersone() {
		return pservice.getListaPersone();
	}

}
