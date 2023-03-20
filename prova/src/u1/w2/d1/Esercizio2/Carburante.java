package u1.w2.d1.Esercizio2;

public class Carburante {
private int km;
private int litri;

//contructor

public Carburante(int km, int l) {
	this.km=km;
	this.litri =l;
}

public int getkm() {
	return this.km;
}

public void setKm(int km) {
	this.km = km;
}
public int getL() {
	return this.litri;
}
public void setL(int l) {
	this.litri = l;
}
//public static double calcolaKmL(int km, int l) throws Exception {
//
//	if(l==0) {
//		throw new Exception("Il valore inserito non può essere 0.");
//	} else {
//	return (km / l);
//}
//
//}

}

