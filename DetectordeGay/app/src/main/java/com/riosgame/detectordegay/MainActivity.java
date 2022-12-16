package com.riosgame.detectordegay;

import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText Nombre;
    Button BT1;
    Button BT2;
    Button BT3;
    Button BT4;
    Button BT5;
    Button BT6;
    Button BT7;
    Button BT8;
    TextToSpeech speaks;
    Button Borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mostrar = (TextView) findViewById(R.id.textView1);
        Nombre = (EditText) findViewById(R.id.EditNombre);
        BT1 = (Button) findViewById(R.id.Btportela);
        BT2 = (Button) findViewById(R.id.btAlfonso);
        //BT3 = (Button) findViewById(R.id.btDiaz);
       // BT4 = (Button) findViewById(R.id.btOrocu);
        BT5 = (Button) findViewById(R.id.btVargas);
       // BT6 = (Button) findViewById(R.id.btQuevin);
        BT7 = (Button) findViewById(R.id.btFuentez);
        BT8 = (Button) findViewById(R.id.btAnaliz);
       // Nombres = (Spinner) findViewById(R.id.spNombres);
        Borrar = (Button) findViewById(R.id.btBorrar);

        Borrar.setOnClickListener(this);
        Nombre.setOnClickListener(this);
        BT1.setOnClickListener(this);
        BT2.setOnClickListener(this);
       // BT3.setOnClickListener(this);
       // BT4.setOnClickListener(this);
        BT5.setOnClickListener(this);
        //BT6.setOnClickListener(this);
        BT7.setOnClickListener(this);
        BT8.setOnClickListener(this);
        //Nombres.setOnClickListener(this);
        speaks = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    speaks.setLanguage(Locale.getDefault());
                }
            }
        });


    }
        @Override
        public void onClick (View view){
            switch (view.getId()) {
                case R.id.Btportela:
                  // mostrar.setText(x);
              // if (x.equalsIgnoreCase("fuentes")) {
                   // Toast.makeText(getApplicationContext(), x,Toast.LENGTH_SHORT).show();
                    String porte = (" Peligro, peligro, se aproxima un gey. Nombre, portela quintero alexander, alias," +
                            "    la barvi, gustos, las pasarelas y los cosmeticos, deseos cambiarce de sexo cuantdo se valla del proyecto,\n" +
                            "        y trabajar en la 19 de bogota");
                    MediaPlayer mp1 = MediaPlayer.create(this, R.raw.alarma1);
                    mp1.start();
                    speaks.speak(porte, TextToSpeech.QUEUE_FLUSH, null);

               // }
                 //else if(x.equalsIgnoreCase("portela")){
                   // speaks.speak(getResources().getString(R.string.portela), TextToSpeech.QUEUE_FLUSH,null);
                   // MediaPlayer mp = MediaPlayer.create(this, R.raw.alarma1);
                   // mp.start();

               // }
                   // else{
                   // Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
               // }
                    break;
                case R.id.btAlfonso:
                    break;
               // case R.id.btDiaz:
                  //  break;
               // case R.id.btOrocu:
                   // break;
                case R.id.btVargas:
                    String vargas = ("Peligro, Peligro, se acerca un gey. Nombre, Vargas Camilo Andes, Alias, Narisez, y La Confecsionista. Gustos, " +
                            "toda clase de hombres, Deseos, viajar por todo el mundo y internacionalisar el culo. Se recomienda que se alegen de ella " +
                            "porque esa es una loca muy loca.");
                    MediaPlayer mp2 = MediaPlayer.create(this, R.raw.alarma1);
                    mp2.start();
                    speaks.speak(vargas, TextToSpeech.QUEUE_FLUSH, null);
                    break;
               // case R.id.btQuevin:
                   // break;
                case R.id.btFuentez:
                    //Toast.makeText(getApplicationContext(), x,Toast.LENGTH_SHORT).show();
                    String fuente = ("Peligro, peligro, se aproxima un gey. Nombre, Fuentez de leon, Alias, Ajo podrido, Nacionalidad," +
                            "    Panameño, Gustos, Hombres fuerte");
                    MediaPlayer mp3 = MediaPlayer.create(this, R.raw.alarma1);
                    mp3.start();
                    speaks.speak(fuente, TextToSpeech.QUEUE_FLUSH, null);

                    break;
                case R.id.btAnaliz:
                   String x = Nombre.getText().toString();
                   String mensage = ("Peligro, peligro, se acerca un gey. Peligro, peligro, se acerca un gey. Nombre, "+ x + ", Alejence de ese gey, esa es una loca completa.");
                    MediaPlayer mp4 = MediaPlayer.create(this, R.raw.alarma1);
                    mp4 .start();
                    speaks.speak(mensage, TextToSpeech.QUEUE_FLUSH, null);



                    break;
                case R.id.btBorrar:
                   Nombre.setText("");
                default:
                    break;
            }


        }
    public void onDestroy(){
        if(speaks != null){
            speaks.stop();
            speaks.shutdown();
        }
        super.onDestroy();
    }

    }

