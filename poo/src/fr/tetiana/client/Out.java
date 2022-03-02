package fr.tetiana.client;
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
}
	
