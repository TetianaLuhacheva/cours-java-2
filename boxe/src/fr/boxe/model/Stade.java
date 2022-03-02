package fr.boxe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stade")
public class Stade implements Serializable{

	@Id	
	@Column(name="STADE_ID")
	private String codeStade;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="PLACES")
	private int nombrePlace;

	public Stade() {
	}

	public String getCodeStade() {
		return codeStade;
	}

	public void setCodeStade(String codeStade) {
		this.codeStade = codeStade;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

}
