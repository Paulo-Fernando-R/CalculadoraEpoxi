package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }

    public void calcular(View view)
    {
        EditText alt = findViewById(R.id.textBox7);
        EditText larg = findViewById(R.id.textBox9);
        EditText comp = findViewById(R.id.textBox10);
        EditText result = findViewById(R.id.textBox11);

        try {
            double altura = Double.parseDouble(alt.getText().toString());
            double largura = Double.parseDouble(larg.getText().toString());
            double comprimento = Double.parseDouble(comp.getText().toString());

            double aux = altura * largura * comprimento;
            result.setText(String.valueOf(aux));

        }
        catch (Exception e)
        {

        }
    }
}