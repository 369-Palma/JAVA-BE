//package model;
//
//import java.time.LocalDate;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
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
//
//
//@Entity @Table(name = "utenti")
//
//public class Utente {
//	
//	//@OneToMany(mappedBy = "utenti", cascade = CascadeType.ALL)
//	 @OneToMany(targetEntity=Prestito.class)
//	private Set <Prestito> listaPrestiti;
//	private String nome;
//	private String cognome;
//	private LocalDate dataNascita;
//@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
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
