package com.riosgame.ejemplos_libros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public  class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText nombre;
    EditText contrasena;
    Button ingresar;
    Button olvidar;
    Button registrar;
    Button Dibujo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.editText);
        contrasena = (EditText) findViewById(R.id.editText2);
        ingresar = (Button) findViewById(R.id.Botingre);
        olvidar = (Button) findViewById(R.id.Botolvi);
        registrar = (Button) findViewById(R.id.Botregis);
        Dibujo = (Button) findViewById(R.id.Dibuj);

       // nombre.setOnClickListener((OnClickListener) this);
       // contrasena.setOnClickListener((OnClickListener) this);
        registrar.setOnClickListener((OnClickListener) this);
        ingresar.setOnClickListener((OnClickListener) this);
        olvidar.setOnClickListener((OnClickListener) this);
        Dibujo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.Botregis:
                String cadena1 = nombre.getText().toString();
                String cadena2 = contrasena.getText().toString();

                if (cadena1.equalsIgnoreCase("jose") && cadena2.equalsIgnoreCase("rios")) {
                    Toast.makeText(getApplicationContext(), "datos correctos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "datos incorrectos", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.Botingre:
                Intent intent = new Intent(this,Mysecondactivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "very good", Toast.LENGTH_SHORT).show();


                break;
            case R.id.Botolvi:
                nombre.setText("");
                contrasena.setText("");
                Toast.makeText(getApplicationContext(), "datos borrados", Toast.LENGTH_SHORT).show();


                break;
            case R.id.Dibuj:
                Intent i = new Intent(this, Dibujo.class);
                startActivity(i);
                break;

            default:
                break;

        }

   }




    }

//}
