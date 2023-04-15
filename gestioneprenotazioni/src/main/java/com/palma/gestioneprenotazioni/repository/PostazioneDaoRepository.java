package com.palma.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.palma.gestioneprenotazioni.model.Postazione;

@Repository
public interface PostazioneDaoRepository extends CrudRepository <Postazione, Long> { 

}
