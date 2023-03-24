package u1.w2.project;


public class ArticoloBiblioteca {
public String ISBN = ArticoloBiblioteca.generaISBN();
public static String titolo;
public static int annoPublicazione;
public int nPag;

public ArticoloBiblioteca(String isbn, String titolo, int anno, int pages) {
	this.ISBN = isbn;
	ArticoloBiblioteca.titolo = titolo;
	ArticoloBiblioteca.annoPublicazione = anno;
	this.nPag = pages;
}

//genera codice isbn
public static String generaISBN() {
	return ArticoloBiblioteca.titolo + ArticoloBiblioteca.annoPublicazione;
}

//genera numero random
//private static int generaRandom() {
//	int randomNum = (int)Math.random()*101;
//	return randomNum;
//}
}
