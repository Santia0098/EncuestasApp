package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class EstudioSocioeconomico extends AppCompatActivity {

    Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudio_socioeconomico);

        getSupportActionBar().hide();

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner2);
        String[] valores5 = {"Actualmente vives con:", "Padres o tutores", "Familiares", "Solo(a)"};
        spinner5.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores5));

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner7);
        String[] valores6 = {"La casa donde vives es:", "Propia", "Prestada", "Rentada"};
        spinner6.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores6));

        Spinner spinner7 = (Spinner) findViewById(R.id.spinner8);
        String[] valores7 = {"El material de la casa es:", "Concreto", "Lámina/Abesto", "Madera/adobe", "Otros materiales"};
        spinner7.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores7));

        sig = (Button) findViewById(R.id.iconfirmar4);

        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EstudioSocioeconomico.this, EstudioSocioeconomico2.class);
                startActivity(i);
            }
        });
    }
}