package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

public class FichaIdentificacion extends AppCompatActivity {

    Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_identificacion);

        getSupportActionBar().hide();


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] valores = {"¿Haz estado becado?", "Si", "No"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner4);
        String[] valores2 = {"Gobierno Federal", "Gobierno Estatal", "Gobierno Municipal"};
        spinner2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores2));

        confirmar = (Button)findViewById(R.id.iconfirmar2);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FichaIdentificacion.this, FichaIdentificacion2.class);
                startActivity(i);
            }
        });
    }

    public void onRadioButtonClicked(View view) {

        try{


        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.trabajasi:
                if (checked)

                    break;
            case R.id.trabajano:
                if (checked)

                break;
        }
        }catch(Exception e) {

        }
    }
}