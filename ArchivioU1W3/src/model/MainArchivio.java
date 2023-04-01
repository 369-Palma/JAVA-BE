package model;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainArchivio {

	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ArchivioU1W3");
	static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
		Libro libro = new Libro ();
		
		libro.setTitolo("Il Signore degli anelli - Le due torri");
		libro.setAnnoPublicazione(2010);
		libro.setNumeroPagine(223);
		libro.setAutore("J. R. R. Tolkien");
		libro.setGenere(Genere.FANTASY);
		
		salvaPubblicazione(libro);
	}
	
	public static void salvaPubblicazione(Libro l) {
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
			System.out.println("Publicazione salvata correttamente");
		} catch(Exception ex) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

}
