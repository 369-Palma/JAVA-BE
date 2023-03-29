package util;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import EvDAO.EvDAO;



public class EventoDAO implements EvDAO  {

	
	//implementazione metodi
	
	
	public void save(Evento e) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
			System.out.println("Salvataggio dell'evento avvenuto con successo");
			
		} catch(Exception ex) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		
	}
	
	//cerca per id
		
	@Override
	public Evento getById(Long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Evento ev = em.find(Evento.class, id);
		em.getTransaction().commit();
		return ev;
		} finally {
			em.close();
		}	
	}

		
		//modificare elemento
		
		public static void updateEvent(Evento e) {
			EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
			try {
			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			System.out.println("Evento modificato con successo");
			} catch(Exception ex) {
				em.getTransaction().rollback();
			} finally {
				em.close();
			}
		}
		
				
		//eliminare un evento
		
		@Override
		public void delete(Evento e) {
			EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.remove(e);
				em.getTransaction().commit();
				System.out.println(" L'evento è stato eliminato dal db");
			} 
			 finally {
				em.close();
			}
			
		}


//		@Override
//		public List<Evento> gettAll() {
//			EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
//			try {
//				List<Evento> q = em.createNamedQuery("Evento.findAll");
//				return q;
//			} finally {
//				em.close();
//			}	
//			
//		}
		
}
