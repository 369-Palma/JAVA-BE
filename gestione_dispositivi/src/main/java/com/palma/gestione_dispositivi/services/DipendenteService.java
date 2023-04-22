package com.palma.gestione_dispositivi.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.palma.gestione_dispositivi.model.Dipendente;
import com.palma.gestione_dispositivi.repository.DipendenteDaoRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

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
		
		public List<Dipendente> getAllDipendenti() {
			return (List<Dipendente>) repo.findAll();
		}
		
//		public Page<Dipendente> getAllDipendentePageable(Pageable pageable) {
//			return (Page<Dipendente>) repoPageable.findAll(pageable);
//		}
		
		public Dipendente getDipendente(Long id) {
			if(!repo.existsById(id)) {
				throw new EntityNotFoundException("Dipendente not exists!");
			}
			return repo.findById(id).get();
		}
		
		
		public String removeDipendente(Long id) {
			if(!repo.existsById(id)) {
				throw new EntityExistsException("Dipendente not exists!");
			}
			repo.deleteById(id);
			return "Dipendente Deleted!";
		}
		
		public Dipendente updateDipendente(Dipendente Dipendente) {
			if(!repo.existsById(Dipendente.getId())) {
				throw new EntityExistsException("Dipendente not exists!");
			}
			repo.save(Dipendente);
			return Dipendente;
		}
	
}
