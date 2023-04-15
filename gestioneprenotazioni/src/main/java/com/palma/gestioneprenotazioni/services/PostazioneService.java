package com.palma.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestioneprenotazioni.model.Postazione;
import com.palma.gestioneprenotazioni.repository.PostazioneDaoRepository;

@Service
public class PostazioneService {
	@Autowired private PostazioneDaoRepository repository;
	
	@Autowired @Qualifier("PostazioneSalaRiunioni") private ObjectProvider <Postazione> postazioneSRProvider;
	@Autowired @Qualifier("PostazionePrivata") private ObjectProvider <Postazione> postazionePrivataProvider;
	@Autowired @Qualifier("PostazioneOpenSpace") private ObjectProvider <Postazione> postazioneOpenSProvider;
	
	// Per creare nuove POSTAZIONI
	
	public void createPostazioneSR() {
		createPostazione(postazioneSRProvider.getObject());
	}

	public void createPostazionePrivata() {
		createPostazione(postazionePrivataProvider.getObject());
	}

	public void createPostazioneOpenSpace() {
		createPostazione(postazioneOpenSProvider.getObject());
	}
	
	// ************JPA METHODS*************
	
	///aggiungere oggetto
	private void createPostazione(Postazione postazione) {
		repository.save(postazione);
		System.out.println("Postazione aggiunta correttamente!");
	}
	
	//leggere oggetto con un id specifico

	public Postazione findPostazioneById(Long id) {
		return repository.findById(id).get();
	}

	//leggere una lista

	public List <Postazione> findAllPostazioni() {
		return  (List<Postazione>) repository.findAll();
	}

	//rimuovere un oggetto con uno specifico id

	public void removePostazione(Postazione Postazione) {
		repository.delete(Postazione);
		System.out.println("Postazione eliminata correttamente!");
	}

	//aggiornare un oggetto

	public void updatePostazione(Postazione Postazione) {
		repository.save(Postazione);
		System.out.println("Aggiornamento dati della Postazione completato!");
	}

}

