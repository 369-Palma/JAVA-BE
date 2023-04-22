package com.palma.gestione_dispositivi.model;

import java.util.List;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dipendenti")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Dipendente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false)
	private String fullname;
	@Column(nullable = false, unique = true)
	private String email;
	
	@OneToMany(mappedBy = "dipendente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name = "id_dipendente", referencedColumnName = "dipendente Id")
	// @JsonIgnoreProperties("dispositivi")
	private List <Dispositivo> dispositivi;
	
}
