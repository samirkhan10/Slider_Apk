package com.example.sliderapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int imageArray[] = {R.drawable.beachimg,R.drawable.placeimag,R.drawable.a2,R.drawable.flower};
        flipper = findViewById(R.id.fliper);

        for (int i = 0; i<imageArray.length;i++)
            showImage(imageArray[i]);
    }

    public void showImage(int img){

        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);


    }
}