package com.LPDW.morpion.Model;


import android.util.Log;

public class PlayerTwo extends MorpionManager
{
    // Properties
    int markPlayer2 = 2;

    /**
     * Function to check if the box was checked
     *
     * @param X : row
     * @param Y : column
     *
     * @return bool
     */
    protected boolean Play(int X, int Y)
    {
        // check if empty case
        if (TabPlayer[X][Y] == 0) {
            TabPlayer[X][Y] = markPlayer2;
            Log.e("case coché", ""+X+Y+" =>"+TabPlayer[X][Y]);
            // check if the player has win
            if (checkWin()) {
                return true;
            }
        } else if(TabPlayer[X][Y] != 0) {
            Log.e("case pas egale a zero", "case déjà prise");
            return false;
        }
        return false;
    }

    /**
     * Function to check if the player 2 has win
     *
     * @return bool
     */
    protected boolean checkWin()
    {
        // check row & columns
        for(int i = 0; i < 3; i++) {
            if(TabPlayer[i][0] == TabPlayer[i][1] && TabPlayer[i][0] == TabPlayer[i][2] && TabPlayer[i][0] == markPlayer2) {
                return true;
            }
            if(TabPlayer[0][i] == TabPlayer[1][i] && TabPlayer[0][i] == TabPlayer[2][i] && TabPlayer[0][i] == markPlayer2) {
                return true;
            }
        }

        // check two diagonals
        if (TabPlayer[0][0] == TabPlayer[1][1] && TabPlayer[1][1] == TabPlayer[2][2] && TabPlayer[0][0] == markPlayer2) {
            return true;
        }
        if (TabPlayer[2][0] == TabPlayer[1][1] && TabPlayer[1][1] == TabPlayer[1][2] && TabPlayer[2][0] == markPlayer2) {
            return true;
        }

        return false;
    }
}
