package com.LPDW.morpion.Model;


public class Data
{
    int nbPlayers;
    String pseudo1;
    String pseudo2;
    int scores[];
    MorpionManager virtualPlay[];
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

    public int[] getScores()
    {
        return scores;
    }

    public void setScores(int[] scores)
    {
        this.scores = scores;
    }

    public MorpionManager[] getVirtualPlay()
    {
        return virtualPlay;
    }

    public void setVirtualPlay(MorpionManager[] virtualPlay)
    {
        this.virtualPlay = virtualPlay;
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
       // Instanciate the players
       PlayerOne P1 = new PlayerOne();
       PlayerTwo P2 = new PlayerTwo();
    }

    // Method which return the Data instance if it exists or new Data object if it doesn't exists
    public static Data getInstance()
    {
        if (INSTANCE == null) {
            INSTANCE = new Data();
        }
        return INSTANCE;
    }



}
