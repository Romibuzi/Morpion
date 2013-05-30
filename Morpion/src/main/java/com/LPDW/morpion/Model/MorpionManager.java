package com.LPDW.morpion.Model;

import android.util.Log;

import java.util.Vector;

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
        Log.v("methode", "rentre dans la methode");
        TabPlayer = new int[3][3];
        for (int i =0; i<3; i++) {
            for (int j=0; j<3; j++) {
                TabPlayer[i][j] = 0;
            }
        }
    }

    protected void CalculResult()
    {
    }

    protected void Play()
    {
    }
}
