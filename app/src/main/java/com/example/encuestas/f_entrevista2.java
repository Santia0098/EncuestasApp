package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class f_entrevista2 extends AppCompatActivity {

    Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista2);

        Spinner spinner = (Spinner) findViewById(R.id.spinner9);
        String[] valores = {"Manos y/o pies hinchados", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner10);
        String[] valores2 = {"Dolores en el veintre", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner11);
        String[] valores3 = {"Dolores de cabeza y/o vómitos", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores3));

        Spinner spinner4 = (Spinner) findViewById(R.id.spinner12);
        String[] valores4 = {"Pérdida del equilibrio", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner4.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores4));

        Spinner spinner5 = (Spinner) findViewById(R.id.spinner13);
        String[] valores5 = {"Fatiga y agotamiento", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner5.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores5));

        Spinner spinner6 = (Spinner) findViewById(R.id.spinner14);
        String[] valores6 = {"Pérdida de vista u oído", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner6.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores6));

        Spinner spinner7 = (Spinner) findViewById(R.id.spinner15);
        String[] valores7 = {"Dificultades para dormir", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner7.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores7));

        Spinner spinner8 = (Spinner) findViewById(R.id.spinner16);
        String[] valores8 = {"Pesadillas o terrores nocturnos", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner8.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores8));

        Spinner spinner9 = (Spinner) findViewById(R.id.spinner17);
        String[] valores9 = {"Incontinencia (orina, heces)", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner9.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores9));

        Spinner spinner10 = (Spinner) findViewById(R.id.spinner18);
        String[] valores10 = {"Tartamudeos al explicarse", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner10.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores10));

        Spinner spinner11 = (Spinner) findViewById(R.id.spinner19);
        String[] valores11 = {"Miedos intensos ante cosas", "Muy frecuente", "Frecuente", "Nunca", "Antes"};
        spinner11.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores11));

        confirmar = (Button) findViewById(R.id.iconfirmar7);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(f_entrevista2.this, f_entrevista3.class);
                startActivity(i);
            }
        });

    }
}