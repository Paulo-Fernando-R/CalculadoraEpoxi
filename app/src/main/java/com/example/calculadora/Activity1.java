package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


    }


    public void calcular(View view)
    {



        EditText raio = findViewById(R.id.textBox1);
        EditText result = findViewById(R.id.textBox2);
        result.setEnabled(false);
        try {
            double radius = Double.parseDouble(raio.getText().toString());
            double aux = ((3.14 * (radius * radius)) * 0.11);
            result.setText(String.valueOf(aux));
        }
        catch (Exception E)
        {

        }



       

    }
}