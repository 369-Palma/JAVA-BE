package u1.w2.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Archivio {
private static List <ArticoloBiblioteca> listaTot;
	public static <T> void main(String[] args) {
		
		
//libri
	Libro l1 = new Libro(ArticoloBiblioteca.generaISBN(), "La storia infinita", 1993, 56, "Arthur nonLoso", "Fantasy");
	Libro l2 = new Libro(ArticoloBiblioteca.generaISBN(), "La storia finita", 1995, 80, "Arthur nonLoso", "Fantasy");
	Libro l3 = new Libro(ArticoloBiblioteca.generaISBN(), "Il signore degli anelli - le due torri", 2002, 256, "J. R. R. Tolkien", "Fantasy");
	Libro l4 = new Libro(ArticoloBiblioteca.generaISBN(), "Non ne ho idea", 2021, 123, "Arthur nonLoso", "Horror");
	Libro l5 = new Libro(ArticoloBiblioteca.generaISBN(), "Piccoli brividi", 2001, 321, "Arthur nonLoso", "Horror");
	
// Riviste
	Rivista r1 = new Rivista(ArticoloBiblioteca.generaISBN(), "Cavalli e segugi", 1993, 36, Periodicita.SEMESTRALE);
	Rivista r2 = new Rivista(ArticoloBiblioteca.generaISBN(), "Orti biodinamici", 2022, 25, Periodicita.MENSILE);
	Rivista r3 = new Rivista(ArticoloBiblioteca.generaISBN(), "Sustainable Management", 2023, 52, Periodicita.SEMESTRALE);
	Rivista r4 = new Rivista(ArticoloBiblioteca.generaISBN(), "Top of the tops", 2000, 23, Periodicita.SETTIMANALE);
	Rivista r5 = new Rivista(ArticoloBiblioteca.generaISBN(), "Topogigio e i gatti", 1995, 20, Periodicita.SETTIMANALE);
	
//lista con libri e articoli
	
List <ArticoloBiblioteca> lista = new ArrayList <ArticoloBiblioteca>();
	lista.add(l1);
	lista.add(l2);
	lista.add(l3);
	lista.add(l4);
	lista.add(l5);
	lista.add(r1);
	lista.add(r2);
	lista.add(r3);
	lista.add(r4);
	lista.add(r5);
	
	listaTot = lista;
	
	//Aggiungi elemento alla lista
	lista.add(creaElemento());
	
	//rimuovi per isbn
	rimuoviPerISBN(ArticoloBiblioteca.generaISBN());
	
	
	}
	
//FUNZIONI
	
	
	
	//AGGIUNTA DI UN ELEMENTO
	
	public static List <ArticoloBiblioteca> addElement (ArticoloBiblioteca articolo) {
	listaTot.add(articolo);
		return listaTot;
	}
	
	
	
	public static <T> ArticoloBiblioteca creaElemento() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*                                                                  *");
		System.out.println("*  Vuoi inserire un libro o un rivista? [l/r]  *");
		System.out.println("*                                                                  *");
		String tipoArticolo = scanner.next();
		
		
		System.out.println("*                                                                  *");
			System.out.println("*  inserisci titolo  *");
			System.out.println("*                                                                  *");
			String titolo = scanner.next();	
			
			System.out.println("*                                                                  *");
			System.out.println("* inserisci anno di publicazione *");
			System.out.println("*                                                                  *");
			int anno = scanner.nextInt();	
			
			System.out.println("*                                                                  *");
			System.out.println("* inserisci numero pagine *");
			System.out.println("*                                                                  *");
			int pages = scanner.nextInt();
			
		if(tipoArticolo == "l") {
				
			System.out.println("*                                                                  *");
			System.out.println("*  inserisci autore  *");
			System.out.println("*                                                                  *");
			String autore = scanner.next();	
			
			System.out.println("*                                                                  *");
			System.out.println("*  inserisci genere  *");
			System.out.println("*                                                                  *");
			String genere = scanner.next();	
			
			String isbn = ArticoloBiblioteca.generaISBN();
			
			Libro lnew = new Libro(isbn, titolo,anno, pages, autore, genere);
			
			return lnew;
			
		} else if(tipoArticolo == "r") {
			System.out.println("*                                                                  *");
			System.out.println("*  inserisci periodicità: SEMESTRALE, MENSILE, SETTIMANALE *");
			System.out.println("*                                                                  *");
			String resPeriodicita = scanner.next();
			
			Periodicita periodicita = null;
						
			switch(resPeriodicita) {
			case "SEMESTRALE":
				periodicita = Periodicita.SEMESTRALE;
				
			case "MENSILE":
				periodicita = Periodicita.MENSILE;	
				
			case "SETTIMANALE":
				periodicita = Periodicita.SETTIMANALE;	
			}
			
String isbn = ArticoloBiblioteca.generaISBN();
			
			Rivista rnew = new Rivista(isbn, titolo, anno, pages, periodicita);
			return rnew;			
		
		}
		return null;		
	
	}
	
private String getIsbn() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("*                                                                  *");
	System.out.println("*  inserisci inserisci isbn (titolo+annopublicazione) *");
	System.out.println("*                                                                  *");
	String isbn = scanner.next();
	return isbn;
}
	
	
	//rimuovi per isbn
	
	public static void rimuoviPerISBN(String isbn) {
		listaTot.stream().filter(e->e.getIsbn() != isbn).collect(Collectors.toList());
	}
	
	public static List <Libro> cercaPerAutore(String autore){
		return listaTot.stream()
		.filter(e -> {
			if(e instanceof Libro) {
				return ((Libro(e).getAutore().equals(auto);
			}
			return false;
		})
	   .map(e-> (Libro)e)
	   .collect(Collectors.toList());
				
		
			
		
	}
	
	
}
	

	
	
	
	
