package fr.boxe.service;

import java.util.List;

import fr.boxe.dao.DaoStade;
import fr.boxe.model.Stade;

public class ServiceStade {

	private DaoStade daoStade = null;
	
	public ServiceStade() {
		daoStade = new DaoStade();
	}
	
	public Stade create(Stade entity) {
		return daoStade.creerStade(entity);
	}

	public Stade read(String idValue) {
		return daoStade.readStade(idValue);
	}
	
	public Stade update(Stade entity) {
		return daoStade.updateStade(entity);
	}
	
	public void remove(Stade entity) {
		daoStade.deleteStade(entity);
	}
	
	public List<Stade> findAll(){
		return daoStade.findAll();
	}
}
