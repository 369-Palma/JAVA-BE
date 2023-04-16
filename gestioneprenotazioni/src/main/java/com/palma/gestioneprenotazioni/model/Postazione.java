package com.palma.gestioneprenotazioni.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Entity
@Table(name="postazioni")
public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	@Builder.Default
	private Boolean occupato = false;
	private Integer numeroMax;
	@ManyToOne(cascade=CascadeType.ALL)
	private Edificio edificio;
	@ManyToOne
	private Prenotazione prenotazione;
	
	
	//costruttore con tutti gli argomenti tranne l'id
	public Postazione(String descrizione, TipoPostazione tipo, Integer numeroMax, Edificio edificio) {
		super();
		this.descrizione = descrizione;
		this.tipo = tipo;
		this.numeroMax = numeroMax;
		this.edificio = edificio;
	}


}
