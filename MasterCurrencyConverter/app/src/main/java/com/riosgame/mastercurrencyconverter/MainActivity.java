package com.riosgame.mastercurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
//import android.view.ViewGrou;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
//import java.util.Currency;


public class MainActivity extends AppCompatActivity {
    //Crear variable array con tipo de moneda por pais
    Currency[] currency = {
          new Currency("Euro","EUR"),
            new Currency("Hong Kong Dollar","HKD"),
            new Currency("Honduras Lempira","HNL"),
            new Currency("Unated State Dollar","USD"),
            new Currency("Venezuela Volivar Fuerte","VEF"),
            new Currency("Mexican Peso","MXN"),
            new Currency("Canadian Dollar","CAD"),
            new Currency("Colombian Peso","COP")
    };
    //Declaracion de Variables
    private String jsonResult;
    String divisa, divisa2;
    Spinner spinner1, spinner2;
    Button btConverter;
    EditText edtCantidadaconvertir;
    TextView txvResultado;
    private static String urls = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obtenemos la referencia del objeto Spinner
        spinner1 = (Spinner)findViewById(R.id.spmoneda1);
        //Construr los datos del Spinner1
        MySpinnerAdapter adapter = new MySpinnerAdapter(MainActivity.this, android.R.layout.simple_spinner_item, currency);
        spinner1.setAdapter(adapter);
        //Evento seleccion de spiner
        spinner1.setOnItemSelectedListener(onItemSelectedListener1);

        //Construr los datos del Spinner2
        spinner2 = (Spinner) findViewById(R.id.spmoneda2);
        MySpinnerAdapter adapter2 = new MySpinnerAdapter(MainActivity.this, android.R.layout.simple_spinner_item, currency);
        spinner2.setAdapter(adapter2);
        //Evento seleccion de spiner
        spinner2.setOnItemSelectedListener(onItemSelectedListener2);


        //Obtener la referencia del boton
        btConverter =  findViewById(R.id.btconvert);
        btConverter.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //Obtener referencia del objeto edittext
                edtCantidadaconvertir = (EditText) findViewById(R.id.edtcantidadaconvert);
                //Asignar el valor a la variable string
                String cantidad = edtCantidadaconvertir.getText().toString();
                urls = "https://data.fixer.io/api/convert?access_key=635a51e3c9a0815fb904af6600d49222"+divisa+"&symbols="+divisa2+"&amount="+cantidad+"";
                http : //data.fixer.io/api/ convert ? access_key = YOUR_ACCESS_KEY & from = USD & to = EUR & amount = 25
                Toast.makeText(getApplicationContext(),urls,Toast.LENGTH_LONG).show();
                ////Ejecutar la clase asicrona
                webService task = new webService();
                task.execute();


            }
        });

    }
    //Clase asincrona del servicio
    private class webService extends AsyncTask<Void, Void, String>{


        @Override
        protected String doInBackground(Void... params) {
            HttpURLConnection urlConnection = null;
            BufferedReader reader = null;
            String forecastJsonStr = null;
            try {
                //Asignar la url de la coneccion
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();
                InputStream inputStream = urlConnection.getInputStream();
                StringBuilder buffer = new StringBuilder();
                if (inputStream == null) {
                    return null;
                }
                reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.append(line + "\n");
                }
                if (buffer.length() == 0) {
                    return null;
                }
                forecastJsonStr = buffer.toString();
                jsonResult = buffer.toString();
                return forecastJsonStr;
            }catch (IOException e) {
                Log.e("Placeholderfragment", "Error ", e);
                return null;
            }finally {
                if (urlConnection != null){
                    urlConnection.disconnect();
                }
                if (reader != null){
                    try{
                        reader.close();
                    }catch (final IOException e){
                        Log.e("Placeholderfragment", "Error Closing Stream", e);

                    }
                }
            }

        }
        @Override
        protected void onPostExecute(String s){
            super. onPostExecute (s);
            getResultado();
        }

    }
    //Obtener el resultado
    public void getResultado(){
        try {
            String resDivisa;
            //Obtener el valor del arreglo de la devolucion
            JSONObject reader = new JSONObject(jsonResult);

            //Espesificamos el valor que se necesita
            JSONObject rates = reader.getJSONObject("rates");

            //Obtener el valor pero en nodo
            resDivisa = rates.getString(divisa2);

            //Asignar el valor al TextView
            txvResultado = (TextView) findViewById(R.id.txvResultado);
            txvResultado.setText(resDivisa);
        }catch (Exception e){

        }
    }
    AdapterView.OnItemSelectedListener onItemSelectedListener1 = new AdapterView.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Currency obj = (Currency) (parent.getItemAtPosition(position));
            divisa = String.valueOf(obj.getValue());
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {}

        };
    AdapterView.OnItemSelectedListener onItemSelectedListener2 = new AdapterView.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Currency obj = (Currency) (parent.getItemAtPosition(position));
            divisa2 = String.valueOf(obj.getValue());
        }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {}

    };

    //Definimos la clase Currency
    public class Currency{

        private String text;
        private String value;

        public Currency(String text, String value){
            this.text = text;
            this.value = value;
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
        }
        public void setValue (String value){
            this.value = value;
        }
        public String getValue(){
            return this.value;
        }
    }
    //Custom Adapter
    public class MySpinnerAdapter extends ArrayAdapter<Currency>{
        private Context context;
        private Currency[] myobjs;

        public MySpinnerAdapter(Context context, int textViewResourceId, Currency[]myobjs){
            super (context, textViewResourceId, myobjs);
            this.context = context;
            this.myobjs = myobjs;
        }
        public int getCount(){
            return myobjs.length;
        }
        public Currency getItem(int position){
            return myobjs[position];
        }
        public long getItemId(int position){
            return position;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            TextView label = new TextView(context);
            label.setText(myobjs[position].getText());
            return label;
    }
        public View getDropDownView(int position, View convertView, ViewGroup parent){
            TextView label = new TextView(context);
            label.setText(myobjs[position].getText());
            return label;
        }


    }
}
