package com.example.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Método de botones
    public void Ingresar(View view) {

        Intent Ingresar = new Intent(this, MenuPrincipal.class);
        startActivity(Ingresar);


    }

    public void Registrarse(View view) {

        Intent Registrarse = new Intent(this, Registrarse.class);
        startActivity(Registrarse);

    }
}