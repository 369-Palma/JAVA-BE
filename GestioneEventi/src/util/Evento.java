

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.*;

// @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
@SuppressWarnings("serial")
@Entity @Table(name = "Eventi")
public class Evento implements Serializable{
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	@Column (nullable = false)	
	private Long id;	
	@Column (nullable = false)
	private String titolo;
	@Column (nullable = false)
	private LocalDate dataEvento;
	@Column (nullable = false)
	private String descrizione;
	@Column (nullable = false)
	@Enumerated (EnumType.STRING)
	private TipoEvento tipoEvento;
	@Column (nullable = false)
	private Integer numeroMassimoPartecipanti;
	
	//COSTRUTTORI
	//costruttore completo
	
	//public Evento() {};
	
//	public Evento(Long id, String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
//			Integer numeroMassimoPartecipanti) {
//		
//		this.id = id;
//		this.titolo = titolo;
//		this.dataEvento = dataEvento;
//		this.descrizione = descrizione;
//		this.tipoEvento = tipoEvento;
//		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
//	}
//	
//	//costruttore senza id
//	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
//			Integer numeroMassimoPartecipanti) {
//		
//		this.titolo = titolo;
//		this.dataEvento = dataEvento;
//		this.descrizione = descrizione;
//		this.tipoEvento = tipoEvento;
//		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
//	}
//	
	//METODI
	//setters and getters 
	public Long getId() {
		return id;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate localDate) {
		this.dataEvento = localDate;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public Integer getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}
	public void setNumeroMassimoPartecipanti(Integer numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	// toString
	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}
	
	
	
}
