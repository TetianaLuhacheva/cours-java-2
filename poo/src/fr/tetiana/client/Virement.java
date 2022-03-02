package fr.tetiana.client;

public class Virement {
	private Compte compteLudo;
	private Compte compteTeti;
	
	
	public Compte getCompteLudo() {
		return compteLudo;
	}
	public void setCompteLudo(Compte compteLudo) {
		this.compteLudo = compteLudo;
	}
	public Compte getCompteTeti() {
		return compteTeti;
	}
	public void setCompteTeti(Compte compteTeti) {
		this.compteTeti = compteTeti;
	}
	
	public void transfertLudo(double montant) { 
		compteTeti.setMontant(compteTeti.getMontant()-montant);
		compteLudo.setMontant(compteLudo.getMontant()+montant);
	}
	
	
}
