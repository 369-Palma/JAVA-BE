package progetto.settimana1.playerMultimediale;

public class Immagine {

private String titolo;
private int luminosita;


//constructor
public Immagine(String titolo, int l) {
	this.titolo = titolo;
	this.luminosita = l;

}

//metodi
public String getTitolo() {
	return titolo;
}
public void setTitolo(String title) {
	this.titolo = title;
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