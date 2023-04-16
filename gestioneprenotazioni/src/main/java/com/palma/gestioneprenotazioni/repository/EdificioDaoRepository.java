package com.palma.gestioneprenotazioni.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palma.gestioneprenotazioni.model.Edificio;


@Repository
public interface EdificioDaoRepository extends CrudRepository <Edificio, Long>{
	
	
		
		//Ricerca Edificio per città
	public List<Edificio> findByCitta(String city);
	
	//oppure tramite query...in caso volessi cercare in più città
//@Query(value="SELECT e FROM Edificio E WHERE E.citta IN ('Bari')") 
	//public List<Edificio> findByCittaInB();
	
	//Ricerca per tipo di postazione
	//public List<Postazione> findByType(TipoPostazione tipo);
}
