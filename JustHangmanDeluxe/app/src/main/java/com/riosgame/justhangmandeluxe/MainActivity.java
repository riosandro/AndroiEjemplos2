package com.riosgame.justhangmandeluxe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrar = (Button) findViewById(R.id.binicio);

        entrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent ie = new Intent(this,Home.class);
        startActivity(ie);
    }
}
