package fr.nicolas.nicolas_tictoctoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    /**
     * scanner de notre application
     */
    public static Scanner scan = new Scanner(System.in);

    /**
     * Fonction qui renvoie un String de la saisie utilisateur
     * 
     * @return String
     */
    public static String nextLine() {
        return scan.nextLine();
    }

    /**
     * Fonction qui renvoie un int de la saisie utilisateur
     * 
     * @param min chiffre minimum
     * @param max chiffre maximum
     * @return int
     */
    public static int nextInt(int min, int max) {
        // Tant qu'on as pas la r�ponse voulue, on boucle
        while (true) {
            try {
                // on essaie de r�cup�rer la saisie utilisateur
                int res = scan.nextInt();
                // si la r�ponse de l'utilisateur correspond aux parametres de la fonction on return le r�sultat
                if (res >= min && res <= max) {
                    scan.nextLine();
                    return res;
                } else {
                    // Si la r�ponse de l'utilisateur n'est pas valide, on affiche un message d'�rreur
                    System.out.println("Veuillez choisir un chiffre entre " + min + " et " + max);
                }
            } catch (InputMismatchException e) {

                // Si le code crash � cause d'une mauvaise saisie utilisateur (lettre au lieu de chiffre)
                // alors on affiche un message d'�rreur et on passe � la ligne avec scan.nextLine()
                System.out.println("Vous ne pouvez utiliser que des chiffres");
                scan.nextLine();
            }
        }
    }

}