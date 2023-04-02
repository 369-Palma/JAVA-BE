package model;

import java.io.Serializable;

import javax.persistence.*;

import ArchivioDEO.DEOarchivio;

@NamedQuery(name = "Pubblicazioni.FindAll", query = "SELECT p FROM Pubblicazione p")
@Entity @Table(name = "pubblicazioni")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TipoPublicazione", discriminatorType = DiscriminatorType.STRING)

public abstract class Pubblicazione implements Serializable{
	
	
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	private Long ISBN;		
	private String titolo;
	private Integer annoPublicazione;
	private Integer numeroPagine;
	
	//costruttori
	
	public Pubblicazione() {};
	
	public Pubblicazione(String titolo,Integer annoPublicazione,Integer numeroPagine) {
		super();
		this.titolo = titolo;
		this.annoPublicazione = annoPublicazione;
		this.numeroPagine = numeroPagine;		
		
	}

	//getters e setters
	
	public Long getISBN() {
		return ISBN;
	}


	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getAnnoPublicazione() {
		return annoPublicazione;
	}

	public void setAnnoPublicazione(Integer annoPublicazione) {
		this.annoPublicazione = annoPublicazione;
	}

	public Integer getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(Integer numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	//toString
	
	@Override
	public String toString() {
		return "Pubblicazione [ISBN=" + ISBN + ", titolo=" + titolo + ", annoPublicazione=" + annoPublicazione
				+ ", numeroPagine=" + numeroPagine + "]";
	}

	protected abstract char[] getAutore();
	
	
	}

	
	
	
	

