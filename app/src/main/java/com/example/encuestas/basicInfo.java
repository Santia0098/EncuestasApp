package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class basicInfo extends AppCompatActivity {

    Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info);
        getSupportActionBar().hide();


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"Semestre", "1°", "2°", "3°", "4°", "5°", "6°", "7°", "8°", "9°", "10°", "11°", "12°"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] valores2 = {"Género", "Mujer", "Hombre"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, valores2));

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        String[] valores3 = {"Estado civil", "Soltero(a)", "Casado(a)", "Viudo(a)", "Separado(a)", "Divorciado(a)"};
        spinner3.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, valores3    ));

        confirmar = (Button) findViewById(R.id.iconfirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(basicInfo.this, inicio.class);
                startActivity(i);
            }
        });


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // vacio

            }
        });
    }
}