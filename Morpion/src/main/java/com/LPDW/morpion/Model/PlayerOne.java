package com.LPDW.morpion.Model;


import android.util.Log;

public class PlayerOne extends MorpionManager
{
    int markPlayer1 = 1;

    protected void CalculResult()
    {
    }

    protected void Play(int X, int Y)
    {
        // check if empty case
        if (TabPlayer[X][Y] == 0) {
            TabPlayer[X][Y] = markPlayer1;
            Log.e("case coché", ""+TabPlayer[X][Y]);
            // TODO : CHECK WIN

        } else if(TabPlayer[X][Y] != 0) {
            Log.e("case pas egale a zero", "case déjà prise");
        }
    }
}
