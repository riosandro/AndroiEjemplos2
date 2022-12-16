package com.riosgame.datosfamiliares;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.riosgame.datosfamiliares.R.drawable.dany;
import static com.riosgame.datosfamiliares.R.drawable.eimy;
import static com.riosgame.datosfamiliares.R.drawable.emeidy;
import static com.riosgame.datosfamiliares.R.drawable.fabi;
import static com.riosgame.datosfamiliares.R.drawable.jose;

public class MainLayaout extends AppCompatActivity implements OnClickListener {

    //;
    EditText Datos;
    Button Verificar;
    TextView Informacion ;
    ImageView Foto;
    Button Borrar;
    LinearLayout Infor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layaout);

        Datos = (EditText) findViewById(R.id.EdicDatos);
        Verificar = (Button) findViewById(R.id.BotoVerif);
        Borrar = (Button) findViewById(R.id.BotoBorar);
        Foto = (ImageView) findViewById(R.id.photo);
        Informacion = (TextView) findViewById(R.id.MostrarInfor);
        Infor =(LinearLayout) findViewById(R.id.MostrarInfo);

      //  Infor = (LinearLayout) findViewById(R.id.MostrInfo);

        Datos.setOnClickListener(this);
        Verificar.setOnClickListener(this);
        Borrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BotoVerif:
                String Cadena1 = Datos.getText().toString();

                if(Cadena1.equalsIgnoreCase("jose")){
                    Drawable res = getResources().getDrawable(jose);
                    Foto.setImageDrawable(res);

                    String DatosRios = getResources().getString(R.string.rios);
                    Informacion.setText(DatosRios);

                }
                //else{
               //     Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
               // }
               else if(Cadena1.equalsIgnoreCase("emeidi")){
                    Drawable res = getResources().getDrawable(emeidy);
                    Foto.setImageDrawable(res);

                    String DatosRios = getResources().getString(R.string.emeidy);
                    Informacion.setText(DatosRios);

                }
              //  else{
               //   Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
              //}
               else if(Cadena1.equalsIgnoreCase("fabian")){
                    Drawable res = getResources().getDrawable(fabi);
                    Foto.setImageDrawable(res);

                    String DatosRios = getResources().getString(R.string.fabi);
                    Informacion.setText(DatosRios);

                }
               // else{
               //     Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
               // }
                else if(Cadena1.equalsIgnoreCase("daniel")){
                    Drawable res = getResources().getDrawable(dany);
                    Foto.setImageDrawable(res);

                    String DatosRios = getResources().getString(R.string.dany);
                    Informacion.setText(DatosRios);

                }
               // else{
                   // Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
                //}
                else if(Cadena1.equalsIgnoreCase("eimy")){
                    Drawable res = getResources().getDrawable(eimy);
                    Foto.setImageDrawable(res);

                    String DatosRios = getResources().getString(R.string.eimy);
                    Informacion.setText(DatosRios);

                }
                else{
                    Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.BotoBorar:
                Datos.setText("");
                Informacion.setText("");



                break;
           // case R.id.BotoAtras:
            //    break;

            default:

                break;


        }
        //finish();
    }

       // return

    }
    //return;


