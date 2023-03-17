package u1.w1.d4.Es1;

public class Runnable {

	public static void main(String[] args) {
		Dipendente d1 = new Dipendente("FFM1234", Dipartimento.VENDITE);
		d1.stampaDatiDipendente();
		d1.setLivello(Livello.DIRIGENTE);
		
		double res= Dipendente.calcolaPaga(d1);
		double retTot = Dipendente.calcolaPaga(d1,3);
		
	}

}
