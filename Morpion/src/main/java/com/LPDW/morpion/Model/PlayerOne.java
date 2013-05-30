package com.LPDW.morpion.Model;


import android.util.Log;

public class PlayerOne extends MorpionManager
{
    int markPlayer1 = 1;

    protected void CalculResult()
    {
    }

    protected boolean Play(int X, int Y)
    {
        // check if empty case
        if (TabPlayer[X][Y] == 0) {
            TabPlayer[X][Y] = markPlayer1;
            Log.e("case coché", ""+TabPlayer[X][Y]);
            // TODO : CHECK WIN
            if (checkWin()) {
                Log.v("win", "player one has win");
                return true;
            }
        } else if(TabPlayer[X][Y] != 0) {
            Log.e("case pas egale a zero", "case déjà prise");
            return false;
        }
        return false;
    }

    protected boolean checkWin()
    {
        for(int i = 0; i < 3; i++) {
            if(TabPlayer[i][0] == TabPlayer[i][1] && TabPlayer[i][0] == TabPlayer[i][2] && TabPlayer[i][0] == 1) {
                return true;
            }
            if(TabPlayer[0][i] == TabPlayer[1][i] && TabPlayer[0][i] == TabPlayer[2][i] && TabPlayer[0][i] == 1) {
                return true;
            }
        }
        return false;
    }
}
