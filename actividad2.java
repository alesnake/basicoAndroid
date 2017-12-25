package com.example.alejandro.prueba;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class actividad2 extends AppCompatActivity {

    ArrayList<fila>al;
    ListView lv;
    BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lv=(ListView)findViewById(R.id.lista);

        al=(ArrayList<fila>) getIntent().getSerializableExtra("stringGuay");


        adapter=new adapter(this,al);

        lv.setAdapter(adapter);

        Button boton=(Button)findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text=(EditText)findViewById(R.id.txt);
                fila f=null;

                for(int i=0;i<al.size();i++){
                    if(text.getText().toString().equals(al.get(i).getS())){
                        f=al.get(i);

                        if(f.getCb()==false){
                            f.setCb(true);
                        }else{
                            f.setCb(false);
                        }

                        al.set(i,f);
                        //lv.setAdapter(adapter);
                    }
                }

                Intent nueva=new Intent(getApplicationContext(),actividad2.class);
                nueva.putExtra("stringGuay",al);
                startActivity(nueva);
            }
        });
    }
}
