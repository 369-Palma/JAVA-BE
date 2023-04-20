package com.palma.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.palma.gestioneprenotazioni.model.Utente;
import com.palma.gestioneprenotazioni.repository.UtenteDaoRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class UtenteService {
	@Autowired private UtenteDaoRepository repository;
	@Autowired @Qualifier("RandomUtente") private ObjectProvider <Utente> randomUtenteProvider;

	public void createUtenteRandom() {
		createUtente(randomUtenteProvider.getObject());
	}
	
	
	// ************JPA METHODS*************
	
		///aggiungere oggetto
		public Utente createUtente(Utente u) {
			if(repository.existsByEmail(u.getEmail())) {
				throw new EntityExistsException("This email already exist!!!");
			} else {
			repository.save(u);
			//System.out.println("Utente aggiunto correttamente!");
			}
			return u;
		}
		
		//leggere oggetto con un id specifico

		public Utente findUtenteById(Long id) {
			return repository.findById(id).get();
		}

		//leggere una lista

		public List <Utente> findAllUtenti() {
			return (List<Utente>) repository.findAll();
		}
		
		//tutti gli utenti paginati
		
		public Page <Utente> findAllUtentiPaginable(Pageable pageable) {
			return (Page<Utente>) repository.findAll(pageable);
		}

		//rimuovere un oggetto con uno specifico id

		public String removeUtente(Long id) {
			if(!repository.existsById(id)) {
				throw new EntityExistsException("L'utente non esiste!");
			} else {
			repository.deleteById(id);
			//System.out.println("Utente eliminato correttamente!");
			}			
			return "L'utente indicato è stato rimosso!";			
		}

		//aggiornare un oggetto

		public Utente updateUtente(Utente u) {
			if(!repository.existsById(u.getId())) {
				throw new EntityExistsException("L'utente non esiste!");
			} else {
			repository.save(u);
			//System.out.println("Aggiornamento dati dell' utente completato!");
			return u;
			}
		}
		

	}



