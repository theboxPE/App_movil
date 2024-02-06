package com.example.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txtnum);
        txt = (TextView) findViewById(R.id.textView);
    }

    public void calificacion(View view) {
        String valor1 = txt1.getText().toString();

        if (!valor1.isEmpty()) {
            double calificacion = Double.parseDouble(valor1);

            // Aplica la lógica para determinar la calificación en letras
            String result;
            if (calificacion >= 90) {
                result = "A";
            } else if (calificacion >= 80) {
                result = "B";
            } else if (calificacion >= 70) {
                result = "C";
            } else if (calificacion >= 60) {
                result = "D";
            } else {
                result = "F";
            }


            txt.setText("Calificación en letras: " + result);

        } else {

            txt.setText("Ingrese una calificación válida");
        }
    }
}


