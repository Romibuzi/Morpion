package com.LPDW.morpion.Model;

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
        super.markPlayer = markPlayer2;
        // check if the case is empty before apply changes
        if (TabPlayer[X][Y] == 0) {
            TabPlayer[X][Y] = markPlayer2;
            // check if the player has win
            if (super.checkWin()) {
                return true;
            }
        } // else, the case is not empty and was already checked by one of players
        else if(TabPlayer[X][Y] != 0) {
            return false;
        }

        return false;
    }
}
