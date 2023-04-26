package com.palma.sservizio_consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class ServizioController {
	
	@GetMapping("/data1")
	public String test() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8082/app/data1";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		return "Test consumer: " + response.getBody();
	}
	
	@GetMapping("/data2")
	public Object listaPersone() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8082/app/data2";
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		return response;
	}
	
	@GetMapping("/data3")
	public Object elencoPersone() {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8082/app/data3";
		Object response = rt.getForObject(url, Object.class);
		return response;
	}
	
	
}
