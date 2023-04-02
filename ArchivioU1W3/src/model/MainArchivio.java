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
	
	//static ArrayList <Pubblicazione> archivio;
	public static List <Pubblicazione> archivio = findAllPubblicazioni();
	
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
		
		//aggiungiPubblicazione(rivista);
		//aggiungiPubblicazione(libro);
		
		
		// **********Rimuovi elemento dall'archivio************
		
//	Pubblicazione elementoLetto = findPubblicazioneByIsbn(2l);
//	eliminaPubblicazione(elementoLetto);
		
	//	findByISBN(3l);
	
		//**********Ricerca per anno di pubblicazione************
//	archivio = getPubbByYear(2010);
//	archivio.forEach(p -> System.out.println(p.getTitolo() + " " + p.getAnnoPublicazione()));
//	
		//**********Ricerca per autore************
		
//		List <Pubblicazione> listaPubb = getPubbByAuthor("J. R. R. Tolkien");
//		listaPubb.forEach(p -> System.out.println(p.getAutore()));
		
		//**********Ricerca per titolo************
//		archivio = getPubbByTitle("Cavalli");
//		archivio.forEach(p -> System.out.println(p.getTitolo()));
		
	}
	
	
	//FUNZIONI 
	
public static void aggiungiPubblicazione (Pubblicazione p) {
		
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			System.out.println("Publicazione salvata correttamente");
		} catch(Exception ex) {
			System.out.println(ex);
			em.getTransaction().rollback();
			
		} finally {
			em.close();
		}
	}
	
	
	public static Pubblicazione findPubblicazioneByIsbn(Long isbn) {
		try {
		em.getTransaction().begin();
		Pubblicazione p = em.find(Pubblicazione.class, isbn);
		em.getTransaction().commit();
		System.out.println(" elemento selezionato: " + p);
		return p;
		} catch(Exception ex){
			System.out.println(ex);
		}
		
		return null;
	}
	
	
	public static void eliminaPubblicazione(Pubblicazione p) {
		
		try {
			em.getTransaction().begin();
			em.remove(p);
			em.getTransaction().commit();
			System.out.println(" L'elemento è stato eliminato dal db");
		} 
		 finally {
			em.close();
		}
	}
	
	//Cerca tutte le pubblicazioni
	
	@SuppressWarnings("unchecked")
	public static List <Pubblicazione> findAllPubblicazioni(){		
			Query q = em.createNamedQuery("Pubblicazioni.FindAll");	
			System.out.println();
			List <Pubblicazione> resultList = q.getResultList();
			System.out.println(resultList);
			return resultList;			
	}
	
		
	//Cerca per ISBN
	@SuppressWarnings("unchecked")
	public static List <Pubblicazione> findByISBN(Long isbn){		
			Query q = em.createQuery("SELECT p FROM Pubblicazione p WHERE p.ISBN = :id");
			q.setParameter("id", isbn);
			System.out.println(q);
			return (List<Pubblicazione>) q.getSingleResult();			
	}
	
	
	// Cerca pubblicazioni per anno di pubblicazione
	@SuppressWarnings("unchecked")
	public static List <Pubblicazione> getPubbByYear(Integer anno){
		try {
		Query q = em.createQuery("SELECT p FROM Pubblicazione p WHERE p.annoPubblicazione = :year");
		q.setParameter("year", anno);
		//List <Pubblicazione> resultListPubb = q.getResultList();
		//System.out.println(resultList);
		return q.getResultList();			
	} catch(Exception ex) {
		em.getTransaction().rollback();
	}
		return null; 
	}
	
	//cerca per autore
	
	@SuppressWarnings("unchecked")
	public static List<Pubblicazione> getPubbByAuthor(String autore){
		
			//Query q = em.createQuery("SELECT p FROM p WHERE p.autore = :author");
			Query q = em.createQuery("SELECT Libro FROM Pubblicazione l WHERE l.autore = :author");
			q.setParameter("author", autore);
			return q.getResultList();			
	}
	
	//cerca per titolo
	
	@SuppressWarnings("unchecked")
	public static List <Pubblicazione> getPubbByTitle(String title){
		Query q = em.createQuery("SELECT p FROM Pubblicazione p WHERE p.titolo LIKE :titolo" );
		q.setParameter("titolo", "%" + title + "%");
		return q.getResultList();
	}
	
	
	
}