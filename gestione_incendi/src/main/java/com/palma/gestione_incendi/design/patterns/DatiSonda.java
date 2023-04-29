package com.palma.gestione_incendi.design.patterns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class DatiSonda {
	
	private final Long Id;
	private final double latitudine;
	private final double longitudine;
	private final int smokeLevel;
	
}
