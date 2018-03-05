package com.example.adrianch.eva1_3_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView txtvwhola;
Button btnHola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtvwhola = (TextView)findViewById(R.id.txtvwhola);
        btnHola= (Button)findViewById(R.id.btnHola);
        //txtvwhola.setText("Holi!!");
        txtvwhola.setText(R.string.mi_cadena);
        btnHola.setText("Dont push");

    }
}
