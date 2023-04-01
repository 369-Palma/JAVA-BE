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
//	@ManyToOne
//	@GeneratedValue (strategy = GenerationType.IDENTITY)
//	@Id
//	private Utente utente;
//	@Enumerated (EnumType.STRING)
//	private ElementoPrestato elementoPrestato;
//	private LocalDate dataInizioPrestito;
//	private LocalDate dataRestituzionePrevista = this.calcolaDataRestituzione();
//	private LocalDate dataRestituzioneEffettiva;
//	
//	
//	public LocalDate calcolaDataRestituzione() {
//		LocalDate restituzione = this.dataInizioPrestito.plusDays(30);
//		return restituzione;
//	}
//	
//}