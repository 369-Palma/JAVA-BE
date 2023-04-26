package com.palma.servizio_producer.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.servizio_producer.model.Persona;
import com.palma.servizio_producer.repository.PersonaDaoRepository;

@Service
public class PersonaService {

@Autowired PersonaDaoRepository repo;
@Autowired @Qualifier("RandomPerson") private ObjectProvider <Persona> randomPersonaProvider;

public void generaPersone() {	 
	createPersona(randomPersonaProvider.getObject());	
}


//per API

public List<Persona> getListaPersone() {
	return (List<Persona>) repo.findAll();
}

public Persona createPersona(Persona p) {
	System.out.println("aggiunta persona");
	return repo.save(p);
}

}
