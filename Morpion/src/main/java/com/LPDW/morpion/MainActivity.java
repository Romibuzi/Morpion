package com.LPDW.morpion;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Function called when play button is clicked
     */
    public void launchGame(View v)
    {
        // Get the two pseudo fields values
        EditText pseudoOne  = (EditText) findViewById(R.id.pseudo1Text);
        EditText pseudoTwo  = (EditText) findViewById(R.id.pseudo2Text);

        // If one of two pseudos are null or equals at "pseudo", render a toast
        if (pseudoOne.getText().toString().equals("pseudo") ||
            pseudoTwo.getText().toString().equals("pseudo") ||
            pseudoOne.getText().toString().trim().length() == 0 ||
            pseudoTwo.getText().toString().trim().length() == 0) {

            Toast toast = Toast.makeText(this, "Veuillez rentrer des pseudos valide!", Toast.LENGTH_SHORT);
            toast.show();
        }
        // else, pass to the play Activity
        else {
            Intent intent = new Intent(v.getContext(), PlayActivity.class);
            startActivityForResult(intent, 0);
        }

    }
    
}
