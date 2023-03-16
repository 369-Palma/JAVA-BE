package u1.w1.d2.Es3;

public class Carrello {
//proprietà
	private Cliente clienteAssociato;
	private Articolo[] articoli;
	private double totCostoArt;

// metodi e funzioni
	public Cliente getClienteAssociato() {
		return clienteAssociato;
	}
	public void setClienteAssociato(Cliente clienteAssociato) {
		this.clienteAssociato = clienteAssociato;
	}
	
	public double getTotCostoArt() {
		return totCostoArt;		
	}	
	public void setTotCostoArt(double totCostoArt) {
		this.totCostoArt=totCostoArt;
	}
	
}
