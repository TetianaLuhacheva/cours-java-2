package fr.teti_philliance.lesson2;


public class Main {
	
	public static void main(String[] args) {
		//System.out.println("Bienvenu!");
		
		//Menu.voir();
		
		//Print.ln(null);
		//test();
		TicTacToe.init();
	}

	private static void test() {
		
		int test = 5;
		
		User userN = new User("Nicolas", 500, 300);
		User userC = new User("Clément", 2300, 210);
		User userG = new User("Guillaume", 10, 456);
		
		userC.play();
		userG.play();
		
	}

}
