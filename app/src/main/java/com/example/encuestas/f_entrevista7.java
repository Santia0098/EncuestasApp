package com.example.encuestas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class f_entrevista7 extends AppCompatActivity {

    Button conf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_entrevista7);

        conf = (Button) findViewById(R.id.iconfirmar12);
        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(f_entrevista7.this, f_entrevista8.class);
                startActivity(i);
            }
        });
    }
}