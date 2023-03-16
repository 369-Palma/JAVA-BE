package u1.w1.d2.Es3;

public class Articolo {
//proprietà
	private String codiceArt;
	private String descrizioneArt;
	private double prezzo;
	
	private static int pezziInMag;

//costruttore

private Articolo() {
	System.out.println("Articolo: ");
}

//costruttore completo 

public Articolo(String codice, String descrizione, double prezzo) {
	this();
	this.codiceArt = codice;
	this.descrizioneArt = descrizione;
	this.prezzo= prezzo;
}


//metodi

public String getCodiceArt() {
	return codiceArt;
}
public void setCodiceArt(String codice) {
	this.codiceArt=codice;
}

public String getdescrizioneArt() {
	return descrizioneArt;
}
public void setDescrizioneArt(String descrizione) {
	this.descrizioneArt=descrizione;
}

public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(double prezzo) {
	this.prezzo=prezzo;
}

public static int getpezziInMag() {
	return pezziInMag;
}
public static void setPezziInMag(int pezziInMag) {
	Articolo.pezziInMag = pezziInMag;
}

}
