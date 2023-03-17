package progetto.settimana1.playerMultimediale;

import java.util.Scanner;

public class lettoreMultimediale {

	public static void main(String[] args) {
		int arrOpzioni[]= {0,1,2,3,4,5};
		String arrDispositivo[] = {"1","2","3"};
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*  Scegli dispositivo: immagine, audio, video  *");
		System.out.println("*                                                                  *");
//		TipoDispositivo dispositivo = TipoDispositivo.valueOf(scanner.next());
		String dispositivo = scanner.next().toLowerCase();
		System.out.println("*  Scegli durata: digita un numero da 1 a 5 e premi invio oppure premi 0 per uscire  *");
		System.out.println("*                                                                  *");
		int durata = scanner.nextInt();
		System.out.println("*                                                                  *");
		System.out.println("*  Inserisci titolo e premi invio *");
		System.out.println("*                                                                  *");
		String titoloInput = scanner.next();
		System.out.println("*                                                                  *");
		System.out.println("*  Regola la luminosità inserendo un numero e premi invio  *");
		System.out.println("*                                                                  *");
		int luminosita = scanner.nextInt();
		System.out.println("*                                                                  *");
		System.out.println("*  Regola il volume inserendo un numero e premi invio  *");
		System.out.println("*                                                                  *");
		int volume = scanner.nextInt();
	
	Immagine img = new Immagine (titoloInput, durata, luminosita);
	Audio audio = new Audio (titoloInput, durata, volume);
	Video video = new Video (titoloInput, durata, luminosita, volume);
	
	esecuzione(dispositivo,durata, img, video,audio);
	}
	//funzione:  controllo sul tipo di dispositivo scelto per far partire metodo play() o show()
	
	public static void esecuzione(String dispositivo, int durata, Immagine img,Video video,Audio audio) { 
		
	
	
	while (durata !=0) {
		
	for(int i = 1; i<=durata; i++) {
	switch (dispositivo) {
		case "immagine":
			img.show();
			break;
		case "audio":
			audio.play();
			break;
		case "video":
			video.show();
			video.play();
			break;
			
		}	
	}
	}	
	
	
	
	
	}
	
}
