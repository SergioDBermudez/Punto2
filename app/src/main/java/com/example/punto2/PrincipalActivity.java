package com.example.punto2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    private EditText txtClave, txtNombre, txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);

        txtClave = (EditText) findViewById(R.id.txtClave);
        txtNombre = (EditText)  findViewById(R.id.txtNombre);
        txtApellido = (EditText) findViewById(R.id.txtApellido);


    }

    //public void  Enviar(View view){

        //Intent i = new Intent(this, SegundaActivity.class);

        //i.putExtra("DatoClav",txtClave.getText().toString());
        //i.putExtra("DatoNombre",txtNombre.getText().toString());
        //i.putExtra("DatoApellido",txtApellido.getText().toString());

        //startActivity(i);

    private class Usuario {

        String clave;
        String nombre;
        String apellido;

        Usuario(String clave, String nombre, String apellido){

            this.clave = clave;
            this.nombre = nombre;
            this.apellido = apellido;

        }

        public String getClave(){
            return this.clave;
        }

        public String getNombre(){
            return this.nombre;
        }

        public String getApellido(){
            return this.apellido;
        }

    }





    public void Siguiente(View view) {

        Intent Siguiente = new Intent(this, SegundaActivity.class);
        startActivity(Siguiente);

    }
}



