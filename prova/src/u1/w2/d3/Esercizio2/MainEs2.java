package u1.w2.d3.Esercizio2;

public class MainEs2 {

	private static int somma1;
	private static int somma2;
	private static int somma3;
	private static int sommaTot;
	
	public static void main(String[] args) {
		ArrayDiNumeri array1 = new ArrayDiNumeri();
		ArrayDiNumeri array2 = new ArrayDiNumeri();
		ArrayDiNumeri array3 = new ArrayDiNumeri();
		
		Thread t1 = new Thread(array1);
		Thread t2 = new Thread(array2);
		Thread t3 = new Thread(array3);
	
		
		
		try {
			t1.join();
			//somma1 = ArrayDiNumeri.getSommaArray();
			
		} catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Il totale dell'array 1 è: " + somma1);
		try {
			t2.join();
			//somma2 = ArrayDiNumeri.getSommaArray();
			
		} catch(InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Il totale dell'array 2 è: " + somma2);
		try {
			t3.join();
			//somma3 = ArrayDiNumeri.getSommaArray();
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Il totale dell'array 3 è: " + somma3);
		//sommaTot = somma1 + somma2 + somma3;
		System.out.println("Il totale è: " + sommaTot);
		
		
		}
	
}

