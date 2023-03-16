package u1.w1.d2.Es2;

public class Chiamata {
//proprietà
	private String numeroChiamato;
	private int durataMin;
	
	//contructor	
	public Chiamata(String numero, int durata){
		this.numeroChiamato = numero;
		this.durataMin = durata;
	}
	
	//metodi
	public String getNumChiamato() {
		return numeroChiamato;
	}
	public void setNumChiamato(String numeroChiamato) {
		this.numeroChiamato = numeroChiamato;
	}
	public long getDurataCall() {
		return durataMin;
	}
	public void setDurataMin(int durataMin) {
		this.durataMin=durataMin;
	}
}
