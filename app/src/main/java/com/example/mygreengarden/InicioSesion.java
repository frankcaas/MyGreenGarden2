package com.example.mygreengarden;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class InicioSesion extends AppCompatActivity {

    private TextView textViewRegistrarAqui;
    private Button buttonIniciarSesion;
    private ImageView imageViewAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        textViewRegistrarAqui=findViewById(R.id.textViewRegistrarAqui);
        buttonIniciarSesion=findViewById(R.id.buttonIniciarSesion);
        imageViewAtras=findViewById(R.id.imageViewAtras);

        textViewRegistrarAqui.setOnClickListener(new  View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this,Registrarse.class);
                startActivity(intent);
            }
        });

        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this,PrincipalCategorias.class);
                startActivity(intent);
            }
        });

        imageViewAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InicioSesion.this,Bienvenida.class);
                startActivity(intent);
            }
        });
    }
}