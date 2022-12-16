package com.riosgame.lisactivityejemplos;

import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements View.OnClickListener {

    Button contactos;
    TextView llamar;
    Button llama;
    ListView mlista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlista = (ListView) findViewById(R.id.lista);
        llamar = (TextView)findViewById(R.id.llamadas);
        llama = (Button) findViewById(R.id.bLlamar);
        contactos = (Button) findViewById(R.id.bContac);

        llama.setOnClickListener(this);
        contactos.setOnClickListener(this);



      //  String[] cars = {"Nizan", "Zuzuky", "Camaro", "Toyota", "Masda"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cars);
        //mlista.setAdapter(adapter);


}

    @Override
    public void onClick(View view) {
        switch (view. getId()){
            case R.id.bLlamar:
                obtenerLlamadas();




                break;

            case R.id.bContac:
               // obtenerDatos();

                String[] projeccion = new String[] { ContactsContract.Data._ID, ContactsContract.Data.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone.TYPE };
                String selectionClause = ContactsContract.Data.MIMETYPE + "='" +
                        ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE + "' AND "
                        + ContactsContract.CommonDataKinds.Phone.NUMBER + " IS NOT NULL";
                String sortOrder = ContactsContract.Data.DISPLAY_NAME + " ASC";

                Cursor c = getContentResolver().query(
                        ContactsContract.Data.CONTENT_URI,
                        projeccion,
                        selectionClause,
                        null,
                        sortOrder);

               //llamar.setText("");


               // assert c != null;
                while(c.moveToNext()){


                    llamar.append("Identificador: " + c.getString(0) + "\n"+ " Nombre: " + c.getString(1) + "\n" +" Número: " + c.getString(2)+ "\n" + " Tipo: " + c.getString(3)+"\n");


                   //String datos = ("Identificador: " + c.getString(0) + " Nombre: " + c.getString(1) + " Número: " + c.getString(2)+  " Tipo: " + c.getString(3)+"\n");
                   //datos.setText(datos);
                    //ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
                    //mlista.setAdapter(adapter);


                }
                c.close();

        /*contactsCursor = getContentResolver().query(
                ContactsContract.Contacts.CONTENT_URI,   // URI de contenido para los contactos
                projection,                        // Columnas a seleccionar
                selectionClause                    // Condición del WHERE
                selectionArgs,                     // Valores de la condición
                sortOrder);                        // ORDER BY columna [ASC|DESC]*/




                break;
            default:
                break;

        }


    }

    private void obtenerLlamadas() {

        Uri uri;

        /*
        content://media/internal/images
        content://media/external/video
        content://media/internal/audio
        */

        //         content://media/*/images
        //         content://settings/system/ringtones

       uri = Uri.parse("content://call_l//og/calls");

        String[] projeccion = new String[]{CallLog.Calls.TYPE, CallLog.Calls.NUMBER, CallLog.Calls.DURATION};



        Cursor c = getContentResolver().query(
                uri,
                projeccion,
                null,
                null,
                null);

        llamar.setText("");


        while(c.moveToNext()){
            llamar.append("Tipo: " + c.getString(0) + " Número: " + c.getString(1) + " Duración: " + c.getString(2) +"\n");
        }
        c.close();

    }




   /* private void obtenerDatos() {

        String[] projeccion = new String[] { ContactsContract.Data._ID, ContactsContract.Data.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone.TYPE };
        String selectionClause = ContactsContract.Data.MIMETYPE + "='" +
                ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE + "' AND "
                + ContactsContract.CommonDataKinds.Phone.NUMBER + " IS NOT NULL";
        String sortOrder = ContactsContract.Data.DISPLAY_NAME + " ASC";

        Cursor c = getContentResolver().query(
                ContactsContract.Data.CONTENT_URI,
                projeccion,
                selectionClause,
                null,
                sortOrder);

        llamar.setText("");


        assert c != null;
        while(c.moveToNext()){
            mlista.append("Identificador: " + c.getString(0) + " Nombre: " + c.getString(1) + " Número: " + c.getString(2)+  " Tipo: " + c.getString(3)+"\n");
        }
        c.close();*/

        /*contactsCursor = getContentResolver().query(
                ContactsContract.Contacts.CONTENT_URI,   // URI de contenido para los contactos
                projection,                        // Columnas a seleccionar
                selectionClause                    // Condición del WHERE
                selectionArgs,                     // Valores de la condición
                sortOrder);                        // ORDER BY columna [ASC|DESC]*/



    //}
}
