package com.riosgame.chatiemos;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityChat extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_CHOOSE_PHONE = 1;
    private TextView vPhone;
    Button bContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        vPhone = (TextView) findViewById(R.id.textViewMensaEnviado);
       bContactos = (Button) findViewById(R.id.botonContact);
        bContactos.setOnClickListener(this);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode == REQUEST_CHOOSE_PHONE)
                && (resultCode == Activity.RESULT_OK)) {
            try {
                String phone = data.getStringExtra("phone");
                vPhone.setText(phone);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.botonContact:
                Intent intent = new Intent("com.riosgame.CHOOSE_PHONE");
                startActivityForResult(intent, REQUEST_CHOOSE_PHONE);
                break;
            default:
                break;


        }
    }


    }

