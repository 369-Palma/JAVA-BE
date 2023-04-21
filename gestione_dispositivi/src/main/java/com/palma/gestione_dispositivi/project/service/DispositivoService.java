package com.palma.gestione_dispositivi.project.service;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestione_dispositivi.project.model.Dispositivo;
import com.palma.gestione_dispositivi.project.repository.DispositivoDaoRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class DispositivoService {

	@Autowired DispositivoDaoRepository repo;
	@Autowired @Qualifier("Smartphone") private ObjectProvider <Dispositivo> smartphoneProvider;
	@Autowired @Qualifier("Laptop") private ObjectProvider <Dispositivo> laptopProvider;
	@Autowired @Qualifier("tablet") private ObjectProvider <Dispositivo> tabletProvider;
	
	@Autowired @Qualifier("LaptopManutenzione") private ObjectProvider <Dispositivo> LaptopManutenzioneProvider; 
	//Aggiungo nuovi dispositivi al db
	
	public void createDispositivoSmartphone() {
		createDispositivo(smartphoneProvider.getObject());	
	}
	
	public void createDispositivoLaptop() {
		createDispositivo(laptopProvider.getObject());	
	}
	
	public void createDispositivoTablet() {
		createDispositivo(tabletProvider.getObject());	
	}
	
	public void createLaptopManutenzione() {
		createDispositivo(LaptopManutenzioneProvider.getObject());	
	}
	
	
	
	//METODI API
	public List<Dispositivo> getAllDispositivo() {
		return (List<Dispositivo>) repo.findAll();
	}
	
	
	public Dispositivo getDispositivo(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityNotFoundException("Dispositivo not exists!!!");
		}
		return repo.findById(id).get();
	}
	
	public Dispositivo createDispositivo(Dispositivo Dispositivo) {
			return repo.save(Dispositivo);
		}
		
	
	public String removeDispositivo(Long id) {
		if(!repo.existsById(id)) {
			throw new EntityExistsException("Dispositivo not exists!!!");
		}
		repo.deleteById(id);
		return "Dispositivo Deleted!!!";
	}
	
	public Dispositivo updateDispositivo(Dispositivo Dispositivo) {
		if(!repo.existsById(Dispositivo.getId())) {
			throw new EntityExistsException("Dispositivo not exists!!!");
		}
		repo.save(Dispositivo);
		return Dispositivo;
	}

}
