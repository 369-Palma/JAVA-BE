package com.palma.gestione_dispositivi.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestione_dispositivi.model.Dipendente;
import com.palma.gestione_dispositivi.repository.DipendenteDaoRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class DipendenteService {

	@Autowired DipendenteDaoRepository repo;
	
	@Autowired @Qualifier("RandomDipendente") private ObjectProvider <Dipendente> randomUtenteProvider;
	@Autowired @Qualifier("AdminDipendente") private ObjectProvider <Dipendente> adminUtenteProvider;
	
	//creo dipendente
	public void createDipendenteRandom() {
		createDipendente(randomUtenteProvider.getObject());
	}
	
	public void createDipendenteAdmin() {
		createDipendente(adminUtenteProvider.getObject());
	}
		
		
		
		
		//API METHODS
		
		//aggiungi 
		public Dipendente createDipendente(Dipendente d) {
		if(repo.existsByEmail(d.getEmail())) {
			throw new EntityExistsException("Email exists!!!");
		} else {
			repo.save(d);
			System.out.println("Dipendente aggiunto!");
		}
		return d;
	}
	
}
