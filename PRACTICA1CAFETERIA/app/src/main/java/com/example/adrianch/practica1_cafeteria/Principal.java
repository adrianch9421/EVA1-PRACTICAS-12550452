package com.example.adrianch.practica1_cafeteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    RadioGroup rdGrupCafe;
    RadioButton rdbtname, rdbtncap, rdbtnexp;
    EditText edtxtcant, edtxtdesc;
    CheckBox chkbxazu, chkbxcr;
    Button btntot;
    int total;
    int cant,cafe;
    String descr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdGrupCafe=(RadioGroup)findViewById(R.id.rdGrupCafe);
        rdbtname=(RadioButton)findViewById(R.id.rdbtname);
        rdbtncap=(RadioButton)findViewById(R.id.rdbtncap);
        rdbtnexp=(RadioButton)findViewById(R.id.rdbtnexp);
        edtxtcant=(EditText)findViewById(R.id.edtxtcan);
        edtxtdesc=(EditText)findViewById(R.id.edtxtdesc);
        chkbxazu=(CheckBox)findViewById(R.id.chkbxazu);
        chkbxcr=(CheckBox)findViewById(R.id.chkbxcr);
        btntot=(Button)findViewById(R.id.btntot);

    }

    public void OnClickTotal (View e){
        if (rdbtname.isChecked()){
            cafe = 20;
            descr = "Americano";
            cant = Integer.parseInt(edtxtcant.getText().toString());

            if (chkbxazu.isChecked()) {
                cafe = cafe + 1;
                descr = descr.concat(", Azucar");
            }
            if (chkbxcr.isChecked()) {
                cafe = cafe + 1;
                descr = descr.concat(", Crema");
            }
            total = cant * cafe;

        }else if (rdbtncap.isChecked()){
            cafe = 48;
            descr = "Capuchino";
            cant = Integer.parseInt(edtxtcant.getText().toString());

            if (chkbxazu.isChecked()) {
                cafe = cafe + 1;
                descr = descr.concat(", Azucar");
            }
            if (chkbxcr.isChecked()) {
                cafe = cafe + 1;
                descr = descr.concat(", Crema");
            }
            total = cant * cafe;

        }else if (rdbtnexp.isChecked()){
            cafe = 30;
            descr = "Express";
            cant = Integer.parseInt(edtxtcant.getText().toString());

            if (chkbxazu.isChecked()) {
                cafe = cafe + 1;
                descr = descr.concat(", Azucar");
            }
            if (chkbxcr.isChecked()) {
                cafe = cafe + 1;
                descr = descr.concat(", Crema");
            }

            total = cafe * cant;

        }


        Toast.makeText(this,""+ total, Toast.LENGTH_SHORT).show();
        if (cant == 1) {
            edtxtcant.setText(cant + " Cafe " + descr);
        }
        else if (cant == 0){
            edtxtdesc.setText("Coloque una cantidad mayor a 1");
        }
        else {
            edtxtdesc.setText(cant + " Cafes " + descr);
        }

    }
}







