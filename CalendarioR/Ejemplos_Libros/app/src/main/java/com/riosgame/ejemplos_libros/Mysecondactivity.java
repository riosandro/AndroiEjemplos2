package com.riosgame.ejemplos_libros;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

/**
 * Created by Jose on 10/6/2016.
 */
public class Mysecondactivity extends AppCompatActivity  implements View.OnClickListener{

    ImageView FotoPrinc, Imagen1,Imagen2,Imagen3,Imagen4;
    Button BotonFondo;
    int Movil;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mysecondactivity);

        FotoPrinc = (ImageView) findViewById(R.id.Principal);
        Imagen1 = (ImageView) findViewById(R.id.imageView2);
        Imagen2 = (ImageView) findViewById(R.id.imageView3);
        Imagen3 = (ImageView) findViewById(R.id.imageView4);
        Imagen4 = (ImageView) findViewById(R.id.imageView5);
        BotonFondo = (Button) findViewById(R.id.button4);

        FotoPrinc.setOnClickListener(this);
        Imagen1.setOnClickListener(this);
        Imagen2.setOnClickListener(this);
       Imagen3.setOnClickListener(this);
       Imagen4.setOnClickListener(this);
        BotonFondo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView2:
                FotoPrinc.setImageResource(R.drawable.imagen1);
                Movil = R.drawable.imagen1;
                break;
            case R.id.imageView3:
                FotoPrinc.setImageResource(R.drawable.imagen2);
                Movil = R.drawable.imagen2;
                break;
            case R.id.imageView4:
                FotoPrinc.setImageResource(R.drawable.imagen3);
                Movil = R.drawable.imagen3;
                break;
            case R.id.imageView5:
                FotoPrinc.setImageResource(R.drawable.imagen4);
                Movil = R.drawable.imagen4;
                break;
            case R.id.button4:
                Bitmap fondo = BitmapFactory.decodeStream(getResources().openRawResource(Movil));

                    try {
                        getApplicationContext().setWallpaper(fondo);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                break;
            default:
                break;




        }

    }
}

