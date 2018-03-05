package com.example.adrianch.eva1_7_idiomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    TextView txtidioma, txtnom, txtape, txtedad,txtgen;
    RadioButton rdbtnmas, rdbtnfem, rdbtnes, rdbtnin;
    RadioGroup rdgidio;
    EditText etxtnom,etxtape,etxtedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtidioma = (TextView)findViewById(R.id.txtidiom);
        txtnom = (TextView)findViewById(R.id.txtnom);
        txtape = (TextView)findViewById(R.id.txtape);
        txtedad = (TextView)findViewById(R.id.txtedad);
        txtgen = (TextView)findViewById(R.id.txtgen);


        rdbtnmas = (RadioButton) findViewById(R.id.rbtnmas);
        rdbtnfem = (RadioButton) findViewById(R.id.rbtnfem);
        rdbtnes = (RadioButton) findViewById(R.id.rdbtnes);
        rdbtnin = (RadioButton) findViewById(R.id.rdbtnin);

        rdgidio= (RadioGroup)findViewById(R.id.rdgidio);
        etxtnom= (EditText)findViewById(R.id.etxtnom);
        etxtape= (EditText)findViewById(R.id.etxtape);
        etxtedad= (EditText)findViewById(R.id.etxtedad);

        rdgidio.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        if(i == R.id.rdbtnes){
            txtidioma.setText(R.string.idioma_sp);
            txtnom.setText(R.string.eti_ape_sp);
            txtape.setText(R.string.eti_ape_sp);
            txtedad.setText(R.string.eti_edad_sp);
            txtgen.setText(R.string.genero_sp);
            rdbtnmas.setText(R.string.mas_sp);
            rdbtnfem.setText(R.string.fem_sp);
            rdbtnes.setText(R.string.espaniol_sp);
            rdbtnin.setText(R.string.ingles_sp);
            etxtape.setText(R.string.hint_ape_sp);
            etxtedad.setText(R.string.hint_edad_sp);
            etxtnom.setText(R.string.hint_nom_sp);

        }
        else {
            txtidioma.setText(R.string.idioma_en);
            txtnom.setText(R.string.eti_ape_en);
            txtape.setText(R.string.eti_ape_en);
            txtedad.setText(R.string.eti_edad_en);
            txtgen.setText(R.string.genero_en);
            rdbtnmas.setText(R.string.mas_en);
            rdbtnfem.setText(R.string.fem_en);
            rdbtnes.setText(R.string.espaniol_sp);
            rdbtnin.setText(R.string.ingles_en);
            etxtape.setText(R.string.hint_ape_en);
            etxtedad.setText(R.string.hint_edad_en);
            etxtnom.setText(R.string.hint_nom_en);




        }

    }
}
