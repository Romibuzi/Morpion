package com.LPDW.morpion.Model;

import android.util.Log;

public class MorpionManager
{
    // Properties
    protected static int[][] TabPlayer;

    /**
     * Constructor
     */
    public MorpionManager()
    {
        createTabPlayer();
    }

    /**
     * Function to Initialize & Create TabPlayer
     */
    private void createTabPlayer()
    {
        Log.v("methode creation Table", "Création du tableau TabPlayer");
        TabPlayer = new int[3][3];
        resetPlayerTab();
    }

    /**
     * Function to reset TabPlayer
     */
    public void resetPlayerTab()
    {

        for (int i =0; i<3; i++) {
            for (int j=0; j<3; j++) {
                TabPlayer[i][j] = 0;
            }
        }


    }
}
