package com.palma.gestioneprenotazioni.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palma.gestioneprenotazioni.model.Edificio;


@Repository
public interface EdificioDaoRepository extends CrudRepository <Edificio, Long>{
	
	//Ricerca Edificio per città
	//public List<Edificio> findByCity(String city);
	
	//Ricerca per tipo di postazione
	//public List<Postazione> findByType(TipoPostazione tipo);
}
