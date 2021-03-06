package fr.boxe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.boxe.model.Combattant;

public class DaoCombattant {

	// Entity manager
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BoxePersistence");
	EntityManager em = emf.createEntityManager();


//	Niveau n4 = new Niveau();
//	n4.setCode("n4");
//	n4.setDescription("Niveau 4");
//	
//	em.getTransaction().begin();
//	em.persist(n4);
//	em.getTransaction().commit();
//	
//	Out.w("Succes!");	
//	
//	
//	List<Niveau> niveaux = em.createQuery("SELECT o FROM o").getResultList();
//	for(Niveau n:niveaux) {
//		System.out.println("Descripyion "); 
//	}
	
	
	/*
	 * CRUD
	 */
	
	// create 
	public void creerCombattant(String id, String prenom, String nom, int age, boolean sexe) {	
		System.out.println("+-------------------------------+");
		System.out.println("|   Creetion du Combattant      |");
		System.out.println("+-------------------------------+");

		Combattant comb = new Combattant();
		comb.setCombattantId(id);
		comb.setPrenom(prenom);
		comb.setNom(nom);
		comb.setAge(age);
		comb.setSexe(sexe);
		
		System.out.println("Creation avec succes !");	
		System.out.println("+-------------------------------+");
		System.out.println("| Combattant \t\t\tN?"+ id 
				+"|\n Prenom \t\t\t" + prenom + "\t\t\t|"
				+"|\n Nom \t\t\t\t" + nom + "\t\t\t|"
				+"|\n Age \t\t\t\t" + age + "\t\t\t|"
				+"|\n Sexe \t\t\t\t" + sexe + "\t\t\t|");
		System.out.println("+-------------------------------+"); 

	}
	
	
	// read
	public static void readCombattant() {		
		
	}
	
	// update
	public  void updateCombattant(Combattant comb) {

		System.out.println("+-------------------------------+");
		System.out.println("|   Changement du Combattant    |");
		System.out.println("+-------------------------------+");
		
		comb.setCombattantId("");
		comb.setPrenom("");
		comb.setNom("");
		comb.setAge(14);
		comb.setSexe(true);
		
		em.getTransaction().begin();
		em.persist(comb);
		em.getTransaction().commit();
		
		
	}
	
	// delete
	public static void deleteCombattant() {
		
	}
}
