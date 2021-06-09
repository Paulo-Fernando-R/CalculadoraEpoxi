package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void calcular(View view)
    {
        EditText raio = findViewById(R.id.textBox6);
        EditText altura = findViewById(R.id.textBox5);
        EditText result = findViewById(R.id.textBox8);

        try {
            double radius = Double.parseDouble(raio.getText().toString());
            double h = Double.parseDouble(altura.getText().toString());
            double aux = ((3.14 * (radius * radius) * h));
            result.setText(String.valueOf(aux));
        }
        catch (Exception e)
        {

        }
    }
}