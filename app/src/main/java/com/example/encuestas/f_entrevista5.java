package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class f_entrevista5 extends AppCompatActivity {

    Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista5);

        Spinner spinner = (Spinner) findViewById(R.id.spinner22);
        String[] valores = {"Puntual", "No", "Poco", "Frecuente", "Mucho"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner23);
        String[] valores2 = {"Tímido/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner24);
        String[] valores3 = {"Alegre", "No", "Poco", "Frecuente", "Mucho"};
        spinner3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores3));

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner25);
        String[] valores4 = {"Agresivo/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner4.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores4));

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner26);
        String[] valores5 = {"Abierto/a a las ideas de otros", "No", "Poco", "Frecuente", "Mucho"};
        spinner5.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores5));

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner27);
        String[] valores6 = {"Reflexivo/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner6.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores6));

        Spinner spinner7 = (Spinner) findViewById(R.id.spinner28);
        String[] valores7 = {"Constante", "No", "Poco", "Frecuente", "Mucho"};
        spinner7.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores7));

        Spinner spinner8 = (Spinner) findViewById(R.id.spinner29);
        String[] valores8 = {"Optimista", "No", "Poco", "Frecuente", "Mucho"};
        spinner8.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores8));

        Spinner spinner9 = (Spinner) findViewById(R.id.spinner30);
        String[] valores9 = {"Impulsivo/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner9.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores9));

        Spinner spinner10 = (Spinner) findViewById(R.id.spinner31);
        String[] valores10 = {"Silencioso/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner10.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores10));

        Spinner spinner11 = (Spinner) findViewById(R.id.spinner32);
        String[] valores11 = {"Generoso/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner11.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores11));

        Spinner spinner12 = (Spinner) findViewById(R.id.spinner33);
        String[] valores12 = {"Inquieto/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner12.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores12));

        Spinner spinner13 = (Spinner) findViewById(R.id.spinner34);
        String[] valores13 = {"Cambios de humor", "No", "Poco", "Frecuente", "Mucho"};
        spinner13.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores13));

        conf = (Button) findViewById(R.id.iconfirmar10);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(f_entrevista5.this, f_entrevista6.class);
                startActivity(i);
            }
        });
    }
}