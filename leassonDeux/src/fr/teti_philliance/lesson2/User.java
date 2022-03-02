package fr.teti_philliance.lesson2;


public class User {
	public static int nbPlayers = 5;
	public String pseudo;
	public int score;
	public int time;
	
	
	public User(String pseudo, int score, int time) {
		this.pseudo = pseudo;
		this.score = score;
		this.score = time;
		
		Print.ln("un utilisateur \"" + pseudo + "\" est créé");
	}
	
	public void play() {
		Print.ln(pseudo);
	}
	
}





public class User {

	
}
