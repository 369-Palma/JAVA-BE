package com.palma.gestione_dispositivi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.model.Stato;
import com.palma.gestione_dispositivi.model.TipoDispositivo;

@Configuration
@PropertySource("classpath:application.properties")
public class DispositivoConfiguration {

	@Bean("Smartphone")
	@Scope("prototype")
	public Dispositivo newSmartphone() {
		return Dispositivo.builder()
				.tipo(TipoDispositivo.smartphone)
				.stato(Stato.DISPONIBILE)
				.build();
	}
	
	@Bean("Tablet")
	@Scope("prototype")
	public Dispositivo newTablet() {
		return Dispositivo.builder()
				.tipo(TipoDispositivo.tablet)
				.stato(Stato.DISPONIBILE)
				.build();
	}
	
	@Bean("Laptop")
	@Scope("prototype")
	public Dispositivo newLaptop() {
		return Dispositivo.builder()
				.tipo(TipoDispositivo.laptop)
				.stato(Stato.DISPONIBILE)
				.build();
	}
}
