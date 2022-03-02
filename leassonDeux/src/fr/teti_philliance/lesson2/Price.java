package fr.teti_philliance.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Price {
	static int  goal = 0;
	
	public static void init() {
		// TODO Auto-generated method stub		
		
		Random r = new Random();
		goal = r.nextInt(3);
	}
	
	public static void turn() {
		Scanner scan = new Scanner(System.in);
		int playerValue = 0;
		
		System.out.println("Choisissez 1-10");
		
		playerValue = scan.nextInt();
		 if (playerValue > goal) {
	        System.out.println("Non, Je suis plus jeune ;)");
	        turn();
        } else if (playerValue < goal) {
        	System.out.println("Non, je suis plus vieux ;(");
        	turn();
        } else {	        
        	System.out.println("Bien joue!");
        	Menu.voir();
     	}
     	// scan.close();
	}
}
