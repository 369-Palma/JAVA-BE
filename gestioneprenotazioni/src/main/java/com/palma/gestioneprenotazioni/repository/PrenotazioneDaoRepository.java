package com.palma.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palma.gestioneprenotazioni.model.Prenotazione;

@Repository
public interface PrenotazioneDaoRepository extends CrudRepository <Prenotazione, Long> {

	
}
