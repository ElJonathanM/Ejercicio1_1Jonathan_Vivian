package com.example.ejercicio1_1jonathan_vivian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtnumero1, txtnumero2;
    Button btnsuma, btnresta, btndivision, btnmulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnumero1 = (EditText) findViewById(R.id.txtnumero1);
        txtnumero2 = (EditText) findViewById(R.id.txtnumero2);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmulti = (Button) findViewById(R.id.btnmulti);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1, n2, resultado;

                n1 = Double.valueOf(txtnumero1.getText().toString());
                n2 = Double.valueOf(txtnumero2.getText().toString());

                resultado = n1+n2;
                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),SegundaPagina.class);
                intent.putExtra("resultado", "Resultado de la suma: " + resultado);
                startActivity(intent);

            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1, n2, resultado;

                n1 = Double.valueOf(txtnumero1.getText().toString());
                n2 = Double.valueOf(txtnumero2.getText().toString());

                resultado = n1-n2;
                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),SegundaPagina.class);
                intent.putExtra("resultado", "Resultado de la resta: " + resultado);
                startActivity(intent);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double n1, n2, resultado;

                n1 = Double.valueOf(txtnumero1.getText().toString());
                n2 = Double.valueOf(txtnumero2.getText().toString());

                resultado = n1/n2;
                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),SegundaPagina.class);
                intent.putExtra("resultado", "Resultado de la división: " + resultado);
                startActivity(intent);
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double n1, n2, resultado;

                n1 = Double.valueOf(txtnumero1.getText().toString());
                n2 = Double.valueOf(txtnumero2.getText().toString());

                resultado = n1*n2;
                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),SegundaPagina.class);
                intent.putExtra("resultado", "Resultado de la multiplicación: " + resultado);
                startActivity(intent);
            }
        });

    }
}