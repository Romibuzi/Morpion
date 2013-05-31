package com.LPDW.morpion.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.LPDW.morpion.R;

public class PlayView extends View
{
    public PlayView(Context context, AttributeSet attrs)
    {
        super(context);
    }

    /**
     * Function to set the round or cross image to the ImageView element
     *
     * @param image : the ImageView element
     * @param Marker : the marker corresponding to the player id
     */
    public static void changeImageCase(ImageView image, int Marker)
    {
        if (Marker == 1) {
            image.setImageResource(R.drawable.croix);
        } else if (Marker == 2) {
            image.setImageResource(R.drawable.rond);
        }
        // set enabled the image
        image.setEnabled(false);
    }

    public void displayScores()
    {

    }


}
