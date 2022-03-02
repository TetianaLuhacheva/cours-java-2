package fr.tetiana.diffrenece_static_dynamic;

import java.util.ArrayList;

import fr.tetiana.diffrenece_static_dynamic.Human;

public class Main {

	public static void main(String[] args) {
		
		
		// THEME 1: LA DIFFENRANCE
		
		// information sttaic
		Out.w(Human.numberHuman);
		
		// Ca ne va pas marcher
		//Out.w(Human.colorEye);
		
		// information dynamic
		// on a oblige object DE CLASS
		Human appearance1 = new Human();
		Out.w(appearance1.colorEye);
		
		
		

		// THEME 2

		ArrayList<Human> humans = new ArrayList<Human>();


		for (int i = 0; i < 50; i++) {
			humans.add(new Human(i == 10 ? "green" : "blue"));
		}
		
		for (int i = 0; i < humans.size(); i++) {
			Out.w(humans.get(i));
		} 
		
		Out.w(humans.get(10).colorEye);

		Out.w(Human.numberHuman);
		 
		
		
		
	}

}
