package com.palma.gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestioneprenotazioni.model.Edificio;
import com.palma.gestioneprenotazioni.repository.EdificioDaoRepository;

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
public void createBuilding(Edificio edificio) {
	r.save(edificio);
	System.out.println("Edificio aggiunto correttamente!");
}

//leggere oggetto con un id specifico

public Edificio findBuildingById(Long id) {
	return r.findById(id).get();
}

//leggere una lista

public List <Edificio> findAllBuildings() {
	return  (List<Edificio>) r.findAll();
}

//rimuovere un oggetto con uno specifico id

public void removeBuilding(Edificio edificio) {
	r.delete(edificio);
	System.out.println("Edificio eliminato correttamente!");
}

//aggiornare un oggetto

public void updateBuilding(Edificio edificio) {
	r.save(edificio);
	System.out.println("Aggiornamento dati dell'edificio completato!");
}

}
