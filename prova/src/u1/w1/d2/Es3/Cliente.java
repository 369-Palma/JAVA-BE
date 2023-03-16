package u1.w1.d2.Es3;

import java.util.String;

public class Cliente {
//proprietà
	private long codiceCliente;
	private String nome;
	private String cognome;
	private String email;
	private String dataIscrizione;
	
	
//contructor
	public Cliente(long codice, String nome, String cognome, String dataIscrizione, String email) {
		super();
		this.codiceCliente=codice;
		this.nome=nome;
		this.cognome= cognome;
		this.email=email;
		this.dataIscrizione=dataIscrizione;
	}
	
//metodi
	public long getCodiceCliente() {
		return codiceCliente;
	}
	public void setCodiceCliente(long codice) {
		this.codiceCliente=codice;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome=cognome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getDataIscrizione() {
		return dataIscrizione;
	}
	public void setdataIscrizione(String dataIscrizione) {
		this.dataIscrizione=dataIscrizione;
	}
	
	//funzioni
	public void StampaDatiCliente (Cliente) {
	System.out.println(Cliente);
}
}
