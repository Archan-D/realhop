package com.example.shred13.hop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
public final static String EXTRA_MESSAGE = "com.example.Hop.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void newActivity (View view) {
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);

    }
}
