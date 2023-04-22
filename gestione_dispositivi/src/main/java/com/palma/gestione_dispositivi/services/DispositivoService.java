package com.palma.gestione_dispositivi.services;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.repository.DispositivoDaoRepository;

import jakarta.persistence.EntityExistsException;

@Service
public class DispositivoService {
	
	@Autowired DispositivoDaoRepository repository;
	@Autowired @Qualifier("Smartphone") private ObjectProvider <Dispositivo> smartphoneProvider;
	@Autowired @Qualifier("Tablet") private ObjectProvider <Dispositivo> tabletProvider;
	@Autowired @Qualifier("Laptop") private ObjectProvider <Dispositivo> laptopProvider;
	
	//creo dispositivi
	public void createNewSmartphone() {
		createDispositivo(smartphoneProvider.getObject());
	}
	
	public void createNewTablet() {
		createDispositivo(tabletProvider.getObject());
	}
	
	public void createNewLaptop() {
		createDispositivo(laptopProvider.getObject());
	}
	
	//API METHODS
	
			//aggiungi 
			public Dispositivo createDispositivo(Dispositivo d) {
				repository.save(d);
				System.out.println("Dispositivo aggiunto!");
				return d;
			}
	
}
