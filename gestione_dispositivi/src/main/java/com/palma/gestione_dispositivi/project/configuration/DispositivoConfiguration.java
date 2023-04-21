package com.palma.gestione_dispositivi.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.palma.gestione_dispositivi.project.model.Dispositivo;
import com.palma.gestione_dispositivi.project.model.Stato;
import com.palma.gestione_dispositivi.project.model.TipoDispositivo;

@Configuration
public class DispositivoConfiguration {

	@Bean("Smartphone")
	@Scope("prototype")
	public Dispositivo newSmartphone() {
		return Dispositivo.builder()				
				.type(TipoDispositivo.smartphone)
				.stato(Stato.DISPONIBILE)
				.build();
	}
	
	@Bean("Laptop")
	@Scope("prototype")
	public Dispositivo newLaptop() {
		return Dispositivo.builder()			
				.type(TipoDispositivo.laptop)
				.stato(Stato.DISPONIBILE)
				.build();
	}
	
	
	@Bean("Tablet")
	@Scope("prototype")
	public Dispositivo newTablet() {
		return Dispositivo.builder()				
				.type(TipoDispositivo.tablet)
				.stato(Stato.DISPONIBILE)
				.build();
	}
	
	@Bean("LaptopManutenzione")
	@Scope("prototype")
	public Dispositivo newLaptopManutenzione() {
		return Dispositivo.builder()				
				.type(TipoDispositivo.laptop)
				.stato(Stato.IN_MANUTENZIONE)
				.build();
	}
	
	@Bean("TabletManutenzione")
	@Scope("prototype")
	public Dispositivo newTabletManutenzione() {
		return Dispositivo.builder()				
				.type(TipoDispositivo.tablet)
				.stato(Stato.IN_MANUTENZIONE)
				.build();
	}
}
