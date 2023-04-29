package com.palma.gestione_incendi.design.patterns;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sonda extends Subject{
	
private Long Id;
private double latitudine;
private double longitudine;
private int smokeLevel;


//Tutti i setter
public void setSmokeLevel(int sl) {
	this.smokeLevel = sl;
	
	if(smokeLevel > 5) {
		super.notifyObservers();
	}
}

public void setId(Long id) {
	Id = id;
}

public void setLatitudine(double latitudine) {
	this.latitudine = latitudine;
}

public void setLongitudine(double longitudine) {
	this.longitudine = longitudine;
}

}
