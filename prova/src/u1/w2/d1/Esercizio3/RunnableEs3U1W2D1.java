package u1.w2.d1.Esercizio3;

public class RunnableEs3U1W2D1  {

	public static void main(String[] args) throws BancaException{
		
		try {
			ContoCorrente conto = new ContoCorrente("Michele", 1);
			conto.preleva(5);
		} catch (BancaException exc) {
			System.out.println(exc);
		} finally {
			ContoCorrente.nMovimenti ++;
		}
		ContoCorrente.restituisciSaldo();
	}

	//funzioni
	
	
	
	
}
