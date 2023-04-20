package com.palma.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.palma.gestioneprenotazioni.model.Edificio;
import com.palma.gestioneprenotazioni.model.Utente;
import com.palma.gestioneprenotazioni.repository.EdificioDaoRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class EdificioService {
	
@Autowired private EdificioDaoRepository r;
@Autowired @Qualifier("RandomBuilding") private ObjectProvider <Edificio> randomBuildingProvider;
@Autowired @Qualifier("CustomBuilding") private ObjectProvider <Edificio> customBuildingProvider;

//Creo nuovi EDIFICI
public void createRandomBuilding() {
	createBuilding(randomBuildingProvider.getObject());	
}

public void createCustomBuilding() {

	createBuilding(customBuildingProvider.getObject("Lungomare Nazario Sauro 78", "Bari"));	createBuilding(customBuildingProvider.getObject("Via Putignani 121", "Bari"));
}

public void createCustomBuilding2() {	//createBuilding(customBuildingProvider.getObject("Lungomare Nazario Sauro 78", "Bari"));
	createBuilding(customBuildingProvider.getObject("Via Putignani 121", "Bari"));
}




// ************JPA METHODS*************

//aggiungere oggetto
public Edificio createBuilding(Edificio edificio) {
	if(r.existsByIndirizzo(edificio.getIndirizzo())) {
		throw new EntityExistsException("This address already exist!!!");
	} else {
	r.save(edificio);
	//System.out.println("Edificio aggiunto correttamente!");
	}
	return edificio;
}


//ricerca per città
public List <Edificio> findByCity(String city) {
	return r.findByCitta(city);
}

		
//leggere oggetto con un id specifico

public Edificio findBuildingById(Long id) {
	return r.findById(id).get();
}

//leggere una lista

public List <Edificio> findAllBuildings() {
	return  (List<Edificio>) r.findAll();
}

//leggere una lista con pageable
//
//public Page <Edificio> findAllBuildingsPageble(Pageable pageable) {
//	return (Page<Edificio>) r.findAll(pageable);
//}

//rimuovere un oggetto con uno specifico id

public String removeBuilding(Long id) {
	if(!r.existsById(id)) {
		throw new EntityExistsException("L' edificio non esiste!");
	} else {
	r.deleteById(id);
	//System.out.println("Edificio eliminato correttamente!");
	}
	return "L'Edificio indicato è stato rimosso!";	
}

//aggiornare un oggetto

public Edificio updateBuilding(Edificio edificio) {
	if(!r.existsById(edificio.getId())) {
		throw new EntityExistsException("L' edificio non esiste!");
	} else {
		r.save(edificio);
		//System.out.println("Aggiornamento dati dell'edificio completato!");
	}
	return edificio;
	
}

}
