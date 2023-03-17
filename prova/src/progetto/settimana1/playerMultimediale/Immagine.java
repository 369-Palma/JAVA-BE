package progetto.settimana1.playerMultimediale;

public class Immagine {
//private static boolean riproducibile = false;

private String titolo;
private int durata = 1;
private int luminosita;


//constructor
public Immagine(String titolo, int durata, int l) {
	this.titolo = titolo;
	this.durata = durata;
	this.luminosita = l;
}

//metodi
public String getTitolo() {
	return titolo;
}
public void setTitolo(String title) {
	this.titolo = title;
}

public int getDurata() {
	return durata;
}
public void setDurata(int durata) {
	this.durata = durata;
}

public int getLuminosita() {
	return luminosita;
}
public void setLuminosita(int l) {
	luminosita = l;
}

//funzionalità

// metodo per luminosità
public void aumentaLuminosita() {
	this.luminosita++;
}

public void riduciLuminosita() {
	this.luminosita--;
}


public String stampaLuminosita() {
 String luminositaStringa= "";
for (int i=0; i <= this.luminosita; i++) {
	luminositaStringa = luminositaStringa + "*";
}
return luminositaStringa;
}

//metodo per stampare la luminosità 

public String show() {
		return this.titolo + stampaLuminosita();
}

}