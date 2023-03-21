package u1.w2.d2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
	public static Scanner s = new Scanner (System.in);
	public static Set<String> parole = new HashSet <String>();
	
	public static Set<String> paroleDuplicate = new HashSet <String>();
	private static int counter = 0;
	
	public static void main(String[] args) {
		
		System.out.println("*  Inserisci un numero intero seguito dal tasto Invio  *");
		int num = s.nextInt();		
		
		getParole(num);
		
		System.out.println("Le parole distinte sono:" + parole);
		
		System.out.println("Le parole duplicate sono:" + paroleDuplicate);
		System.out.println("Le parole distinte sono:" + counter);
		
	}
	
	//funzioni e metodi
	public static void getParole(int n) {
		for(int i = 0; i<n; i++) {
		System.out.println("*                                                                  *");
		System.out.println("*  Inserisci una parola seguita dal tasto Invio  *");
		System.out.println("*                                                                  *");
		String parola = s.next();
		
		boolean isDistinte = parole.add(parola);
		if (isDistinte == false) {
			paroleDuplicate.add(parola);
		} else {
			counter ++;
		}
				
		}
	}

}
