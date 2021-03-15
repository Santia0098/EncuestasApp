package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class EstudioSocioeconomico2 extends AppCompatActivity {

    Button finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudio_socioeconomico2);

        getSupportActionBar().hide();

        finalizar = (Button) findViewById(R.id.iconfirmar5);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EstudioSocioeconomico2.this, inicio.class);
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