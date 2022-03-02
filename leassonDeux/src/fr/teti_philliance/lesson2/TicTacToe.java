package fr.teti_philliance.lesson2;

public class TicTacToe {
	public static void init() {
	String[][] morpion = {
			{"_", "_", "X"},
			{"_", "_", "_"},
			{"_", "_", "_"}
	};
	

	System.out.println("A B C");	
	for(int i = 0; i < morpion.length; i++) {

		System.out.print(i + 1 + " ");
		
		for(int j = 0; j < morpion.length; j++) {
			System.out.print(morpion[i][j] + " ");
		}
		System.out.println();
		
		//adré et asmaille
		
	}
  }
}

