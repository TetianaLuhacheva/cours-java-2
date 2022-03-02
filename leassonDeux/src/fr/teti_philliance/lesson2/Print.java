package fr.teti_philliance.lesson2;

import java.util.Scanner;

public class Print {
	public static Scanner scan = new Scanner(System.in);
	
	public static void ln(String text) {
		System.out.println(text);
	}
	
	public static void ln(void text) {
		System.out.println(text);
	}
	
	public static String scanStr() {
		return scan.nextLine();
	}
	
	public static int scanInt() {
		return scan.nextInt();
	}
	
	public static void scanClose() {
		scan.close();
	}
	

}
