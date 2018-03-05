package com.example.adrianch.pract2_expectativa_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    EditText ediTxtAño;
    RadioGroup rdGrupReg, rdGrupGen;
    RadioButton rdBtnRd, rdBtnAl, rdBtnAs, rdBtnAf, rdBtnH, rdBtnM;
    TextView txtVwVi, txtVwFe;
    int Iao, IExp, IDif, IFDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ediTxtAño =(EditText)findViewById(R.id.ediTxtAño);
        rdGrupReg =(RadioGroup)findViewById(R.id.rdGrupReg);
        rdGrupGen =(RadioGroup)findViewById(R.id.rdGrupGen);
        rdBtnRd = (RadioButton)findViewById(R.id.rdBtnRd);
        rdBtnAl = (RadioButton)findViewById(R.id.rdBtnAl);
        rdBtnAs = (RadioButton)findViewById(R.id.rdBtnAs);
        rdBtnAf = (RadioButton)findViewById(R.id.rdBtnAf);
        rdBtnH = (RadioButton)findViewById(R.id.rdBtnH);
        rdBtnM = (RadioButton)findViewById(R.id.rdBtnM);
        txtVwVi = (TextView)findViewById(R.id.txtVwVi);
        txtVwFe = (TextView)findViewById(R.id.txtVwFe);
        rdBtnH.setEnabled(true);
        rdBtnM.setEnabled(true);
        rdGrupReg.setOnCheckedChangeListener(this);
        rdGrupGen.setOnCheckedChangeListener(this);

    }
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Iao = Integer.parseInt(ediTxtAño.getText().toString());
        if(group==rdGrupReg){
            if(checkedId==R.id.rdBtnRd){
                Desarrollados(Iao);
            }
            if(checkedId==R.id.rdBtnAl){
                America(Iao);
            }
            if(checkedId==R.id.rdBtnAs){
                Asia(Iao);
            }
            if(checkedId==R.id.rdBtnAf){
                Africa(Iao);
            }
        }
        else             if(group==rdGrupGen){
            if(checkedId==R.id.rdBtnH){
                Genero(1);
            }
            if(checkedId==R.id.rdBtnM){
                Genero(2);
            }

        }
}
    public  void Desarrollados (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 75;
            IDif = 10;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 75;
            IDif = 9;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 80;
            IDif = 8;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 80;
            IDif = 7;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 85;
            IDif = 6;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 90;
            IDif = 4;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un año de referencia correcto, entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public  void America (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 60;
            IDif = 10;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 65;
            IDif = 9;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 70;
            IDif = 8;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 75;
            IDif = 7;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 75;
            IDif = 6;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 70;
            IDif = 4;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un año de referencia correcto, entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public  void Asia (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 45;
            IDif = 10;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 50;
            IDif = 9;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 65;
            IDif = 8;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 65;
            IDif = 7;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 60;
            IDif = 6;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 65;
            IDif = 4;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un aÒo de referencia correcto, entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public  void Africa (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 35;
            IDif = 10;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 45;
            IDif = 9;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 55;
            IDif = 8;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 60;
            IDif = 7;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 55;
            IDif = 6;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 60;
            IDif = 4;
            rdBtnH.setEnabled(true);
            rdBtnM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un Año de referencia correcto, entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public void Genero(int Gen){
        txtVwVi.setText("");
        txtVwFe.setText("");
        if (Gen==1){
            IExp = IExp - (IDif/2);
            IFDes = Iao + IExp;
            txtVwVi.setText("" + IExp + " Años");
            txtVwFe.setText("" + IFDes);
        }
        else if (Gen==2){
            IExp = IExp + (IDif/2);
            IFDes = Iao + IExp;
            txtVwVi.setText("" + IExp + " Años");
            txtVwFe.setText("" + IFDes);
        }
    }

}

