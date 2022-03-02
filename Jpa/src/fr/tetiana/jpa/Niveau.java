package fr.tetiana.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_niveau")
public class Niveau implements Serializable{
	
	@Id	
	@Column(name="niveau_cd")
	private String code;

	@Column(name="description")
	private String description;
	
	public Niveau() { 
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
