package com.example.adrianch.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    Context cntContexto;
    Button btnClickLista,btnClaseAnonima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cntContexto = getApplicationContext();
        btnClickLista=(Button)findViewById(R.id.btnClickList);
        btnClickLista.setOnClickListener(this);
        btnClaseAnonima=(Button)findViewById(R.id.btnClaseAnonima);

        btnClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cntContexto,"Hola mundo!!",Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void miClick (View v) {
        Toast.makeText(this,"Que rollo!!",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        Toast.makeText(this,"Que rollo!! - Listener",Toast.LENGTH_SHORT).show();
    }
}
