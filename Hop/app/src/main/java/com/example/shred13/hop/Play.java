package com.example.shred13.hop;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class Play extends AppCompatActivity {
int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        final ImageButton imagebutton = (ImageButton) findViewById(R.id.left);
    imagebutton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            //
            ImageView circle = (ImageView) findViewById(R.id.imageView);
            if (counter =% 1) {
                circle.setBackgroundColor(Color.BLUE);
                //counter++;

            }
        }

        }
    );
        final ImageButton rightbutton = (ImageButton) findViewById(R.id.right);
        rightbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                ImageView circle = (ImageView) findViewById(R.id.imageView);
                circle.setBackgroundColor(Color.RED);
            }

        });
    }
    }



