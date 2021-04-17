package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class f_entrevista4 extends AppCompatActivity {

    Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista4);

        Spinner spinner = (Spinner) findViewById(R.id.spinner21);
        String[] valores = {"¿Cómo es tu relación con los compañeros?", "Buena", "Regular", "Mala"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        conf = (Button) findViewById(R.id.iconfirmar9);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(f_entrevista4.this, f_entrevista5.class);
                startActivity(i);
            }
        });
    }
}