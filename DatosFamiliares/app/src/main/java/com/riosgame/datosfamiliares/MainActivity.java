package com.riosgame.datosfamiliares;

import android.content.DialogInterface;
import android.content.Intent;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button famili;
    Button p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        famili = (Button) findViewById(R.id.buttonFamilia);
        p5 = (Button) findViewById(R.id.buttonPuesto5);

        famili.setOnClickListener(this);
        p5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonFamilia:
                Intent i = new Intent(this, MainLayaout.class);
                startActivity(i);

                break;
            case R.id.buttonPuesto5:
                Intent x = new Intent(this, PuestoC.class);
                startActivity(x);


                break;
            default:

        }


        //finish();

    }

    public void onBackPressed() {
        // DListener listener = new DListener();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.ojo);
        builder.setMessage(R.string.salir);
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.si,


                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                        //.onPossitiveButtonClick();
                    }
                });
        builder.setNegativeButton(R.string.no,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //listener.onNegativeButtonClick();
                    }
                });

        builder.show();


    }


    /*hecr que cambie de actividad y salga la app sin devolverse*/

}
