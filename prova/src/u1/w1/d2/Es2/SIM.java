package u1.w1.d2.Es2;

public class SIM {
	
//proprietà
private String numeroCell;
private double creditoDisponibile;
private Chiamata [] listaChiamate;

//costruttore 
public SIM (String numero) {
this.numeroCell=numero;
this.creditoDisponibile = 0;
this.listaChiamate = new Chiamata[5];
}

//metodi e funzioni

public String getNumeroCell() {
	return numeroCell;
}

public void setNumeroCell(String numeroCell) {
	this.numeroCell = numeroCell;
}

public double getCreditoDisponibile() {
	return creditoDisponibile;
} 

public void setCreditoDisponibile (double creditoDisponibile) {
	this.creditoDisponibile=creditoDisponibile;
}

public Chiamata[] getListaChiamate () {
	return listaChiamate;
}

public void setListaChiamate(Chiamata[] listaChiamate) {
	this.listaChiamate=listaChiamate;
}
//funzione per stampare i dati della sim
public void stampaInfo() {
	System.out.println("Sim:" + this.numeroCell);
	System.out.println("Credito residuo:" + this.creditoDisponibile);
	System.out.println("Elenco chiamate in uscita: " + this.listaChiamate);
}

}

