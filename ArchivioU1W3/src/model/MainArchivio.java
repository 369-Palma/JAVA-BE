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
	public static List <Pubblicazione> findAllPubblicazioni(){
		Query q = em.createNamedQuery("Pubblicazioni.FindAll");
		return q.getResultList();
	}
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
	
		archivio = new ArrayList <Pubblicazione> ();
		archivio.add(rivista);
		archivio.add(libro);
	
		
		// **********Aggiungi elemento all'archivio************
		
		//aggiungiPubblicazione(rivista);
		//aggiungiPubblicazione(libro);
		
		
		// **********Rimuovi elemento dall'archivio************
		
//	Pubblicazione elementoLetto = findPubblicazioneByIsbn(2l);
//	eliminaPubblicazione(elementoLetto);
		
//	List <Pubblicazione> lp = findAllPubblicazioni();
//	lp.forEach(p-> System.out.println(p.getPubbByYear(1993)));
		//**********Ricerca per anno di pubblicazione************
	List <Pubblicazione> anno= getPubbByYear(1993);
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
	
	//Cerco tutte le pubblicazioni
	
	public static List <Pubblicazione> findAllPubblicazioni(){
		Query q = em.createNamedQuery("Pubblicazioni.FindAll");
		return q.getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public static List <Pubblicazione> getPubbByYear(Integer anno){
		try {
		Query q = em.createQuery("SELECT v FROM v WHERE v.titolo = :year");
		q.setParameter("year", anno);
		System.out.println(q);
		return q.getResultList();
	} catch(Exception ex) {
		em.getTransaction().rollback();
	}
		return archivio; 
	}

}