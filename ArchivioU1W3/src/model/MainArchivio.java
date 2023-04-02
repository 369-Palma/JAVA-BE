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
	
	static List<Pubblicazione> archivio;
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
		
		//**********Trova tutte le pubblicazioni************
		
		PubblicazioneDAO newPubb = new PubblicazioneDAO();
		archivio = newPubb.getAll();
		
		// **********Rimuovi elemento dall'archivio************
			
		PubblicazioneDAO elementoLetto = new PubblicazioneDAO();
		Pubblicazione pubb = elementoLetto.findPubblicazioneByIsbn(2l);
		elementoLetto.eliminaPubblicazione(pubb);		
		elementoLetto.findByISBN(3l);
	
		//**********Ricerca per anno di pubblicazione************
		
		PubblicazioneDAO elemLetto = new PubblicazioneDAO();
		archivio = elemLetto.getPubbByYear(2010);
		archivio.forEach(p -> System.out.println(p.getTitolo() + " " + p.getAnnoPublicazione()));

		//**********Ricerca per autore************
		
		PubblicazioneDAO elemL = new PubblicazioneDAO();
		List <Pubblicazione> listaPubb = elemL.getPubbByAuthor("J. R. R. Tolkien");
		listaPubb.forEach(p -> System.out.println(p.getAutore()));
		
		//**********Ricerca per titolo************
		
		PubblicazioneDAO eL = new PubblicazioneDAO();
		archivio = eL.getPubbByTitle("Cavalli");
		archivio.forEach(p -> System.out.println(p.getTitolo()));
		
	}
	
}