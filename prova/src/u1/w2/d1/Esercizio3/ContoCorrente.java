package u1.w2.d1.Esercizio3;

public class ContoCorrente {
	String titolare;
	static int nMovimenti;
	final int maxMovimenti = 50;
	static double saldo;

	ContoCorrente(String titolare, double saldo) {
		this.titolare = titolare;
		ContoCorrente.saldo = saldo;
		nMovimenti = 0;
	}

	void preleva(double x) throws BancaException {
		if (nMovimenti < maxMovimenti)
			saldo = saldo - x;
		else
			saldo = saldo - x - 0.50;
		nMovimenti++;
		
		if(saldo <0) {
			throw new BancaException("Il conto è in rosso");
		}
	}

	static double restituisciSaldo() {
		
			return saldo;
		
	}
}
