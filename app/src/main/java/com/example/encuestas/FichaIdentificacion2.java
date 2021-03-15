package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FichaIdentificacion2 extends AppCompatActivity {

    Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_identificacion2);

        getSupportActionBar().hide();

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        String[] valores5 = {"Padre", "Primaria", "Secundaria", "Preparatoria", "Universidad"};
        spinner5.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores5));

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner6);
        String[] valores6 = {"Madre", "Primaria", "Secundaria", "Preparatoria", "Universidad"};
        spinner6.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores6));


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"Padre", "Vive", "Finado"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] valores2 = {"Madre", "Vive", "Finado"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));

        confirmar = (Button) findViewById(R.id.iconfirmar3);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FichaIdentificacion2.this, inicio.class);
                startActivity(i);
            }
        });
    }
}