package com.riosgame.datosfamiliares;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import androidx.appcompat.widget.SearchView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jose on 10/13/2016.
 */
public class PuestoC extends Activity implements OnClickListener{

    EditText Datos;
    Button Verificar;
    TextView Informacion ;
    //ImageView Foto;
    Button Borrar;
   // LinearLayout Infor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrinfo);

        Datos = (EditText) findViewById(R.id.EdicDatos);
        Verificar = (Button) findViewById(R.id.BotoVerif);
        Borrar = (Button) findViewById(R.id.BotoBorar);
       // Foto = (ImageView) findViewById(R.id.photo);
        Informacion = (TextView) findViewById(R.id.MostrarInfor);
       // Infor =(LinearLayout) findViewById(R.id.MostrarInfo);

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

                if(Cadena1.equalsIgnoreCase("sophy")){
                    String DatosRios = getResources().getString(R.string.sophy);
                    Informacion.setText(DatosRios);

                }
                //else{
                //     Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
                // }
                else if(Cadena1.equalsIgnoreCase("p50")){
                    String DatosRios = getResources().getString(R.string.p50);
                    Informacion.setText(DatosRios);

                }
                //  else{
                //   Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
                //}
                else if(Cadena1.equalsIgnoreCase("mk19")){


                    String DatosRios = getResources().getString(R.string.mk19);
                    Informacion.setText(DatosRios);

                }
                // else{
                //     Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
                // }
                else if(Cadena1.equalsIgnoreCase("minimi762")){


                    String DatosRios = getResources().getString(R.string.minimi762);
                    Informacion.setText(DatosRios);

                }
                // else{
                // Toast.makeText(getApplicationContext(),"La informacion Ingresada no coincide con los datos en el sistema",Toast.LENGTH_SHORT).show();
                //}
                else if(Cadena1.equalsIgnoreCase("recon")){


                    String DatosRios = getResources().getString(R.string.recon);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("coinjose")){
                    String DatosRios = getResources().getString(R.string.coinspacejose);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("coinpapa")){
                    String DatosRios = getResources().getString(R.string.coinspacepapa);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("coineme")){
                    String DatosRios = getResources().getString(R.string.coinspaceemeidi);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("coineimy")){
                    String DatosRios = getResources().getString(R.string.coinspaceeimy);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("coinvargas")){
                    String DatosRios = getResources().getString(R.string.coinspacevargas);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("coinbejarano")){
                    String DatosRios = getResources().getString(R.string.coinspacebejarano);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("onelife")){
                    String DatosRios = getResources().getString(R.string.onelife);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("gladiacoin")){
                    String DatosRios = getResources().getString(R.string.gladiacoin);
                    Informacion.setText(DatosRios);

                }
                else if (Cadena1.equalsIgnoreCase("localbit")){
                    String DatosRios = getResources().getString(R.string.localbitcoin);
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
            //case R.id.BotoAtras:
            //    break;

            default:

                break;


        }
        //finish();
    }

    // return

}
//return;


