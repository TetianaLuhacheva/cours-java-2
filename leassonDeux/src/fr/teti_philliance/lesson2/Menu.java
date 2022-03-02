package fr.teti_philliance.lesson2;

import java.util.Scanner;

public class Menu {
	public static void voir() {
		

		Print.ln("Vouz voulez fair quoi ?");
		Print.ln("1. Juste prix");
		Print.ln("2. Tic Tac Toe");
		Print.ln("3. Femer Apllication");
		 
		// afficher 
		Price.init();
		
		// etes vous prete /oui/non
		System.out.println("êtes-vous prêt(e) à commencer, tapez: oui/non ?");
		
		Scanner scanReponse = new Scanner(System.in);
		String reponse = scanReponse.nextLine();
		
		if(reponse.equals("oui")) {

		// jouer et retourner à menu
			Price.turn();			
		}
		else {
			System.out.println("Aurevoir!");
			
		}
		
	}
	
	
}
