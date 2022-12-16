package com.riosgame.hechoscuriosos;

import android.opengl.Visibility;
import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void siguiente(View v){
       View myTextView = findViewById(R.id.textView);
       myTextView. setVisibility(View.VISIBLE);

    }
}
