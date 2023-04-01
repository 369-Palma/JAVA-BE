package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter @Setter 

@Entity @Table(name = "libri")
@DiscriminatorValue("Libro")
public class Libro extends Pubblicazione {
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private Long id_libro;
	private String autore;
	private Genere genere;

//costruttore vuoto
public Libro() {
	super();
}
//getters and setters"
public Long getId_libro() {
	return id_libro;
}

public String getAutore() {
	return autore;
}

public void setAutore(String autore) {
	this.autore = autore;
}

public Genere getGenere() {
	return genere;
}

public void setGenere(Genere genere) {
	this.genere = genere;
};



}

