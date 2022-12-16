package com.riosgame.llamadasymensages;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText numero;
    EditText mensa;
    Button send;
    Button Call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText) findViewById(R.id.number);
        Call = (Button) findViewById(R.id.llamar);
        send = (Button) findViewById(R.id.msm);

        mensa = (EditText) findViewById(R.id.mensage);
        send.setOnClickListener(this);
        Call.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.llamar:
                llamar();
                break;

            case R.id.msm:
                enviar();
            default:
                break;

        }
    }

    private void enviar() {
        //String texto = numero.getText().toString();
        String mens = mensa.getText().toString();

        Uri ur = Uri.parse("smsto:+971508739835");
        Intent i = new Intent(Intent.ACTION_SENDTO,ur);
        i.putExtra("sms_body" , mens);
        startActivity(i);
    }

    private void llamar() {

        Uri u = Uri.parse("tel: +971508739835");
        Intent i = new Intent(Intent.ACTION_DIAL,u);
        startActivity(i);

    }
}
