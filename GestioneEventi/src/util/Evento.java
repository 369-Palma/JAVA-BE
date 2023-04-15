

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@NoArgsConstructor

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
	
}
