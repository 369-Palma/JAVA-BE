package com.palma.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestioneprenotazioni.model.Utente;
import com.palma.gestioneprenotazioni.repository.UtenteDaoRepository;

@Service
public class UtenteService {
	@Autowired private UtenteDaoRepository repository;
	@Autowired @Qualifier("RandomUtente") private ObjectProvider <Utente> randomUtenteProvider;

	public void createUtenteRandom() {
		createUtente(randomUtenteProvider.getObject());
	}
	
	
	// ************JPA METHODS*************
	
		///aggiungere oggetto
		private void createUtente(Utente u) {
			repository.save(u);
			System.out.println("Utente aggiunto correttamente!");
		}
		
		//leggere oggetto con un id specifico

		public Utente findUtenteById(Long id) {
			return repository.findById(id).get();
		}

		//leggere una lista

		public List <Utente> findAllPostazioni() {
			return  (List<Utente>) repository.findAll();
		}

		//rimuovere un oggetto con uno specifico id

		public void removeUtente(Utente u) {
			repository.delete(u);
			System.out.println("Utente eliminato correttamente!");
		}

		//aggiornare un oggetto

		public void updateUtente(Utente u) {
			repository.save(u);
			System.out.println("Aggiornamento dati dell' utente completato!");
		}

	}



