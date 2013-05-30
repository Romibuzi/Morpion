package com.LPDW.morpion.Model;

public class Data
{
    int nbPlayers;
    PlayerOne P1;
    PlayerTwo P2;
    MorpionManager MM;
    String pseudo1;
    String pseudo2;
    int scoresPlayer1;
    int scoresPlayer2;
    int turn;

    // Data Object
    private static Data INSTANCE = null;

    public int getNbPlayers()
    {
        return nbPlayers;
    }

    public void setNbPlayers(int nbPlayers)
    {
        this.nbPlayers = nbPlayers;
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

    // Private constructor
    private Data()
    {
       // Instanciate the Morpion Manager and the players
       this.MM = new MorpionManager();

       this.P1 = new PlayerOne();
       this.P2 = new PlayerTwo();
    }

    /**
     * Method which return the Data instance if it exists or new Data object if it doesn't exists
     */
    public static Data getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new Data();
        }
        return INSTANCE;
    }


    /**
     *
     */
    public void makeMove(int player, int X, int Y)
    {
        // TODO : MAKE THE GAME SYSTEM
        if (player == 1) {
            // make the play for player one
            if (this.P1.Play(X, Y)) {
                this.setScoresPlayer1(1);
            } else {
                // set turn to Player 2
                this.setTurn(2);
            }
        } else if (player == 2) {
            if(this.P2.Play(X, Y)) {
                this.setScoresPlayer2(1);
            }else{
                // set turn to Player 1
                this.setTurn(1);
            }
        }
    }



}
