package com.miempresa.appsemana02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    EditText nombre, apellidos, dni, celular, direccion, ciudad;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre    = (EditText)findViewById(R.id.editNombre);
        apellidos = (EditText)findViewById(R.id.editApellido);
        dni       = (EditText)findViewById(R.id.editDni);
        celular   = (EditText)findViewById(R.id.editCelular);
        direccion = (EditText)findViewById(R.id.editDireccion);
        ciudad    = (EditText)findViewById(R.id.editCiudad);
        aceptar   = (Button)findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nombre.getText().toString();
                String ape = apellidos.getText().toString();
                String docu = dni.getText().toString();
                String tel = celular.getText().toString();
                String dir = direccion.getText().toString();
                String city = ciudad.getText().toString();
                Intent i = new Intent(Formulario.this, MostrarDatos.class);

                i.putExtra("name",name );
                i.putExtra("ape",ape );
                i.putExtra("docu",docu );
                i.putExtra("tel",tel );
                i.putExtra("dir",dir );
                i.putExtra("city",city );

                startActivity(i);
            }
        });
    }
}