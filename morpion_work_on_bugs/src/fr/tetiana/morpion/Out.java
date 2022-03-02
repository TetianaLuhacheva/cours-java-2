package fr.tetiana.morpion;

import java.util.Scanner;

public class Out {
	public static Scanner scan = new Scanner(System.in);	
	
	// Write 
	public static void w(Object out){
		System.out.println(out);		
	}	
	
	// Get 
	public static String r() {	 
		return scan.nextLine();
	}	 
	
	// Others
	public static int rInt() {	 
		return scan.nextInt();
	}
	public static char rChar() {	 
		return scan.next().charAt(0);
	}
	public static long rLong() {	 
		return scan.nextLong();
	}
	public static double rDouble() {	 
		return scan.nextDouble();
	}
	

//	public static Object r(String typeOut) {
//		if(typeOut.equals("str")) {
//			return scan.nextLine();
//		} else if(typeOut.equals("int")) {
//			return scan.nextInt();
//		} else if(typeOut.equals("char")) { 
//			return scan.next().charAt(0);
//		} else if(typeOut.equals("long")) { 
//			return scan.nextLong();
//		} else if(typeOut.equals("double")) { 
//			return scan.nextDouble();
//		}
//		
//		return "Machine : 'I don't understand le type in breakes'";
//		
//	}

} 