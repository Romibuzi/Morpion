package com.LPDW.morpion;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import com.LPDW.morpion.Model.Data;

public class ResultsActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        sendToViewResultsData();

        setContentView(R.layout.activity_results);
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
    public void sendToViewResultsData(){

        // Call the data object and get data
        try {
            Data data = Data.getInstance();

            // if anyone has win
            if(data.getplayerWinner() == 0){



            }
            // if a player has win
            else{



            }
        } catch(Exception e) {
            Log.v("ERREUR D\'INSTANCIATION", "exception", e);
        }
    }
}
