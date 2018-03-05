package com.example.adrianch.eva1_10_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
   TextView txt1;
   ListView listv;

    String [] asDatos = {"Adrian", "Alejandro", "Chavira", "Lopez","AFDSA","YOLO",
                        "OLA","Q","ACE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txt1 = (TextView)findViewById(R.id.txt1);
        listv = (ListView)findViewById(R.id.listv);

        ArrayAdapter<String> aaOrigenDatos = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,asDatos);
        listv.setAdapter(aaOrigenDatos);
        listv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        txt1.setText(asDatos[i]);

    }
}
