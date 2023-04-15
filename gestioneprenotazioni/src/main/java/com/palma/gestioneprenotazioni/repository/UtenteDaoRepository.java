package com.palma.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palma.gestioneprenotazioni.model.Utente;

@Repository
public interface UtenteDaoRepository extends CrudRepository <Utente, Long> {

}
