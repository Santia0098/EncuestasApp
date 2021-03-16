package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inicio extends AppCompatActivity {

    Button ficha;
    Button estsoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        getSupportActionBar().hide();

        ficha = (Button) findViewById(R.id.fichaide);

        ficha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(inicio.this, FichaIdentificacion.class);
                startActivity(i);
            }
        });

        estsoc = (Button) findViewById(R.id.btn_socioe);
        estsoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(inicio.this, EstudioSocioeconomico.class);
                startActivity(in);
            }
        });
    }
}