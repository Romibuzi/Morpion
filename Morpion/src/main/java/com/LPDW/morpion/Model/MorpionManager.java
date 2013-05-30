package com.LPDW.morpion.Model;

import android.util.Log;

public class MorpionManager
{
    protected int[][] TabPlayer;

    public MorpionManager()
    {
        createTabPlayer();
        Log.v("constructor", "rentre dans le constructeur");
    }

    private void createTabPlayer()
    {
        Log.v("methode creation Table", "rentre dans la methode");
        TabPlayer = new int[3][3];
        for (int i =0; i<3; i++) {
            for (int j=0; j<3; j++) {
                TabPlayer[i][j] = 0;
            }
        }
    }
}
