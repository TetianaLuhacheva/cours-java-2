package fr.boxe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sun.xml.bind.v2.model.core.ID;

import fr.boxe.model.Combattant;
import fr.boxe.model.Match;
import fr.boxe.model.Stade;

public class DaoStade {

	protected EntityManager em = null;
	
	public DaoStade() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BoxePersistence");
		em = emf.createEntityManager();
	}
	
	/*
	 * CRUD
	 */
	
	// create 
	public Stade creerStade(Stade entity) {	 
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();		
		return entity;
	}
	
	// read
	public Stade readStade(String idValue) {
		return (Stade) em.find(Stade.class, idValue);
	}
	
	// update
	public Stade updateStade(Stade stade) {
		em.getTransaction().begin();
		em.merge(stade);
		em.getTransaction().commit();		
		return stade;
	}
	
	// delete
	public void deleteStade(Stade stade) {
		em.getTransaction().begin();
		em.remove(stade);
		em.getTransaction().commit();
	} 
	

	// findALL
	public List<Stade> findAll() {	
		String query = "SELECT o FROM Stade o" ;
		return em.createQuery(query).getResultList();		
	}
	
}
