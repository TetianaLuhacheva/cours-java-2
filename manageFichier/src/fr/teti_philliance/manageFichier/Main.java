package fr.teti_philliance.manageFichier;
import java.util.Scanner;

// DICTIONNAIRE BASIC

import java.util.*;

public class Main {

    // Homework
    public static void homeWork(String[] tasks) {
	    System.out.println("\nMy HomeWork :");
	    
	    for (int t = 0; t < tasks.length; t++){
	    	System.out.println(t+1 + " chose : " + tasks[t]);
	    	
	    }
//	    for (int t : tasks) {
//	    	System.out.println(t);
//	    }
    }
    
    // Variables et Commainaires
    public static void themeVariable() {
		
    			// string
    			String motCle1 = "CamelCase";
    			String motCle2 = "Congatunate";
    			
    			//int
    			int chiffre = 0;
    				
    			// boolean
    			boolean tornIn = true;
    			boolean tornOff = false;
    					
    			System.out.print(tornIn + ", " + tornOff);     			
    			
    			//char
    			char signEtoile = '*';
    			
    			//double 
    			double numDouble1 = 5.5;
    			double numDouble2 = 5;
    			System.out.println("\ndouble num: "+numDouble1);
    			System.out.println("double num: "+numDouble2);
    			
    			//float
    			float num1=5.5f;
    			float num2=5f;
    			//float test1 = 1.5123486; 
    			//float test2 = 1.51234868;
    			
    			System.out.println("\nfloat num1: "+ num1);
    			System.out.println("float num2: "+ num2);
    					
    			
    			// short
    			short numShort1 = 30000;
    			// hors d'intervalle -> ERROR
    			//short numShort1Error = 40000;
    			// hors d'intervalle -> ERROR
    			System.out.println("\nshort num: "+ numShort1);
    			//System.out.println("short num: "+ numShort1Error);
    			
    			short numShort2 = -30000;
    			// hors d'intervalle -> ERROR
    			//short numShort2Error = -33000;
    			System.out.println("short num: "+ numShort2);
    			//System.out.println("short num: "+ numShort2Error);
    			
    			// long
    			long numLong1=10L;
    			long numLong2=-10L;
    			System.out.println("\nlong num: "+ numLong1);
    			System.out.println("long num: "+ numLong2);
    			
    			// byte
    			byte numByte = 10;
    			System.out.println("\nbyte num: "+ numByte + "\n");
    			
    			//List \ Tableau
    		    String[] caracteristiques = new String[]{
    		    		"sansible a la casse", 
    		    		"strict",
    		    		"explicite"};
    		    
    		    //racourcie\d'acrocher
    		    String[] autres = {
    		    		"sansible a la casse", 
    		    		"strict", 
    		    		"explicite"};
    		     
    		    // universel
    		    //String[] autres = {"mot", 0, true, 0.1, *};
    			
    		    System.out.println("Tableau :");
    		    for(int i = 0; i < 3; i++) {
    		    	System.out.println(caracteristiques[i]);
    		    }
    }
    
    public static void allCollections() {
    	// Dictonnaire
		Dictionary<Integer, String> nomerRegles = new Hashtable<Integer, String>();
		
		nomerRegles.put(3, "nom du projet"); 
		nomerRegles.put(2, "qui appertient le projet (moi\\entrprise)");
		nomerRegles.put(1, "nom demain (pour example com\\fr)");

	    System.out.println("\n" + nomerRegles);
    		    
    }
    
    public static void premierDevoir(){
	    System.out.println("Hello World\n");
    	
    	//nom    	
        Scanner scannerNom = new Scanner(System.in);
        System.out.println("Quel est votr nom:");
        String nom = scannerNom.nextLine();
        
    	//ageTet
        Scanner scannerAge= new Scanner(System.in);
        System.out.println("Quel est votr âge:");
        String age = scannerAge.nextLine();
        
        System.out.println("\nBonjour " + nom + ", vous avez " + age + " ans");  
    } 

    

    
        
    
    
	public static void main(String[] args) {	

		
		 
		// Variables
		//themeVariable();	
		
	    // Methods
//	    String[] tasks = {
//	    		"regarder les autres\\tous les types\\structures de donées ", 
//	    		"regarder quand on utilise public\\private", 
//	    		"regarder quand on utilise void\\string\\int"};
		//allCollections();
	    //homeWork(tasks);	    
	    
	    
	    
	    
	    
	    // Question:
	    // 0. pouruoi les commaines sont rouges ?
	    // 1. Structure :System.out.println 

	    
	}

}
