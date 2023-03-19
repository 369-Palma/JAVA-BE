package progetto.settimana1.playerMultimediale;

import java.util.Arrays;
import java.util.Scanner;

public class lettoreMultimediale {
	
	
static int  arrDispositivi[] = new int[5];
		static int [] newArrDispositivi[];
		
	public static void main(String[] args) {
		
		getDispositivi();
		eseguiRichiesta();
	}
	
	//funzioni 
	
	//crea Array
	public static int[] getDispositivi() {
	
		
		for(int i=0; i<=4; i++) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Scegli un numero da 1 a 3 dove 1 è immagine, 2 è audio e 3 è video. Poi premi invio.");
		System.out.println("");
		
		int response = scanner.nextInt();
		
		while(response < 1 || response > 3) {
			System.out.println("Scelta non valida!");
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Scegli un numero da 1 a 3 dove 1 è immagine, 2 è audio e 3 è video. Poi premi invio.");
			System.out.println("");
			
			response = scanner1.nextInt();
		
		}
		arrDispositivi[i] = response;
		}
		System.out.println(Arrays.toString(arrDispositivi));
		System.out.println("Dispositivi configurati!");
		
		return arrDispositivi;
		
		}
	
	// EseCuzione dei dispositivi su richiesta dell'utente
	
public static void eseguiRichiesta() {
		
		int res=1;
		while(res>0) {
			
			Scanner scanner = new Scanner(System.in);
			//res=1;
			System.out.println("");
			System.out.println("*  Scegli un numero da 1 a 5 oppure premi 0 per uscire.  *");
			System.out.println("");
			res = scanner.nextInt();
			
			if(res < 1) {
				System.out.println("* Arrivederci! *");
				break;
			}
			switch(arrDispositivi[res-1]) {
			
			case 1:
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("");
				System.out.println("*  Hai scelto un'immagine  *");
				System.out.println("");					
				
				System.out.println("");
				System.out.println("*  Inserisci titolo e premi invio *");
				System.out.println("");
				String titoloInput = scanner1.next();
				
				System.out.println("");
				System.out.println("*  Regola la luminosità inserendo un numero e premi invio  *");
				System.out.println("");
				int luminosita = scanner1.nextInt();
				
				
				Immagine img = new Immagine (titoloInput, luminosita);
				
				img.show();
				
				break;
				
				
			case 2:
				Scanner scanner2 = new Scanner(System.in);
				System.out.println("");
				System.out.println("*  Hai scelto un audio  *");
				System.out.println("");					
				
				System.out.println("");
				System.out.println("*  Inserisci titolo e premi invio *");
				System.out.println("");
				String titoloInput2 = scanner2.next();
					
				System.out.println("*  Scegli durata: digita un numero e premi invio *");
				System.out.println("");
				int durata = scanner2.nextInt();
				
				System.out.println("");
				System.out.println("*  Regola il volume inserendo un numero e premi invio  *");
				System.out.println("");
				int volume = scanner2.nextInt();
				
				Audio audio = new Audio (titoloInput2, durata, volume);
				audio.play();
				
				
				break;
				
			case 3: 
				Scanner scanner3 = new Scanner(System.in);
				System.out.println("");
				System.out.println("*  Hai scelto un video  *");
				System.out.println("");					
				
				System.out.println("");
				System.out.println("*  Inserisci titolo e premi invio *");
				System.out.println("");
				String titoloInput3 = scanner3.next();
					
				System.out.println("*  Scegli durata: digita un numero e premi invio *");
				System.out.println("");
				int durata3 = scanner3.nextInt();
				
				System.out.println("");
				System.out.println("*  Regola la luminosità inserendo un numero e premi invio  *");
				System.out.println("");
				int luminosita3 = scanner3.nextInt();
				
				System.out.println("");
				System.out.println("*  Regola il volume inserendo un numero e premi invio  *");
				System.out.println("");
				int volume3 = scanner3.nextInt();
				
				
				Video video = new Video (titoloInput3, durata3, luminosita3, volume3);
				video.play();
				
				break;
	
			}
			
		}
	}

}
