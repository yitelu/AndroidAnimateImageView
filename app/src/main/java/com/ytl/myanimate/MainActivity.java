package com.ytl.myanimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){
        ImageView bartImageView = findViewById(R.id.bart);
        ImageView homerImageView = findViewById(R.id.homer);

        //animate the icon to turn and fade away completely
        //bartImageView.animate().rotation(1800).alpha(0).setDuration(1000);

        //animate image shrink to 50% smaller
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = findViewById(R.id.bart);

        bartImageView.setX(-1000);

        //bartImageView.animate().translationYBy(-2000).rotation(3600).setDuration(1000);
        bartImageView.animate().translationXBy(1000).rotation(1800).setDuration(2000);

        //bartImageView.translationX(-1000).translationXBy(1000);


    }
}
