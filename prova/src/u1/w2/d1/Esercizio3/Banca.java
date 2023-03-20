package u1.w2.d1.Esercizio3;

public class Banca {
	public static void main(String args[]) throws BancaException{
		

		

		try {
			ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
			conto1.preleva(15000);

			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
		} catch (BancaException e) {
			System.out.println("Errore durante il prelievo: " + e);
			System.out.println(e);
			e.printStackTrace();
		} finally {
			ContoCorrente.nMovimenti ++;
		}

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(2000);

			conto2.stampaSaldo();

		} catch (BancaException e) {
			System.out.println("Errore durante il prelievo: " + e);
			e.printStackTrace();
		} finally {
			ContoCorrente.nMovimenti ++;
		}
	}
}


