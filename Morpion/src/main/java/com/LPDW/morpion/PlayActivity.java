package com.LPDW.morpion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

import android.view.View;
import android.widget.ImageView;
import com.LPDW.morpion.Model.Data;
import com.LPDW.morpion.View.PlayView;

public class PlayActivity extends Activity
{
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Get data of the Data object
        data = Data.getInstance();
        String pseudo1 = data.getPseudo1();
        String pseudo2 = data.getPseudo2();

        // Set turn to play at player1 & reset number of turn
        data.setTurn(1);
        data.setNbTurn(0);

        // reset player winner
        data.setplayerWinner(0);

        Log.v("pseudo1 :", pseudo1);
        Log.v("pseudo2 :", pseudo2);
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        Log.e("onResume", "onResume motherfucker");

        // Get data of the Data object
        data = Data.getInstance();
        data.resetPlayerTab();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     *
     * Function called when a block of the Morpion is clicked
     *
     * @param v : View
     */
    public void onThisBox(View v)
    {
        char row = (v.getTag().toString().charAt(0));
        char col = (v.getTag().toString().charAt(1));
        int X = Character.getNumericValue(row);
        int Y = Character.getNumericValue(col);
        int whichPlayer = data.getTurn();

        boolean hasWin = data.makeMove(whichPlayer, X, Y);

        // If the player has win
        if (hasWin == true) {
            // Stop the game & call third activity to display scores
            Log.v("win", "player"+whichPlayer+" has win");
            // pass to the results activity
            goToResultsActivity();
        }
        // else if the player has lose
        else {
            if (data.getNbTurn() == 9) {
                // Stop the game & call third activity to display "AUNCUN GAGNANT !"
                Log.e("perdu", "partie terminée");
                // pass to the results activity
                goToResultsActivity();
            } else {
                // get the ImageView tapped, then change the image background by calling changeImageCase() only if the case was empty
                ImageView thisImg  = (ImageView)findViewById(v.getId());
                PlayView.changeImageCase(thisImg, whichPlayer);
            }
        }
    }

    /**
     * Function used to pass to the result activity
     */
    private void goToResultsActivity()
    {
        // pass to the results activity
        Intent intent = new Intent(this, ResultsActivity.class);
        startActivity(intent);
    }

}
