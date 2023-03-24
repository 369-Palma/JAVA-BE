package u1.w2.project;

import java.util.Scanner;

public class ArticoloBiblioteca {
public long ISBN;
public static String titolo;
public static int annoPublicazione;
public int nPag;

public ArticoloBiblioteca(long isbn, String titolo, int anno, int pages) {
	this.ISBN = isbn;
	ArticoloBiblioteca.titolo = titolo;
	ArticoloBiblioteca.annoPublicazione = anno;
	this.nPag = pages;
}


	public long getIsbn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*                                                                  *");
		System.out.println("*  inserisci inserisci isbn  *");
		System.out.println("*                                                                  *");
		long isbn = scanner.nextLong();
		return isbn;
	}
	
}

//genera codice isbn
//public static String generaISBN() {
//	return ArticoloBiblioteca.titolo + ArticoloBiblioteca.annoPublicazione ;
//}


//genera numero random
//private static int generaRandom() {
//	int randomNum = (int)Math.random()*101;
//	return randomNum;
//}

