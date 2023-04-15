package com.palma.gestioneprenotazioni.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name="utenti")

public class Utente {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String username;
private String fullName;
private String email;
//private Boolean prenotato;
@OneToOne(cascade=CascadeType.ALL)
private Postazione postazione;


//costruttore con tutti gli argomenti tranne l'id
public Utente(String username, String fullName, String email, Postazione postazione) {
	super();
	this.username = username;
	this.fullName = fullName;
	this.email = email;
	this.postazione = postazione;
}

}

