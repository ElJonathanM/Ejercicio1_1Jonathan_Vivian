package com.example.ejercicio1_1jonathan_vivian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaPagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        TextView resultado = (TextView) findViewById(R.id.txtresultado);
        resultado.setText("");
        //Mando a llamar el resultado
        resultado.setText(getIntent().getStringExtra("resultado").toString());

    }
}