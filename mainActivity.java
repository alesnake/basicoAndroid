package com.example.alejandro.prueba;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        cambiarTexto();
        Button boton=(Button)findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=(TextView)findViewById(R.id.respuesta);

                if(tv.getVisibility()==View.VISIBLE){

                    tv.setVisibility(View.INVISIBLE);
                }else{
                    tv.setVisibility(View.VISIBLE);
                }

                Toast t= Toast.makeText(getApplicationContext(), "TOAAAST", Toast.LENGTH_SHORT);
                t.show();
            }
        });
        */


        Button boton=(Button)findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                ArrayList<fila>stringGuay=new ArrayList<fila>();

                for(int i=0;i<20;i++){
                    stringGuay.add(new fila(false,"hola"+i));
                }

                Intent activ2=new Intent(getApplicationContext(), actividad2.class);
                activ2.putExtra("stringGuay",stringGuay);
                startActivity(activ2);
            }
        });
    }

    /*public void cambiarTexto(){
        TextView hW=(TextView)findViewById(R.id.helloWorld);
        hW.setText(R.string.tigre);
    }*/


}
