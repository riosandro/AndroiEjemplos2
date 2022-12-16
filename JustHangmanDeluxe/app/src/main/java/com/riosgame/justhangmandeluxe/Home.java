package com.riosgame.justhangmandeluxe;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.string.ok;
import static com.riosgame.justhangmandeluxe.R.id.aceptar;
import static com.riosgame.justhangmandeluxe.R.styleable.AlertDialog;

/**
 * Created by Jose on 10/22/2016.
 */

public class Home extends AppCompatActivity implements View.OnClickListener{
    ImageView cuerpoh;
    ImageView animales;
    ImageView universo;
    ImageView paises;
    ImageView vehiculos;
    ImageView salud;
    Dialog customDialog = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);

        cuerpoh = (ImageView) findViewById(R.id.imageButtonCuerpoH);
        animales = (ImageView) findViewById(R.id.imageViewAnima);
        universo = (ImageView) findViewById(R.id.imageViewplane);
        paises = (ImageView) findViewById(R.id.imageViewpais);
        vehiculos = (ImageView) findViewById(R.id.imageButtonvehiculos);
        salud = (ImageView) findViewById(R.id.imageViewsalud);

        cuerpoh.setOnClickListener(this);
        animales.setOnClickListener(this);
        universo.setOnClickListener(this);
        paises.setOnClickListener(this);
        vehiculos.setOnClickListener(this);
        salud.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageViewAnima:
                // con este tema personalizado evitamos los bordes por defecto
                customDialog = new Dialog(this,R.style.Theme_Dialog_Translucent);
                //deshabilitamos el título por defecto
                customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //obligamos al usuario a pulsar los botones para cerrarlo
                customDialog.setCancelable(false);
                //establecemos el contenido de nuestro dialog
                customDialog.setContentView(R.layout.dialogo);

                final TextView titulo = (TextView) customDialog.findViewById(R.id.titulo);
                titulo.setText("Hola!");

                TextView contenido = (TextView) customDialog. findViewById(R.id.contenido);
                contenido.setText(getResources().getString(R.string.dialogAnimales));
                ((Button)customDialog.findViewById(R.id.aceptar)).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent b = new Intent(Home.this, JugarActivity.class);
                        startActivity(b);

                        customDialog.dismiss();
                        Toast.makeText(Home.this, R.string.Baceptartar, Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.show();
                break;
            case R.id.imageViewpais:
                // con este tema personalizado evitamos los bordes por defecto
                customDialog = new Dialog(this,R.style.Theme_Dialog_Translucent);
                //deshabilitamos el título por defecto
                customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //obligamos al usuario a pulsar los botones para cerrarlo
                customDialog.setCancelable(false);
                //establecemos el contenido de nuestro dialog
                customDialog.setContentView(R.layout.dialogo);

                final TextView titulo7 = (TextView) customDialog.findViewById(R.id.titulo);
                titulo7.setText("Hola!");

                TextView contenido7 = (TextView) customDialog. findViewById(R.id.contenido);
                contenido7.setText(getResources().getString(R.string.dialogPaises));
                ((Button)customDialog.findViewById(R.id.aceptar)).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                                   Intent b = new Intent(Home.this, JugarActivity.class);
                                   startActivity(b);

                       customDialog.dismiss();
                       Toast.makeText(Home.this, R.string.Baceptartar, Toast.LENGTH_SHORT).show();
                   }
               });
                customDialog.show();

                break;
            case R.id.imageViewsalud:
                // con este tema personalizado evitamos los bordes por defecto
                customDialog = new Dialog(this,R.style.Theme_Dialog_Translucent);
                //deshabilitamos el título por defecto
                customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //obligamos al usuario a pulsar los botones para cerrarlo
                customDialog.setCancelable(false);
                //establecemos el contenido de nuestro dialog
                customDialog.setContentView(R.layout.dialogo);

                final TextView titulo2 = (TextView) customDialog.findViewById(R.id.titulo);
                titulo2.setText("Hola!");

                TextView contenido2 = (TextView) customDialog. findViewById(R.id.contenido);
                contenido2.setText(getResources().getString(R.string.dialogsalud));
                ((Button)customDialog.findViewById(R.id.aceptar)).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent b = new Intent(Home.this, JugarActivity.class);
                        startActivity(b);

                        customDialog.dismiss();
                        Toast.makeText(Home.this, R.string.Baceptartar, Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.show();

                break;
            case R.id.imageViewplane:
                // con este tema personalizado evitamos los bordes por defecto
                customDialog = new Dialog(this,R.style.Theme_Dialog_Translucent);
                //deshabilitamos el título por defecto
                customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //obligamos al usuario a pulsar los botones para cerrarlo
                customDialog.setCancelable(false);
                //establecemos el contenido de nuestro dialog
                customDialog.setContentView(R.layout.dialogo);

                final TextView titulo4 = (TextView) customDialog.findViewById(R.id.titulo);
                titulo4.setText("Hola!");

                TextView contenido4 = (TextView) customDialog. findViewById(R.id.contenido);
                contenido4.setText(getResources().getString(R.string.dialogUniver));
                ((Button)customDialog.findViewById(R.id.aceptar)).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent b = new Intent(Home.this, JugarActivity.class);
                        startActivity(b);

                        customDialog.dismiss();
                        Toast.makeText(Home.this, R.string.Baceptartar, Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.show();
                break;
            case R.id.imageButtonvehiculos:
                // con este tema personalizado evitamos los bordes por defecto
                customDialog = new Dialog(this,R.style.Theme_Dialog_Translucent);
                //deshabilitamos el título por defecto
                customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //obligamos al usuario a pulsar los botones para cerrarlo
                customDialog.setCancelable(false);
                //establecemos el contenido de nuestro dialog
                customDialog.setContentView(R.layout.dialogo);

                final TextView titulo5 = (TextView) customDialog.findViewById(R.id.titulo);
                titulo5.setText("Hola!");

                TextView contenido5 = (TextView) customDialog. findViewById(R.id.contenido);
                contenido5.setText(getResources().getString(R.string.dialogVehic));
                ((Button)customDialog.findViewById(R.id.aceptar)).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent b = new Intent(Home.this, JugarActivity.class);
                        startActivity(b);

                        customDialog.dismiss();
                        Toast.makeText(Home.this, R.string.Baceptartar, Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.show();
                break;
            case R.id.imageButtonCuerpoH:
                // con este tema personalizado evitamos los bordes por defecto
                customDialog = new Dialog(this,R.style.Theme_Dialog_Translucent);
                //deshabilitamos el título por defecto
                customDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                //obligamos al usuario a pulsar los botones para cerrarlo
                customDialog.setCancelable(false);
                //establecemos el contenido de nuestro dialog
                customDialog.setContentView(R.layout.dialogo);

                final TextView titulo6 = (TextView) customDialog.findViewById(R.id.titulo);
                titulo6.setText("Hola!");

                TextView contenido6 = (TextView) customDialog. findViewById(R.id.contenido);
                contenido6.setText(getResources().getString(R.string.dialogCuerpoH));
                ((Button)customDialog.findViewById(R.id.aceptar)).setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Intent b = new Intent(Home.this, JugarActivity.class);
                        startActivity(b);

                        customDialog.dismiss();
                        Toast.makeText(Home.this, R.string.Baceptartar, Toast.LENGTH_SHORT).show();
                    }
                });
                customDialog.show();

                break;
            default:
                break;



        }
    }
}
