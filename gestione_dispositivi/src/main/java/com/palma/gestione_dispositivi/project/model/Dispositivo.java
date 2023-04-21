package com.palma.gestione_dispositivi.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data 
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder

	@Entity	
	@Table(name="dipendenti")
	public class Dispositivo {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(nullable = false)
		@Enumerated
		private TipoDispositivo type;
		@Enumerated
		private Stato stato;
	
	}
	
	

