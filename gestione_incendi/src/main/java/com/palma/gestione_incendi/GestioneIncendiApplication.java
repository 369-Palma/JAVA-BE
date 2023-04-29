package com.palma.gestione_incendi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.palma.gestione_incendi.design.patterns.Sonda;

@SpringBootApplication
public class GestioneIncendiApplication {

	private static Sonda sondaBari;
	
	public static void main(String[] args) {
		SpringApplication.run(GestioneIncendiApplication.class, args);
		sondaBari = new Sonda(22l, 14.3233124, 7.3212345,6);
		if(sondaBari.getSmokeLevel() > 5) {
			System.out.println("EMERGENZA INCENDIO - Centro di controllo di BARI");
		}
	}
	
}
