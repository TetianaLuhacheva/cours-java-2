package fr.teti_philliance.jeuxAge;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int aloitoirAge() {
		System.out.println("Quel mon age ?");
		Random r = new Random();
		int low = 96;
		int high = 100;
		int monAge = r.nextInt(high-low) + low;
		
		return(monAge);
    }
	
	public static int scanneurAge() {
    	Scanner scanAge = new Scanner(System.in);
        System.out.println("\n\nQuel est mon age:");
        int intAge = 0;
        try {
        	String strAge = scanAge.nextLine();
        	intAge = Integer.parseInt(strAge);
        } catch(NumberFormatException e) {
        	System.out.println(e); 
        }
        
        
        return(intAge);
    }
 
    public static int onJoue() {   	
    	int monAge = aloitoirAge();
    	int intAge = 0;  
    	int score = 0;
        do {
        	score++;
        	intAge = scanneurAge();
        	
	        if (intAge > monAge) {
	        	System.out.println("Non, Je suis plus jeune ;)");
	        }
	
	        if (intAge < monAge) {
	        	System.out.println("Non, je suis plus vieux ;(");
	        }
	        
	        	
        	}
        	while (intAge != monAge);

        if (intAge == monAge) {
        	System.out.println("Oui! Félecitation!\n");
        	System.out.println("Tu a gagné: " + score + " points. \n");
        	
        }
        
        return score;
    }
    
    public static String demandePseudo() {
    	
    	Scanner scanAge = new Scanner(System.in);
    	System.out.println("Ton pseudo : ");
        String pseudo = scanAge.nextLine(); 
    	
    	return pseudo;
    }
    
    public static List<String> sauvgardePseudo(String pseudo) {    	
    	List<String> pseudos = new ArrayList<String>(); 
    	pseudos.add(pseudo); 
    	
    	return pseudos;
    }
    
    		
    public static void  voirMenu(String nom, int score, Dictionary<String, Integer> menu) {
    	menu.put(nom, score);  
	    System.out.println("\n" + menu);    
    }

	public static void main(String[] args) {
		System.out.println("\n");
		
		String exit = "";
	    Dictionary<String, Integer> menu = new Hashtable<String, Integer>();
		do {
			String nom = demandePseudo();
			int score = onJoue();
			//sauvgardePseudo(nom);

			voirMenu(nom, score, menu);
			
			System.out.println("Pour finir, tapez 'oui'");
			
	    	Scanner scanExit = new Scanner(System.in);
	    	System.out.println("oui\\non : ");
	        exit = scanExit.nextLine();     	 			
	        }
	    	while (!exit.equals("oui"));
		
		System.out.println("la fin");
		
	}
	
}
