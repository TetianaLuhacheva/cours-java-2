package fr.boxe.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mach")
public class Match implements Serializable{
	
	@Id	
	@Column(name="MachId")
	private String codeMatch;

	@Column(name="MachDate")
	private Date dateMatch;

	@Column(name="MachCombat1")
	private Combattant Combattant1;

	@Column(name="MachCombat2")
	private Combattant Combattant2;

	public Match() {
	}

	public String getCodeMatch() {
		return codeMatch;
	}

	public void setCodeMatch(String codeMatch) {
		this.codeMatch = codeMatch;
	}

	public Date getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(Date dateMatch) {
		this.dateMatch = dateMatch;
	}

	public Combattant getCombattant1() {
		return Combattant1;
	}

	public void setCombattant1(Combattant combattant1) {
		Combattant1 = combattant1;
	}

	public Combattant getCombattant2() {
		return Combattant2;
	}

	public void setCombattant2(Combattant combattant2) {
		Combattant2 = combattant2;
	}
	
	
	
}
