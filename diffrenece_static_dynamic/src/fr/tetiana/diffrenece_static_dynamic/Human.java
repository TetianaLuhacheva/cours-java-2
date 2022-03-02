package fr.tetiana.diffrenece_static_dynamic;

public class Human {
	

	// THEME 1: LA DIFFENRANCE
	public static int numberHuman = 0;
	public String colorEye = "blue";
	

	
	
	
	
	// pour la premier partie va marcher
	Human() {
		Human.numberHuman++;
	}
	
	// THEME 2: LA DIFFENRANCE
	
	Human(String color) {
		colorEye = color;
		Human.numberHuman++;
	}
	
}
