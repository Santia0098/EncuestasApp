package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class f_entrevista6 extends AppCompatActivity {

    Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista6);


        Spinner spinner = (Spinner) findViewById(R.id.spinner48);
        String[] valores = {"Dominante", "No", "Poco", "Frecuente", "Mucho"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner49);
        String[] valores2 = {"Egoísta", "No", "Poco", "Frecuente", "Mucho"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner50);
        String[] valores3 = {"Sumiso/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores3));

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner51);
        String[] valores4 = {"Confiado/a en si mismo/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner4.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores4));

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner52);
        String[] valores5 = {"Imaginativo/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner5.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores5));

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner53);
        String[] valores6 = {"Con iniciativa propia", "No", "Poco", "Frecuente", "Mucho"};
        spinner6.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores6));

        Spinner spinner7 = (Spinner) findViewById(R.id.spinner54);
        String[] valores7 = {"Sociable", "No", "Poco", "Frecuente", "Mucho"};
        spinner7.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores7));

        Spinner spinner8 = (Spinner) findViewById(R.id.spinner55);
        String[] valores8 = {"Responsable", "No", "Poco", "Frecuente", "Mucho"};
        spinner8.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores8));

        Spinner spinner9 = (Spinner) findViewById(R.id.spinner56);
        String[] valores9 = {"Perseverante", "No", "Poco", "Frecuente", "Mucho"};
        spinner9.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores9));

        Spinner spinner10 = (Spinner) findViewById(R.id.spinner57);
        String[] valores10 = {"Motivado/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner10.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores10));

        Spinner spinner11 = (Spinner) findViewById(R.id.spinner58);
        String[] valores11 = {"Activo/a", "No", "Poco", "Frecuente", "Mucho"};
        spinner11.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores11));

        Spinner spinner12 = (Spinner) findViewById(R.id.spinner59);
        String[] valores12 = {"Independiente", "No", "Poco", "Frecuente", "Mucho"};
        spinner12.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores12));

        conf = (Button) findViewById(R.id.iconfirmar11);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(f_entrevista6.this, f_entrevista7.class);
                startActivity(i);
            }
        });
    }
}