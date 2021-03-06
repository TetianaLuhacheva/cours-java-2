package fr.boxe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Combattant")
public class Combattant implements Serializable {

	@Id	
	@Column(name="COMBATTANT_ID")
	private String combattantId;
	
	@Column(name="PRENOM")
	private String prenom; 
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="AGE")
	private int age;
	
	@Enumerated(EnumType.STRING)
	@Column(name="SEXE")
	private Genre sexe;

	public Combattant() {
	}

	public String getCombattantId() {
		return combattantId;
	}

	public void setCombattantId(String combattantId) {
		this.combattantId = combattantId;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Genre getSexe() {
		return sexe;
	}

	public void setSexe(Genre sexe) {
		this.sexe = sexe;
	}
 
}
