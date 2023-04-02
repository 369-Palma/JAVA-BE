package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ArchivioDEO.DEOarchivio;
import util.JpaUtil;

public class PubblicazioneDAO implements DEOarchivio{
	//implementazione metodi
	
	
	public static List <Pubblicazione> archivio = findAllPubblicazioni();

	public void aggiungiPubblicazione (Pubblicazione p) {
	EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
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
	
	
	public Pubblicazione findPubblicazioneByIsbn(Long isbn) {
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
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
	
	
	public void eliminaPubblicazione(Pubblicazione p) {
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
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
	

	public static List <Pubblicazione> findAllPubblicazioni(){	
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
		try {		
			Query q = em.createNamedQuery("Pubblicazioni.FindAll");	
			System.out.println();
			List <Pubblicazione> resultList = q.getResultList();
			System.out.println(resultList);
			return resultList;		
		} catch(Exception ex) {
			System.out.println(ex);
			em.getTransaction().rollback();
		} finally{
			em.close();
		}
		return null;
	}
	
		
	//Cerca per ISBN
	
	public Object findByISBN(Long isbn){	
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
		try {	
			Query q = em.createQuery("SELECT p FROM Pubblicazione p WHERE p.ISBN = :id");
			q.setParameter("id", isbn);
			System.out.println(q);
			return q.getSingleResult();
		}catch(Exception ex) {
			System.out.println(ex);
			em.getTransaction().rollback();
		} finally{
			em.close();
		}
		return null;
	}
	
	
	// Cerca pubblicazioni per anno di pubblicazione
	
	@SuppressWarnings("unchecked")
	public List <Pubblicazione> getPubbByYear(Integer anno){
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
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
	public List<Pubblicazione> getPubbByAuthor(String autore){
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
		try {	
		//Query q = em.createQuery("SELECT p FROM p WHERE p.autore = :author");
			Query q = em.createQuery("SELECT Libro FROM Pubblicazione l WHERE l.autore = :author");
			q.setParameter("author", autore);
			return q.getResultList();	
	} catch(Exception ex) {
		em.getTransaction().rollback();
	}finally{
		em.close();
	}
	return null;
}
	
	//cerca per titolo
	
	@SuppressWarnings("unchecked")
	public List <Pubblicazione> getPubbByTitle(String title){
		EntityManager em = JPA_util.getEntityManagerFactory().createEntityManager();
		try {	
		Query q = em.createQuery("SELECT p FROM Pubblicazione p WHERE p.titolo LIKE :titolo" );
		q.setParameter("titolo", "%" + title + "%");
		return q.getResultList();
		} catch(Exception ex) {
			em.getTransaction().rollback();
		}finally{
			em.close();
		}
		return null;
	}


	@Override
	public List<Pubblicazione> getAll() {
		List<Pubblicazione> archivio = findAllPubblicazioni();
		return archivio;
	}

}
