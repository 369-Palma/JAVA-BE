//package model;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter @Setter 
//@Entity @Table(name = "prestiti")
//public class Prestito {
//	
//	@GeneratedValue (strategy = GenerationType.IDENTITY)
//	@ManyToOne @Id
//	private Utente utente;
//	@Enumerated (EnumType.STRING)
//	private ElementoPrestato elementoPrestato;
//	private LocalDate dataInizioPrestito;
//	private LocalDate dataRestituzionePrevista = this.calcolaDataRestituzione();
//	private LocalDate dataRestituzioneEffettiva;
//	
//	//costruttore 
//	public Prestito () {};
//	
//	//getters e setters
//	
//	public Prestito(Utente utente, ElementoPrestato elementoPrestato, LocalDate dataInizioPrestito,
//			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
//		super();
//		this.utente = utente;
//		this.elementoPrestato = elementoPrestato;
//		this.dataInizioPrestito = dataInizioPrestito;
//		this.dataRestituzionePrevista = dataRestituzionePrevista;
//		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
//	}
//
//
//
//	public Utente getUtente() {
//		return utente;
//	}
//
//
//	public void setUtente(Utente utente) {
//		this.utente = utente;
//	}
//
//
//	public ElementoPrestato getElementoPrestato() {
//		return elementoPrestato;
//	}
//
//
//	public void setElementoPrestato(ElementoPrestato elementoPrestato) {
//		this.elementoPrestato = elementoPrestato;
//	}
//
//
//	public LocalDate getDataInizioPrestito() {
//		return dataInizioPrestito;
//	}
//
//
//	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
//		this.dataInizioPrestito = dataInizioPrestito;
//	}
//
//
//	public LocalDate getDataRestituzionePrevista() {
//		return dataRestituzionePrevista;
//	}
//
//
//	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
//		this.dataRestituzionePrevista = dataRestituzionePrevista;
//	}
//
//	
//	public LocalDate getDataRestituzioneEffettiva() {
//		return dataRestituzioneEffettiva;
//	}
//
//	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
//		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
//	}
//
//
//	//metodo per calcolare la data di restituzione prevista
//	public LocalDate calcolaDataRestituzione() {
//		LocalDate restituzione = this.dataInizioPrestito.plusDays(30);
//		return restituzione;
//	}
//	
//}