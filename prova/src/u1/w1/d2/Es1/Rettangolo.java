package u1.w1.d2.Es1;

public class Rettangolo {
private double larghezza;
private double altezza;

//contructor
public Rettangolo (double altezza, double base) {
	this.larghezza=base;
	this.altezza=altezza;
}

//metodi
public double getLarghezza() {
	return larghezza;
}

public void setLarghezza(double larghezza) {
	this.larghezza=larghezza;
}

public double getAltezza() {
	return altezza;
}

public void setAltezza(double altezza) {
	this.altezza=altezza;
}
//area
public double getArea() {	
	return altezza*larghezza;
}
//perimetro
public double getPerimetro() {
	return 2*(altezza*larghezza);
}

//funzioni

	public static void stampaRettangolo(Rettangolo r) {
	
		System.out.println("Perimetro rettangolo: " + r.getPerimetro());
		System.out.println("Area rettangolo: " + r.getArea());
	}
	
	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		double areaTot = r1.getArea() + r2.getArea();
		double perimetroTot = r1.getPerimetro() + r2.getPerimetro();	
		
		System.out.println("la somma delle aree dei due rettangoli è: " + areaTot);
		System.out.println("la somma dei perimetri dei due rettangoli è: " + perimetroTot);
	}

}
