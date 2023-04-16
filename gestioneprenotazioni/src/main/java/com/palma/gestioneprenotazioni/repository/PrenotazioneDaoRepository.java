package com.palma.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;

import com.palma.gestioneprenotazioni.model.Prenotazione;

public interface PrenotazioneDaoRepository extends CrudRepository <Prenotazione, Long> {

}
