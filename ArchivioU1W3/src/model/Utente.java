//package model;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
////import lombok.Getter;
////import lombok.Setter;
//
//// @Getter @Setter 
//@Entity @Table(name = "utenti")
//
//public class Utente extends Pubblicazione{
//	@GeneratedValue (strategy = GenerationType.IDENTITY)
//	
//	private String nome;
//	private String cognome;
//	private LocalDate dataNascita;
//
//	private Long numeroTessera;
//
//	
//	//costruttore vuoto
//	public Utente() {}
//
//
//	public String getNome() {
//		return nome;
//	}
//
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//
//	public String getCognome() {
//		return cognome;
//	}
//
//
//	public void setCognome(String cognome) {
//		this.cognome = cognome;
//	}
//
//
//	public LocalDate getDataNascita() {
//		return dataNascita;
//	}
//
//
//	public void setDataNascita(LocalDate dataNascita) {
//		this.dataNascita = dataNascita;
//	}
//
//
//	public Long getNumeroTessera() {
//		return numeroTessera;
//	}
//
//
//	public void setNumeroTessera(Long numeroTessera) {
//		this.numeroTessera = numeroTessera;
//	};
//
//	
//	
//	
//}
