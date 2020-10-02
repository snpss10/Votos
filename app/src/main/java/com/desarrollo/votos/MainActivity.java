package com.desarrollo.votos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton res1, res2;
    Button resultado;
    int voto1=0, voto2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res1 = findViewById(R.id.res1);
        res2 = findViewById(R.id.res2);
        resultado = findViewById(R.id.resultados);

        res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto1 = voto1 + 1;
                Toast.makeText(getApplicationContext(),"Votacion "+voto1, Toast.LENGTH_SHORT).show();
            }
        });

        res2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                voto2 = voto2 + 1;
                Toast.makeText(getApplicationContext(),"Votacion "+voto2, Toast.LENGTH_SHORT).show();
            }
        });

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Resultado.class);
                //myIntent.putExtra("intVariableName", intValue);
                i.putExtra("dato1", voto1);
                i.putExtra("dato2", voto2);

                startActivity(i);

            }
        });


    }
}