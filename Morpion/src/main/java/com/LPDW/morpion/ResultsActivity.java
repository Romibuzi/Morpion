package com.LPDW.morpion;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
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

        // recup scores, then fill results TextView in the view
        String namePlayer1 = data.getPseudo1();
        String namePlayer2 = data.getPseudo2();

        int resultPlayer1 = data.getScoresPlayer1();
        int resultPlayer2 = data.getScoresPlayer2();

        TextView ScorePlayer1 = (TextView)findViewById(R.id.player1Results);
        TextView ScorePlayer2 = (TextView)findViewById(R.id.player2Results);

        ScorePlayer1.setText(namePlayer1 + " : " + resultPlayer1);
        ScorePlayer2.setText(namePlayer2 + " : " + resultPlayer2);

        // if winner exists
        if (data.getplayerWinner() != 0) {
            Toast toast = Toast.makeText(this, data.getTheWinnerName()+" has win", Toast.LENGTH_SHORT);
            toast.show();
        } // if nobody has win
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
