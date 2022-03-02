package fr.boxe.run;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.boxe.model.Stade;
import fr.boxe.service.ServiceStade;
import fr.boxe.ui.MainFrame;

public class Main {

	public static void main(String[] args) {	

		//new Menu();
		//new MainFrame();
	
		
		// Test function CREATION
		
//		ServiceStade serviceStade = new ServiceStade();
//		Stade stade = new Stade();
//		
//		stade.setCodeStade("001");
//		stade.setNom("Stade N�1");
//		stade.setNombrePlace(100);
//		
//		serviceStade.create(stade);
//		Out.w("Creation reussie");
	

		// Test function FIND ALL ()
		

		ServiceStade serviceStade = new ServiceStade();
		List<Stade> stades = serviceStade.findAll();
		if(stades != null && !stades.isEmpty()) {
			for(Stade stade:stades) {
				Out.w(stade.getCodeStade() + " - " + stade.getNom());
			}
		}
		
	}

}
