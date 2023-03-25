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
	Libro l1 = new Libro(7575757656778l, "La storia infinita", 1993, 56, "Arthur nonLoso", "Fantasy");
	Libro l2 = new Libro(3573743789967l, "La storia finita", 1995, 80, "Arthur nonLoso", "Fantasy");
	Libro l3 = new Libro(6473973789967l, "Il signore degli anelli - le due torri", 2002, 256, "J. R. R. Tolkien", "Fantasy");
	Libro l4 = new Libro(2573743789961l, "Non ne ho idea", 2021, 123, "Arthur nonLoso", "Horror");
	Libro l5 = new Libro(3173712342467l, "Piccoli brividi", 2001, 321, "Arthur nonLoso", "Horror");
	
// Riviste
	Rivista r1 = new Rivista(34870287389927l, "Cavalli e segugi", 1993, 36, Periodicita.SEMESTRALE);
	Rivista r2 = new Rivista(46927469883898l, "Orti biodinamici", 2022, 25, Periodicita.MENSILE);
	Rivista r3 = new Rivista(34761974682634l, "Sustainable Management", 2023, 52, Periodicita.SEMESTRALE);
	Rivista r4 = new Rivista(46888277199376l, "Top of the tops", 2000, 23, Periodicita.SETTIMANALE);
	Rivista r5 = new Rivista(86548654653349l, "Topogigio e i gatti", 1995, 20, Periodicita.SETTIMANALE);
	
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
	
	rimuoviPerISBN(giveIsbn());
	
	//ricerca per isbn
	cercaPerIsbn(giveIsbn());
	
	//recerca per anno
	cercaPerAnno(giveAnno());
	
	//ricerca per autore
	cercaPerAutore(giveAutore());
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
			
			//static long isbn = ArticoloBiblioteca.getIsbn();
			
			Libro lnew = new Libro(9875985874566l, titolo,anno, pages, autore, genere);
			
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
			

			Rivista rnew = new Rivista(47654864764567l, titolo, anno, pages, periodicita);
			return rnew;			
		
		}
		return null;		
	
	}
	
	//ricevi isbn dall'utente
private static long giveIsbn() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("*                                                                  *");
	System.out.println("*  inserisci  isbn  *");
	System.out.println("*                                                                  *");
	long isbn = scanner.nextLong();
	return isbn;
}

//ricevi anno dall'utente
private static int giveAnno() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("*                                                                  *");
	System.out.println("*  inserisci  anno di publicazione  *");
	System.out.println("*                                                                  *");
	int anno = scanner.nextInt();
	return anno;
}
	
	//rimuovi per isbn
	
	public static List <ArticoloBiblioteca> rimuoviPerISBN(long isbn) {
		return listaTot.stream()
		.filter(e->e.getIsbn() != isbn)
		.collect(Collectors.toList());
	}
	
	//ricerca per isbn
	public static List <ArticoloBiblioteca> cercaPerIsbn(long isbn){
		return listaTot.stream()
		.filter(i -> i.getIsbn() == isbn)
		.collect(Collectors.toList());
	}
	
	//ricevi autore dall'utente
	
	private static String giveAutore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*                                                                  *");
		System.out.println("*  inserisci autore *");
		System.out.println("*                                                                  *");
		String autore = scanner.next();
		return autore;
}
	
	//lista libri
	public static List<ArticoloBiblioteca> listaLibri() {
		return listaTot.stream()
				.filter(el -> el.equals((Libro)el))
				.collect(Collectors.toList());		
		
//		return listaLibri;
	}
	//ricerca per autore
	
//	public static List<ArticoloBiblioteca> cercaPerAutore(String autore){
//	listaTot.stream()
//		.filter(el -> el.equals((Libro)el))
//		.collect(Collectors.toList());
//	List<ArticoloBiblioteca> listaLibri = listaTot;			
//		 listaLibri.filter(a -> a.getAutore() .equals(autore))
//		.collect(Collectors.toList());
//		return listaLibri;
//	}
	
	public static List <Libro> cercaPerAutore (String autore){
		 listaTot.stream()
		.filter(e -> {
			if(e instanceof Libro) {
				((Libro(e).getAutore()
						.equals(autore))
						.collect(Collectors.toList()));						
			}
			
		})
	   .map(e-> (Libro)e)
	   .collect(Collectors.toList());
	}
	//ricerca per anno di publicazione

	public static List <ArticoloBiblioteca> cercaPerAnno(int anno){
		listaTot.stream()
		.filter(e->e.getAnnoPublicazione() == anno)
		.collect(Collectors.toList());
		return listaTot;						
	}
}
	

	
	
	
	
