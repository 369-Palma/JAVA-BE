package com.palma.gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.palma.gestioneprenotazioni.model.Postazione;
import com.palma.gestioneprenotazioni.model.TipoPostazione;

@Repository
public interface PostazioneDaoRepository extends CrudRepository <Postazione, Long> { 

//Ricerca per tipo di postazione
 public List<Postazione> findByTipo(TipoPostazione tipo);
	
}
