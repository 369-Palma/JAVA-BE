package u1.w1.d4.Es1;

public class Dipendente {
	
//proprietà
static public double stipendioBase = 1000;

private String matricola;
private double stipendio;
private double importoOrarioStraordinario;
private Livello livello;
private Dipartimento dipartimento;

//contructors

public Dipendente(String matricola, Dipartimento dipartimento) {
	this.matricola = matricola;
	this.dipartimento = dipartimento;
	this.stipendio = Dipendente.stipendioBase;
	this.importoOrarioStraordinario = 30;
	this.livello = Livello.OPERAIO;
}

public Dipendente (String matricola, double stipendio, double importoOrarioStraordinario, double stipendioBase, Dipartimento dipartimento, Livello livello) {
	this(matricola, dipartimento);
	this.matricola = generaMatricola();
	this.importoOrarioStraordinario = importoOrarioStraordinario;
	this.livello = livello;
	this.stipendio = 1000;
}




//metodi base
private String getMatricola() {
	return matricola;
}

private double getstipendio() {
	return stipendio;
}

private double getimportoStraordinario() {
	return importoOrarioStraordinario;
}

private Livello getLivello() {
	return livello;
}

private Dipartimento getDipartimento() {
	return dipartimento;
}

public Dipartimento setDipartimento(Dipartimento dipartimento) {
	return this.dipartimento= dipartimento;
}

private double getStipendioBase() {
	return stipendioBase;
}

public void setOrarioStraordinario(double orarioStraordinario) {
	this.importoOrarioStraordinario = orarioStraordinario;
}

//altri metodi 

private String generaMatricola() {
	
	return "DIP" + (Math.random()*10);
}

//stampa dati dipendente
//public void stampaDatiDipendente() {
//		//System.out.println(this(matricola,stipendio,importoOrarioStraordinario, stipendioBase, dipartimento, livello));
//	System.out.println("matricola:" + this.matricola
//	+ "\ndipartimento:" + this.dipartimento
//	+ "\nlivello:" + this.livello
//	+ "\nstipendio:" + this.stipendio
//	+ "\nimporto orario straordinario: " + this.importoOrarioStraordinario);	
//}

//public Dipendente (
public void stampaDatiDipendente() {
	System.out.println(this.toString());
}
		
//public String toString() {
//	System.out.println(this.toString());
//}

//promuovi dipendente
//public Livello promuovi(Livello lev) {
//	if(this.livello == Livello.OPERAIO) {
//		
//		this.livello = Livello.IMPIEGATO;
//		this.stipendio = Dipendente.stipendioBase * 1.2;
//		return livello;
//	} else if(this.livello == Livello.IMPIEGATO){
//		this.livello = Livello.QUADRO;
//		this.stipendio = Dipendente.stipendioBase * 1.5;
//		return livello;
//	}  else if(this.livello == Livello.QUADRO) {
//		this.livello = Livello.DIRIGENTE;
//		this.stipendio = Dipendente.stipendioBase * 2;
//		return livello;
//	} else {
//		 System.out.println ("Il dipendente non può essere dirigente" + this.livello = livello.DIRIGENTE);
//	}
	
	
public Livello promuovi() {
	switch(this.livello) {
	case OPERAIO:
		this.livello = Livello.IMPIEGATO;
		break;
	case IMPIEGATO:
		this.livello = Livello.QUADRO;
		break;
	case QUADRO:
		this.livello = Livello.DIRIGENTE;
		break;
		default:
			System.out.println("Errore, sei al livello più alto");
			break;
	}	
}

public double calcolaStipendio() {
	double coeff = 1;
	switch(this.livello) {
	case OPERAIO:
		coeff=1;
		break;
	case IMPIEGATO:
		coeff = 1.2;
		break;
	case QUADRO:
		coeff= 2;
		break;
	case DIRIGENTE:
		this.livello = Livello.DIRIGENTE;
		break;
		}
}

public void setLivello(Livello l) {
	this.livello = l;
	this.stipendio = this.calcolaStipendio();
}
	
static double calcolaPaga(Dipendente d) {
	return d.stipendio;
	
}
static double calcolaPaga(Dipendente d, int h) {
	return d.stipendio + d.importoOrarioStraordinario*h;
}
}