package com.LPDW.morpion.Model;

import android.util.Log;

public class MorpionManager
{
    // Properties
    protected static int[][] TabPlayer;
    int markPlayer;

    /**
     * Constructor
     */
    public MorpionManager()
    {
        createTabPlayer();
    }

    /**
     * Function used to Initialize && Create TabPlayer
     */
    private void createTabPlayer()
    {
        Log.v("methode creation Table", "Création du tableau TabPlayer");
        TabPlayer = new int[3][3];
        resetPlayerTab();
    }

    /**
     * Function used to reset TabPlayer
     */
    public void resetPlayerTab()
    {
        for (int i =0; i<3; i++) {
            for (int j=0; j<3; j++) {
                TabPlayer[i][j] = 0;
            }
        }
    }

    /**
     * Function used to check if the player has win by checking different cases of winning
     *
     * @return bool
     */
    protected boolean checkWin()
    {
        // check by rows && by columns
        for(int i = 0; i < 3; i++) {
            if(TabPlayer[i][0] == TabPlayer[i][1] && TabPlayer[i][0] == TabPlayer[i][2] && TabPlayer[i][0] == markPlayer ||
               TabPlayer[0][i] == TabPlayer[1][i] && TabPlayer[0][i] == TabPlayer[2][i] && TabPlayer[0][i] == markPlayer) {
                return true;
            }
        }

        // check the two diagonals cases
        if (TabPlayer[0][0] == TabPlayer[1][1] && TabPlayer[1][1] == TabPlayer[2][2] && TabPlayer[0][0] == markPlayer ||
            TabPlayer[2][0] == TabPlayer[1][1] && TabPlayer[1][1] == TabPlayer[0][2] && TabPlayer[2][0] == markPlayer) {
            return true;
        }

        return false;
    }
}
