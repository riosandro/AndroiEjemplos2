package com.riosgame.ejemploedad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int edad=0;
    char nombre[];
    EditText name;
    EditText age;
    Button Verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.Nombre);
        age = (EditText) findViewById(R.id.Edad);
        Verificar = (Button) findViewById(R.id.entrar);

       // name.setOnClickListener(this);
       // age.setOnClickListener(this);
        Verificar.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        String Cadena1 = age.getText().toString();
        int num1= Integer.parseInt(Cadena1);
      String cadena2 = name.getText().toString();

        if(num1<18){
            Toast.makeText(getApplicationContext(),cadena2 ,Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(getApplicationContext(),"Hola  eres mayor de edad",Toast.LENGTH_SHORT).show();
        }

    }
}
