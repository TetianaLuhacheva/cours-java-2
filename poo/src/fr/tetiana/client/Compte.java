package fr.tetiana.client;

public class Compte {
	private String nom;
	private double montant = 0;	 
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double m) {
		this.montant = m;
	}	
	
	public double verser(double m) {
		return montant = montant + m;
	}
	
	
}
