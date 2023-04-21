//package com.palma.gestione_dispositivi.project.model;
//
//import java.util.List;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data 
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//
//@Entity
//@Table(name="dipendenti")
//public class Dipendente {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@Column(nullable = false)
//	private String username;
//	@Column(nullable = false)
//	private String fullName;
//	@Column(nullable = false, unique = true)
//	private String email;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="dipendente_id")
//	private List <Dispositivo> dispositivi;
//	
//	
//}
