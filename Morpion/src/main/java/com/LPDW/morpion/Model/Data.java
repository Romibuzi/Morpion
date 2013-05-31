package com.LPDW.morpion.Model;

public class Data
{
    // properties
    MorpionManager MM;
    PlayerOne P1;
    PlayerTwo P2;
    String pseudo1;
    String pseudo2;
    int playerWinner;
    int scoresPlayer1;
    int scoresPlayer2;
    int turn;
    int nbTurn;
    private static Data INSTANCE = null;

    // GETTER - SETTERS
    public int getplayerWinner()
    {
        return playerWinner;
    }

    public void setplayerWinner(int playerWinner)
    {
        this.playerWinner = playerWinner;
    }

    public String getPseudo1()
    {
        return pseudo1;
    }

    public void setPseudo1(String pseudo1)
    {
        this.pseudo1 = pseudo1;
    }

    public String getPseudo2()
    {
        return pseudo2;
    }

    public void setPseudo2(String pseudo2)
    {
        this.pseudo2 = pseudo2;
    }

    public int getScoresPlayer2()
    {
        return scoresPlayer2;
    }

    public void setScoresPlayer2(int scoresPlayer2)
    {
        this.scoresPlayer2 += scoresPlayer2;
    }

    public int getScoresPlayer1()
    {
        return scoresPlayer1;
    }

    public void setScoresPlayer1(int scoresPlayer1)
    {
        this.scoresPlayer1 += scoresPlayer1;
    }

    public int getTurn()
    {
        return turn;
    }

    public void setTurn(int turn)
    {
        this.turn = turn;
    }

    public int getNbTurn()
    {
        return nbTurn;
    }

    public void setNbTurn(int nbTurn)
    {
        this.nbTurn += nbTurn;
    }

    /**
     * Private Constructor (for singleton pattern)
     */
    private Data()
    {
       // Instanciate the Morpion Manager and the Players
       this.MM = new MorpionManager();
       this.P1 = new PlayerOne();
       this.P2 = new PlayerTwo();
    }

    /**
     * Function which return the Data instance if it exists or new Data object if it doesn't exists (singleton pattern)
     *
     * @return INSTANCE : Data Object
     */
    public static Data getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new Data();
        }

        return INSTANCE;
    }


    /**
     * Function which call the different players, then make them play and check if they have win
     *
     * @param player : int identifier of the player
     * @param X : int position in row
     * @param Y : int position in col
     *
     * @return bool win or false
     */
    public boolean makeMove(int player, int X, int Y)
    {
        // increments the number of turn
        this.setNbTurn(1);

        if (player == 1) {
            // make the play for player one, if he make a win move => return result and set playerWinner for playerOne
            if (this.P1.Play(X, Y)) {
                this.setScoresPlayer1(1);
                this.setplayerWinner(1);
                return true;
            } else {
                // set turn to Player 2
                this.setTurn(2);
                return false;
            }
        } else if (player == 2) {
            // same as player one
            if (this.P2.Play(X, Y)) {
                this.setScoresPlayer2(1);
                this.setplayerWinner(2);
                return true;
            } else {
                // set turn to Player 1
                this.setTurn(1);
                return false;
            }
        }

        return false;
    }

    /**
     * Function used to reset TabPlayer
     */
    public void resetPlayerTab()
    {
        this.MM.resetPlayerTab();
    }

    /**
     * Function used to recup the Name of the Winner
     *
     * @return String : name of the player if it exists
     * @return null if no Winner
     */
    public String getTheWinnerName()
    {
        switch(this.getplayerWinner()) {
            case(0):
                return null;
            case(1):
                return this.getPseudo1();
            case(2):
                return this.getPseudo2();
            default:
                return null;
        }
    }

    /**
     * Function used to reset all the data when a new game is launched
     */
    public void resetAllPlayViewData()
    {
        // Set turn to play at player1 & reset number of turn
        this.setTurn(1);
        this.setNbTurn(0);

        // reset player winner
        this.setplayerWinner(0);

        // reset TabPlayer
        this.MM.resetPlayerTab();
    }

}
