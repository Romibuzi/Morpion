package com.LPDW.morpion.Model;


import android.util.Log;

public class PlayerOne extends MorpionManager
{


    protected void CalculResult()
    {
    }

    protected void Play(int X, int Y)
            //protected void Play(Character X, Character Y)
    {
        Object o = "X";

        //MorpionManager test = (MorpionManager) this;


        int test2 = super.getX();

        if(TabPlayer[X][Y] == 0)
        {
            //TabPlayer[X][Y].equals(o);
            Log.v("player One", "Player One en Jeu !");

        }


        Log.v("player One", "Player One en Jeu !");
    }
}
