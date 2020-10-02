package com.desarrollo.votos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView t1,t2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        t1=findViewById(R.id.resul1);
        t2=findViewById(R.id.resul2);
        button=findViewById(R.id.regresar);

        int dat1 = getIntent().getExtras().getInt("dato1");
        int dat2 = getIntent().getExtras().getInt("dato2");

        t1.setText(String.valueOf(dat1));
        t2.setText(String.valueOf(dat2));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}