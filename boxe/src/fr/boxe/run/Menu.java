package fr.boxe.run;

public class Menu {

	/*
	 * Accepte seulement trois parametres :
	 * 
	 * > combattant
	 * > stade
	 * > match
	 * 
	 */
	
	public Menu() {
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		Out.w("+++|                               |+++");
		Out.w("+++|          Main Menu            |+++");
		Out.w("+++|                               |+++");
		Out.w("++++-------------------------------++++"); 
		Out.w("++++-------------------------------++++");
		Out.w("+++|                               |+++");
		Out.w("+++|     1 - combattant Menu       |+++");
		Out.w("+++|     2 - stade      Menu       |+++");
		Out.w("+++|     3 - match      Menu       |+++");
		Out.w("+++|                               |+++");
		Out.w("++++-------------------------------++++"); 
		Out.w("++++-------------------------------++++");
		Out.w("+++|                               |+++");
		Out.w("+++|    Meke your choice :             ");
		String choice = Out.r(); 
		Out.w("+++|                               |+++");
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		 
		
		subMenu(choice);
		boolean choixFini = true;
		int choix = Out.rInt();
	
		
		while(choixFini) {
			
			switch(choix) {
			
			case 1:
				Out.w("+-------------------------------+");
				Out.w("|           - - match           |");
				Out.w("+-------------------------------+"); 
				
				
				break;
				
			case 2:
				Out.w("+-------------------------------+");
				Out.w("|         - - stade Menu        |");
				Out.w("+-------------------------------+");				
				break;
				
			case 3:
				Out.w("+-------------------------------+");
				Out.w("|        - - match Menu         |");
				Out.w("+-------------------------------+");				
				break;
				
			case 4:
				Out.w("+-------------------------------+");
				Out.w("|             GO OUT            |");
				Out.w("+-------------------------------+");
				break;
 
			default :
				Out.w("+---------------------------------------+");
				Out.w("|                                       |");
				Out.w("|   You bad choice, try another one !   |");
				Out.w("|                                       |");
				Out.w("+---------------------------------------+");
				break;			
			}			
		}
		
		
		
	}
	
	public static void subMenu(String obj) {
		
		/*
		-	saisir les combattants, 
		-   lister tous les combattants, 
		-   supprimer un combattant, 
		- 	modifier un combattant avec la m?thode ?merge?. 
		
			NB : pour utiliser la m?thode merge et remove  ?d?entityManager ?, 
				il faut au pr?alable utiliser la m?thode find 
				pour mettre l?entit? dans le contexte JPA.
				
			-	saisir, modifier, supprimer, lister  un stade,
			-	de saisir un match qui doit opposer deux combattants, 
			- de le supprimer, lister tous les matchs.
		 */
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		Out.w("+++|                               |+++");
		Out.w("+++|      " + obj + "  Menu        |+++");
		Out.w("+++|                               |+++");
		Out.w("+++|  1 - saisir le " + obj + "    |+++");
		Out.w("+++|  2 - lister tous " + obj + "s |+++");
		Out.w("+++|  3 - supprimer un " + obj + " |+++");
		Out.w("+++|  4 - modifier un " + obj + "  |+++");
		Out.w("+++|      avec la m?thode ?merge?  |+++");
		Out.w("+++|                               |+++");
		Out.w("+++|                               |+++");
		Out.w("+++|                               |+++");
		Out.w("++++-------------------------------++++");
		Out.w("++++-------------------------------++++");
		
		
		// - merge et remove ?d?entityManager ?
		// - la m?thode find pour mettre l?entit? dans le contexte JPA
		
		// - saisir, modifier, supprimer, lister  un stade,
		// - de saisir un match qui doit opposer deux combattants
		
		Out.w("");  
	}
	

	public static void crudMenu(String obj) {
		
		boolean choixFini = true;
		int choix = Out.rInt();
	
		
		while(choixFini) {
			
			switch(choix) {
			
			case 1:
				Out.w("+-------------------------------+");
				Out.w("|             Create            |");
				Out.w("+-------------------------------+"); 
				
				break;
				
			case 2:
				Out.w("+-------------------------------+");
				Out.w("|              Read             |");
				Out.w("+-------------------------------+");				
				break;
				
			case 3:
				Out.w("+-------------------------------+");
				Out.w("|             Update            |");
				Out.w("+-------------------------------+");				
				break;
				
			case 4:
				Out.w("+-------------------------------+");
				Out.w("|             Update            |");
				Out.w("+-------------------------------+");
				break;

			case 5:
				Out.w("+-------------------------------+");
				Out.w("|             Update            |");
				Out.w("+-------------------------------+");
				break;
			default :
				break;			
			}			
		}
	}

}
