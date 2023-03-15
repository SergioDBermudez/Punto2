package com.example.punto2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView Clave2,Nombre2,Apellido2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Clave2 = (TextView) findViewById(R.id.Clave2);
        Nombre2 = (TextView) findViewById(R.id.Nombre2);
        Apellido2 = (TextView) findViewById(R.id.Apellido2 );

        String DatoClav = getIntent().getStringExtra("DatoClav");
        Clave2.setText("Clave: "+DatoClav);

        String DatoNombre = getIntent().getStringExtra("DatoNombre");
        Nombre2.setText("Nombre: "+DatoNombre);

        String DatoApellido = getIntent().getStringExtra("DatoApellido");
        Apellido2.setText("Apellido: "+DatoApellido);


    }

    //Método para el boton anterior

    //public void Anterior (View view){

       // Intent anterior = new Intent(this, PrincipalActivity.class);
        //startActivity(anterior);
    }
