package fr.tetiana.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		// enetiey manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		
		Niveau n4 = new Niveau();
		n4.setCode("n4");
		n4.setDescription("Niveau 4");
		
		em.getTransaction().begin();
		em.persist(n4);
		em.getTransaction().commit();
		
		Out.w("Succes!");	
		
		
		List<Niveau> niveaux = em.createQuery("SELECT o FROM o").getResultList();
		for(Niveau n:niveaux) {
			System.out.println("Descripyion "); 
		}
		 
	}

}
