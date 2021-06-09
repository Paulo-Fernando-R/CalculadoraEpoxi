package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void calcular(View view)
    {
        EditText base = findViewById(R.id.textBox);
        EditText altura = findViewById(R.id.textBox4);
        EditText result = findViewById(R.id.textBox3);
        result.setEnabled(false);



        try {


            double b = Double.parseDouble(base.getText().toString());
            double a = Double.parseDouble(altura.getText().toString());
            double r = ((b * a) * 0.11);
            result.setText(String.valueOf(r));
        }
        catch (Exception e)
        {

        }
    }
}