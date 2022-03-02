package fr.nicolas.nicolas_tictoctoe; 

public class TicTacToe {
    /**
     * Enumeration qui g�re le tour du joueur
     */
    public enum TurnEnum {
        O,
        X,
    }

    /**
     * Variable de type TurnEnum qui contient le tour du joueur actuel
     */
    public TurnEnum turn = TurnEnum.O;

    /**
     * Enumeration qui g�re le tour du joueur
     */
    public enum CaseEnum {
        // seulement en string
        none,
        O,
        X,
    }

    /**
     * Tableau de jeu de tictactoe
     */
    public CaseEnum[][] board = {
            { CaseEnum.none, CaseEnum.none, CaseEnum.none },
            { CaseEnum.none, CaseEnum.none, CaseEnum.none },
            { CaseEnum.none, CaseEnum.none, CaseEnum.none },
    };

    Players[] players;

    /**
     * Constructeur (fonction qui se lance � la cr�ation de l'objet)
     */
    TicTacToe(Players[] selectedPlayers) {
        players = selectedPlayers;

        System.out.println("Lancement de TicTacToe !");

        // on affiche le tableau
        display();
        System.out.println();

        while (true) {
            // on propose au joueur de jouer
            play();
            System.out.println();

            // on affiche le tableau
            display();
            System.out.println();

            // on v�rifie si le joueur � gagn�
            if (isWine()) {

                if (turn == TurnEnum.O) {
                    players[0].score = players[0].score + 10;
                    System.out.println(players[0].pseudo + " � gagner (+10 points)");
                } else {
                    players[1].score = players[1].score + 10;
                    System.out.println(players[1].pseudo + " � gagner (+10 points)");
                }

                break;
            }


            if (isEqualiy()) {
                players[0].score = players[0].score + 5;
                players[1].score = players[1].score + 5;
                System.out.println(players[0].pseudo + " et " + players[1].pseudo + " on fait �galit� ! (+5 points chacun)");
                break;
            }

            // on change le tour avant de relancer la boucle
            switchTurn();
        }
    }

    /**
     * Affichage du tableau de jeu
     */
    public void display() {
        System.out.println("  A B C");

        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print((board[i][j] == CaseEnum.none ? "-" : board[i][j] == CaseEnum.O ? "O" : "X") + " ");
            }
            System.out.println();
        }
    }

    /**
     * Modification du tour du joueur
     */
    public void switchTurn() {
        if (turn == TurnEnum.O) {
            turn = TurnEnum.X;
        } else {
            turn = TurnEnum.O;
        }
    }

    /**
     * V�rifie si la partie est gagn�e
     */
    public boolean isWine() {

        // on v�rifie chaque ligne et chaque colonne
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != CaseEnum.none && board[i][0] == board[i][1] && board[i][0] == board[i][2]
                    || board[0][i] != CaseEnum.none && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }

        // on v�rifie les deux diagonales
        if (board[0][0] != CaseEnum.none && board[0][0] == board[1][1] && board[0][0] == board[2][2]
                || board[0][2] != CaseEnum.none && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        // si rien ne correspond on return false
        return false;
    }

    /**
     * V�rifie si la partie est une �galit�
     */
    public boolean isEqualiy() {
        
        boolean isEqualiy = true;

        // on v�rifie chaque ligne et chaque colonne
        for (int i = 0; i < board.length; i++) {
            if (!((board[i][0] == CaseEnum.X || board[i][1] == CaseEnum.X || board[i][2] == CaseEnum.X) && (board[i][0] == CaseEnum.O || board[i][1] == CaseEnum.O || board[i][2] == CaseEnum.O))) {
                isEqualiy = false;
            }
            if (!((board[0][i] == CaseEnum.X || board[1][i] == CaseEnum.X || board[2][i] == CaseEnum.X) && (board[0][i] == CaseEnum.O || board[1][i] == CaseEnum.O || board[2][i] == CaseEnum.O))) {
                isEqualiy = false;
            }
        }

        if (!((board[0][0] == CaseEnum.X || board[1][1] == CaseEnum.X || board[2][2] == CaseEnum.X) && (board[0][0] == CaseEnum.O || board[1][1] == CaseEnum.O || board[2][2] == CaseEnum.O))) {
            isEqualiy = false;
        }

        if (!((board[0][2] == CaseEnum.X || board[1][1] == CaseEnum.X || board[2][0] == CaseEnum.X) && (board[0][2] == CaseEnum.O || board[1][1] == CaseEnum.O || board[2][0] == CaseEnum.O))) {
            isEqualiy = false;
        }

        return isEqualiy;
    }

    /**
     * Fonction qui permet � l'utilisateur de jouer
     */
    public void play() {
        if (turn == TurnEnum.O) {
            System.out.println("A " + players[0].pseudo + " de jouer");
        } else {
            System.out.println("A " + players[1].pseudo + " de jouer");
        }

        // ligne et colonne choisies par l'utilisateur
        int line = 0;
        int column = 0;

        // Permet de d�finir si l'utilisateur � donn� une r�ponse valide
        boolean goodFormat = false;

        // Tant que la r�ponse n'est pas valide, on r�p�te la demande
        while (!goodFormat) {
            // on demande une valeur � l'utilisateur
            String res = Scan.nextLine();

            // Si l'utilisateur a donn� une r�ponse qui contient 2 caracteres
            if (res.length() == 2) {
                // on indique que le format est bon
                goodFormat = true;

                // on stocke le premier caractere dans columnText et le second dans lineText
                String columnText = String.valueOf(res.charAt(0)); // A
                String lineText = String.valueOf(res.charAt(1)); // 1

                try {
                    // on essaie de convertir lineText en int
                    line = Integer.parseInt(lineText);

                    // Si columnText est �gale � A, B ou C, on applique l'index correspondant �
                    // "column"
                    // Sinon, on indique que le format est faux
                    if (columnText.equals("A") || columnText.equals("a")) {
                        column = 0;
                    } else if (columnText.equals("B") || columnText.equals("b")) {
                        column = 1;
                    } else if (columnText.equals("C") || columnText.equals("c")) {
                        column = 2;
                    } else {
                        goodFormat = false;
                    }

                    // Si line est sup�rieure � 0 et inf�rieure � 4
                    if (line > 0 && line < 4) {
                        // On fait -1 sur line car la r�ponse de l'utilisateur est comprise entre 1 et 3
                        // alors que notre fonctionne
                        // avec des valeurs entre 0 et 2
                        line--;

                        if (board[line][column] != CaseEnum.none) {
                            goodFormat = false;
                            System.out.println("Cette case est d�j� utiliser");
                        }
                    } else {
                        // Si l'utilisateur n'� pas rentr� une valeur entre 1 et 3, alors on indique
                        // que le format de la r�ponse est faux
                        goodFormat = false;
                    }

                    if (!goodFormat) {
                        System.out.println("Cette case n'existe pas");
                    }
                } catch (NumberFormatException e) {
                    // Si la conversion en int �choue, on indique que le format est mauvais et la
                    // boucle se relance
                    goodFormat = false;
                    System.out.println("Le format de la r�ponse n'est pas valide");
                }

            } else {
                System.out.println("La r�ponse ne doit contenir que deux caracteres");
            }
        }

        if (turn == TurnEnum.O) {
            board[line][column] = CaseEnum.O;
        } else {
            board[line][column] = CaseEnum.X;
        }
    }

}