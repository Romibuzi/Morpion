package com.LPDW.morpion;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

import android.view.View;
import android.widget.ImageView;
import com.LPDW.morpion.Model.Data;

public class PlayActivity extends Activity
{
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        // Recup infos of the Data object
        this.data = Data.getInstance();
        String pseudo1 = data.getPseudo1();
        String pseudo2 = data.getPseudo2();

        Log.v("pseudo1 :", pseudo1);
        Log.v("pseudo2 :", pseudo2);
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
     * @param v
     */
    public void onThisBox(View v)
    {
        char row = (v.getTag().toString().charAt(0));
        char col = (v.getTag().toString().charAt(1));
        int X = Character.getNumericValue(row);
        int Y = Character.getNumericValue(col);
        int whichPlayer = data.getTurn();



        data.makeMove(whichPlayer, X, Y);
    }

}
