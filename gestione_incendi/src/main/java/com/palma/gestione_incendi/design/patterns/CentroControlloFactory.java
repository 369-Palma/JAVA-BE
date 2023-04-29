package com.palma.gestione_incendi.design.patterns;

import lombok.AllArgsConstructor;
import lombok.Data;
//gestisco il progetto prevedendo l'introduzione futura di altri centri di controllo

@Data
@AllArgsConstructor

public class CentroControlloFactory {
	
	private static int centroControllo = 0;
	
	public static CentroControlloInterface getCentroControllo() {
		
		switch(centroControllo) {
		case 0:
			return new CentroControlloHttp();
			default:
				throw new RuntimeException("Centro di controllo assente");
		}
	}
}
