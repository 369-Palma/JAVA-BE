package u1.w2.d1.Esercizio2;


	import java.util.Scanner;

	public class Esercizio2 {
		
		public static void main(String[] args) throws Exception {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("");
			System.out.print("Inserisci km percorsi");
			System.out.println("");		
			int resKm= scanner.nextInt();
			
			while(true) {			
			System.out.println("");
			System.out.print("Inserisci i litri di carburante consumati");
			System.out.println("");	
			int resL = scanner.nextInt();
			
			
			try{
				calcolaKmL(resKm, resL);
			    break;
			}
			catch(Exception e) {
				System.out.println(e);
					
			}
			}
			}
			
			
		
		
		
	public static void calcolaKmL(int km, int l) throws Exception {

		if(l==0) {
			throw new Exception("Il valore inserito non può essere 0.");
		} else {
		System.out.println("hai consumato: " + km/l);
	}

	}
	
	
	}
		
	
		
	
