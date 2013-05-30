package com.LPDW.morpion.Model;


import android.util.Log;

public class PlayerTwo extends MorpionManager
{

    int markPlayer2 = 2;

    protected void CalculResult()
    {
    }

    protected void Play(int X, int Y)
    {
        // check if empty case
        if (TabPlayer[X][Y] == 0) {
            TabPlayer[X][Y] = markPlayer2;
            // TODO : CHECK WIN
            
        } else if(TabPlayer[X][Y] != 0) {
            Log.e("case pas egale a zero", "case déjà prise");
        }
    }
}
