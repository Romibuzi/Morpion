package com.LPDW.morpion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.LPDW.morpion.Model.Data;

public class ResultsActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        sendToViewResultsData();
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
     */
    public void sendToViewResultsData()
    {
        // Call the data object and get data
        Data data = Data.getInstance();

        int resultPlayer1 = data.getScoresPlayer1();
        int resultPlayer2 = data.getScoresPlayer2();

        // if winner exists
        if (data.getplayerWinner() != 0) {
            Toast toast = Toast.makeText(this, data.getTheWinnerName()+" has win", Toast.LENGTH_SHORT);
            toast.show();
        } // if anyone has win
        else {
            Toast toast = Toast.makeText(this, "Nobody has win !", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    /**
     * Function used to pass to play View
     * @param v : View
     * @return void
     */
    public void RestartGame(View v)
    {
        // pass to the play activity
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }
}
