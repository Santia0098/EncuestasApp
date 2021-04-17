package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class f_entrevista extends AppCompatActivity {

    Button pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista);


        pasar = (Button) findViewById(R.id.iconfirmar6);
        pasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(f_entrevista.this, f_entrevista2.class);
                startActivity(i);
            }
        });
    }
}