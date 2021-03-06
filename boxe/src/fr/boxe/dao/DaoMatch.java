package fr.boxe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.boxe.model.Combattant;
import fr.boxe.model.Match;
import fr.boxe.model.Stade;

public class DaoMatch {
	
	protected EntityManager em = null;
	
	public DaoMatch() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BoxePersistence");
		em = emf.createEntityManager();		
	}

	
	/*
	 * CRUD
	 */
	
	// create 
	public Match creerMatch(Match match) {	
		em.getTransaction().begin();
		em.persist(match);
		em.getTransaction().commit();		
		return match;
	}
	
	// read
	public Match readMatch(String idValue) {	
		return (Match) em.find(Match.class, idValue);		
	}
	
	// findALL
	public List<Match> findAll() {	
		String query = "SELECT o FROM Match o";
		return em.createQuery(query).getResultList();		
	}
	
	
	// update
	public Match updateMatch(Match match) {
		em.getTransaction().begin();
		em.merge(match);
		em.getTransaction().commit();		
		return match;
	}
	
	// delete
	public void deleteMatch(Match match) {
		em.getTransaction().begin();
		em.remove(match);
		em.getTransaction().commit();
	}
	
	
	
}
