package fr.nicolas.nicolas_tictoctoe; 
 
import java.util.ArrayList;


public class Menu {
    public static ArrayList<Players> players = new ArrayList<Players>();

    /**
     * Initialise les joueurs avant d'afficher le menu
     */
    public static void init() {
        createPlayer();
        display();
    }

    /**
     * Fonction qui affiche le menu
     */
    public static void display() {


        
        // On affiche le menu
        System.out.println("Menu :");
        System.out.println(" - 1 : Afficher la liste des joueurs");
        System.out.println(" - 2 : Crée un nouveau joueur");
        System.out.println(" - 3 : Morpion");
        System.out.println(" - 4 : Stopper le programme");

        // on demande à l'utilisateur une valeur entre 1 et 2
        int res = Scan.nextInt(1, 3);

        System.out.println();
        if (res == 1) {
            displayPlayers(true);
            System.out.println("Appuyer entrée pour continuer");
            Scan.nextLine();
            display();
        } else if (res == 2) {
            createPlayer();
            display();
        } else if (res == 3) {

            // Si le nombre de joueurs est inférieur à deux, alors on propose d'en créer un
            if (players.size() < 2) {
                System.out.println("Il faut 2 joueurs pour jouer au morpion, veuillez en créer un nouveau");
                createPlayer();
            }

            Players[] array = selectPlayers(2);


            // lancer le tictactoe
            new TicTacToe(array);
            display();
        }
    }

    /**
     * Fonction qui affiche la liste des joueurs
     * 
     * @param title true if you want display the title of list
     */
    public static void displayPlayers(boolean title) {

        if (title)
            System.out.println("Liste des joueurs :");

        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + " - " + players.get(i).pseudo + " : " + players.get(i).score);
        }

        System.out.println();
    }

    /**
     * Permet de crée un nouveau joueur
     */
    public static void createPlayer() {
        System.out.println("Entrez votre pseudo");

        while (true) {
            String pseudo = Scan.nextLine();
            if (pseudo.length() >= 2) {
                boolean pseudoExists = false;

                for (Players player : players) {
                    if (player.pseudo.equals(pseudo)) {
                        pseudoExists = true;
                    }
                }

                if (!pseudoExists) {
                    players.add(new Players(pseudo));
                    System.out.println();
                    break;
                } else {
                    System.out.println("Pseudo déjà utilisé, choisissez en un autre");
                }
            } else {
                System.out.println("Pseudo trop court, 2 caracteres minimum");
            }
        }
    }

    /**
     * Permet de sélectionner une liste de joueurs
     * 
     * @param nbplayers number of players to select
     */
    public static Players[] selectPlayers(int nbplayers) {
        

        Players[] selectedPlayers = new Players[nbplayers];


        for (int i = 0; i < nbplayers; i++) {
            System.out.println("Séléctionner le joueur n° " + (i + 1) + " qui vas jouer :");
            displayPlayers(false);

            while (true) {
                int idPLayer = Scan.nextInt(1, players.size());


                boolean alreadySelected = false;

                for (Players player : selectedPlayers) {
                    if (player != null && player.pseudo.equals(players.get(idPLayer - 1).pseudo)) {
                        alreadySelected = true;
                        break;
                    }
                }

                if (!alreadySelected) {
                    selectedPlayers[i] = players.get(idPLayer - 1);
                    break;
                } else {
                    System.out.println("Joueur déjà séléctionner, ajouter en un autre");
                }
            }
        }

        return selectedPlayers;
    }
}
