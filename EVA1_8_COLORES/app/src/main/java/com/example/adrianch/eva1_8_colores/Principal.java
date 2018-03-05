package com.example.adrianch.eva1_8_colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int iVal = (int)(Math.random() * 10) +1;
         if(iVal <= 5)
             setTheme(R.style.BlueTheme);
         else
             setTheme(R.style.RedTheme);

        setContentView(R.layout.activity_principal);
    }
}
