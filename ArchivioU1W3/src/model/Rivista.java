package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter @Setter 
@Entity @Table(name = "riviste")
@DiscriminatorValue("Rivista")
public class Rivista extends Pubblicazione {
@GeneratedValue (strategy = GenerationType.IDENTITY)

private Long id_rivista;
@Enumerated (EnumType.STRING)
private Periodicita periodicita;

//costruttore vuoto
public Rivista() {
	super();
}

public Long getId_rivista() {
	return id_rivista;
}

public Periodicita getPeriodicita() {
	return periodicita;
}

public void setPeriodicita(Periodicita periodicita) {
	this.periodicita = periodicita;
};





}