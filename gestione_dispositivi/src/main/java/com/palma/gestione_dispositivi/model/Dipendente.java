package com.palma.gestione_dispositivi.model;

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
	
}
