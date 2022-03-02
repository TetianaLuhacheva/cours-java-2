package fr.tetiana.exercicepoo;
import fr.tetiana.client.Compte;
import fr.tetiana.client.Virement;
import fr.tetiana.client.Out;

public class Main {
	static Compte teti = new Compte();		
	static Compte ludo = new Compte(); 

	

	public static void regarderComptes(Compte propriatair,Compte destinatair) {
		Out.w("\n\n_________________________________"); 
		Out.w(">>> COMPTES:\n");
		Out.w("Compte Teti : " + propriatair.getMontant());
		Out.w("Compte Ludo : " + destinatair.getMontant()); 
	}
	

	public static void regarderVirement(Compte propriatair,Compte destinatair) {
		Out.w("\n\n_________________________________"); 
		Out.w(">>> VERSEMENT:\n");
		Out.w( teti.getNom() + "a verse " + ludo.getMontant() + " a " + ludo.getNom() ); 
	}
	
	
	public static void main(String[] args) {

		// work with class Compte
		double compte = teti.verser(2000.50); 	 	
		compte = teti.verser(4000.50);  
		 

		// work with class Virement and Comptes
		regarderComptes(teti, ludo);

		// faire un transfeert
		Virement v1 = new Virement();
		v1.setCompteLudo(ludo);
		v1.setCompteTeti(teti);
		v1.transfertLudo(10.50);

		regarderVirement(teti, ludo);		
		regarderComptes(teti, ludo);
		
		
	}

}
