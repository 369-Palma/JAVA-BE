package com.palma.gestioneprenotazioni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity 
@Table(name="edifici")
public class Edificio {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String indirizzo;
	private String citta;
	@Column(nullable = false, length = 8)
	@Convert(converter = com.palma.gestioneprenotazioni.configuration.SecretCodeConverter.class)
	private String secretCode;

	//costruttore con tutti gli argomenti tranne l'id
	
	public Edificio(String nome, String indirizzo, String citta) {
		super();
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}
}
