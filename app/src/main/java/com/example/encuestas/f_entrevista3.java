package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class f_entrevista3 extends AppCompatActivity {

    Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista3);

        Spinner spinner = (Spinner) findViewById(R.id.spinner20);
        String[] valores = {"Con quién te sientes más ligado afectivamente", "Madre", "Padre", "Hermano"};
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        conf = (Button) findViewById(R.id.iconfirmar8);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(f_entrevista3.this, f_entrevista4.class);
                startActivity(i);
            }
        });
    }
}