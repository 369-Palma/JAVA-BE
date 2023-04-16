package com.palma.gestioneprenotazioni.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestioneprenotazioni.model.Prenotazione;
import com.palma.gestioneprenotazioni.repository.PrenotazioneDaoRepository;

@Service
public class PrenotazioneService {
	@Autowired private PrenotazioneDaoRepository repository;
	
	@Autowired @Qualifier("PrenotazioneCustom") private ObjectProvider <Prenotazione> randomPrenotazioneProvider;
	
	public void createPrenotazioneCustom() {
		createPrenotazione(randomPrenotazioneProvider.getObject(true, LocalDate.of(2023, 04, 18)));
	}
	
	// ************JPA METHODS*************
	
		///aggiungere oggetto
		private void createPrenotazione(Prenotazione p) {
			repository.save(p);
			System.out.println("Prenotazione aggiunta correttamente!");
		}
		
		//leggere oggetto con un id specifico

		public Prenotazione findPrenotazioneById(Long id) {
			return repository.findById(id).get();
		}

		//leggere una lista

		public List <Prenotazione> findAllPrenotazioni() {
			return  (List<Prenotazione>) repository.findAll();
		}

		//rimuovere un oggetto con uno specifico id

		public void removePrenotazione(Prenotazione p) {
			repository.delete(p);
			System.out.println("Prenotazione eliminata correttamente!");
		}

		//aggiornare un oggetto

		public void updatePrenotazione(Prenotazione p) {
			repository.save(p);
			System.out.println("Aggiornamento dati della Prenotazione completato!");
		}
}
