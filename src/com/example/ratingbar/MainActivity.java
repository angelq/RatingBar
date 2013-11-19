package com.example.ratingbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RatingBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RatingBar rating = (RatingBar) findViewById(R.id.ratingBar3);
        rating.setRating(2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
