package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import util.JpaUtil;

public class MainArchivio {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ArchivioU1W3");
	static EntityManager em = emf.createEntityManager();
	
	static ArrayList <Pubblicazione> archivio;
	//public static List <Pubblicazione> archivio = findAllPubblicazioni();
	
	public static void main(String[] args) {
		
		Libro libro = new Libro ();
		
		libro.setTitolo("Il Signore degli anelli - Le due torri");
		libro.setAnnoPublicazione(2010);
		libro.setNumeroPagine(223);
		libro.setAutore("J. R. R. Tolkien");
		libro.setGenere(Genere.FANTASY);
		
		Rivista rivista = new Rivista ();
		rivista.setTitolo("Cavalli e segugi");
		rivista.setAnnoPublicazione(1993);
		rivista.setNumeroPagine(26);
		rivista.setPeriodicita(Periodicita.MENSILE);
	
		//archivio = new ArrayList <Pubblicazione> ();
		archivio.add(rivista);
		archivio.add(libro);
	
		
		// **********Aggiungi elemento all'archivio************
		PubblicazioneDAO ap = new PubblicazioneDAO();
		ap.aggiungiPubblicazione(rivista);
		ap.aggiungiPubblicazione(libro);
		
		
		// **********Rimuovi elemento dall'archivio************
		
	PubblicazioneDAO elementoLetto = new PubblicazioneDAO();
	Pubblicazione p = elementoLetto.findPubblicazioneByIsbn(2l);
	elementoLetto.eliminaPubblicazione(p);
		
		findByISBN(3l);
	
		//**********Ricerca per anno di pubblicazione************
	archivio = getPubbByYear(2010);
archivio.forEach(p -> System.out.println(p.getTitolo() + " " + p.getAnnoPublicazione()));

		//**********Ricerca per autore************
		
		List <Pubblicazione> listaPubb = getPubbByAuthor("J. R. R. Tolkien");
	listaPubb.forEach(p -> System.out.println(p.getAutore()));
		
		//**********Ricerca per titolo************
		archivio = getPubbByTitle("Cavalli");
		archivio.forEach(p -> System.out.println(p.getTitolo()));
		
	}
	
	
	
}