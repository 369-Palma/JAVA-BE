//package progetto.settimana1.playerMultimediale;
//
//import java.util.Scanner;
//
//public class lettoreMultimediale {
//	public static void main(String[] args) {
//		String arrOpzioni[] = new String [1];
//		arrOpzioni[0] = "0";
//	private static int contatore = 0;
//
//	
//	
//		//Configurazione dispositivi
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("*                                                                  *");
//		System.out.println("*  Scegli dispositivo: immagine, audio, video  *");
//		System.out.println("*                                                                  *");	
//		String dispositivo = scanner.next().toLowerCase();
//		
//		System.out.println("*                                                                  *");
//		System.out.println("*  Inserisci titolo e premi invio *");
//		System.out.println("*                                                                  *");
//		String titoloInput = scanner.next();
//			
//		System.out.println("*  Scegli durata: digita un numero e premi invio *");
//		System.out.println("*                                                                  *");
//		int durata = scanner.nextInt();
//		
//		System.out.println("*                                                                  *");
//		System.out.println("*  Regola la luminosità inserendo un numero e premi invio  *");
//		System.out.println("*                                                                  *");
//		int luminosita = scanner.nextInt();
//		
//		System.out.println("*                                                                  *");
//		System.out.println("*  Regola il volume inserendo un numero e premi invio  *");
//		System.out.println("*                                                                  *");
//		int volume = scanner.nextInt();
//		scanner.close();
//	
//	Immagine img = new Immagine (titoloInput, durata, luminosita);
//	Audio audio = new Audio (titoloInput, durata, volume);
//	Video video = new Video (titoloInput, durata, luminosita, volume);
//	
//	esecuzione(dispositivo,durata, img, video,audio);
//	}
//	
//	
////array di 5 elementi scelti dall'utente
//	String utenteArr [][]=new String [1][];
//	
//	
////push elemento nell'array
//	String arr2[]=new String [utenteArr.length +1];
//	
//	
//	//funzione:  controllo sul tipo di dispositivo scelto per far partire metodo play() o show()
//	
//	public static void esecuzione(String dispositivo, int durata, Immagine img,Video video,Audio audio) { 
//		
//		
//	
//		
//	for(int k=0; k<=arrOpzioni.length; k++) {
//		
//	}
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("*                                                                  *");
//	System.out.println("*  Dispositivi configurati correttamente! Scegli un numero da 1 a 5 per vedere la tua scelta oppure premi 0 per uscire.  *");
//	System.out.println("*                                                                  *");
//	int sceltaUtente = scanner.nextInt();
//	scanner.close();
//	
//	
//	
//	
//	
//	
//	while (sceltaUtente !=0) {
//		
//	for(int i = 0; i<=5; i++) {
//	switch (dispositivo) {
//		case "immagine":
//			img.show();
//			break;
//		case "audio":
//			audio.play();
//			break;
//		case "video":
//			video.show();
//			video.play();
//			break;
//			
//		}	
//	}
//	}	
//	
//	
//	
//	
//	}
//	
//}
