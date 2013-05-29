package com.LPDW.morpion.Model;


public class MorpionManager
{


    static int[][] TabPlayer;


    int getX()
    {
        return TabPlayer[3][1];

    }

    void MorpionManager()
    {
        TabPlayer = new int[3][];
        for (int i=0 ; i<TabPlayer.length; i++)
        {
            TabPlayer[i]=new int[3];

            TabPlayer[i][1] = i;
        }



        int[][] matrice=new int[5][];
        for (int i=0 ; i<matrice.length; i++)
            matrice[i]=new int[6];
}

    protected void CalculResult()
    {
    }

    protected void Play()
    {
    }
}
