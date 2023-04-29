package com.palma.gestione_incendi.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class ComunicazioneHttp extends CanaleDiComunicazione{
	
	private static final Logger l = LoggerFactory.getLogger(ComunicazioneHttp.class);
	private String baseUrl;
	
	public void giveUrl(Long id, double lat, double lon, int smokeLevel) {
		l.info("Informazioni Sonda: {} - id: {} - lat: {} - lon: {} - intensità fumo: {}", id, lat, lon, smokeLevel);
		String url = this.baseUrl + "?=idsonda=" + id + "&lat=" + lat + "&lon=" + lon + "&smokelevel=" + smokeLevel;
		l.info("Call: {}", url);
	}
}
