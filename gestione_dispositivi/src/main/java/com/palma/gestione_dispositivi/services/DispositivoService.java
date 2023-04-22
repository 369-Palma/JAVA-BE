package com.palma.gestione_dispositivi.services;

import java.util.List;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.repository.DispositivoDaoRepository;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

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
			
			public List<Dispositivo> getAllDipendenti() {
				return (List<Dispositivo>) repository.findAll();
			}
			
//			public Page<Dispositivo> getAllDispositivoPageable(Pageable pageable) {
//				return (Page<Dispositivo>) repositoryPageable.findAll(pageable);
//			}
			
			public Dispositivo getDispositivo(Long id) {
				if(!repository.existsById(id)) {
					throw new EntityNotFoundException("Dispositivo not exists!");
				}
				return repository.findById(id).get();
			}
			
			
			public String removeDispositivo(Long id) {
				if(!repository.existsById(id)) {
					throw new EntityExistsException("Dispositivo not exists!");
				}
				repository.deleteById(id);
				return "Dispositivo Deleted!";
			}
			
			public Dispositivo updateDispositivo(Dispositivo Dispositivo) {
				if(!repository.existsById(Dispositivo.getId())) {
					throw new EntityExistsException("Dispositivo not exists!");
				}
				repository.save(Dispositivo);
				return Dispositivo;
			}
		
	
}
