package com.example.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botonsumar;
    private Button botonrestar;
    private Button botondividir;
    private Button botonmultiplicar;
    private TextView resultado;
    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonsumar = findViewById(R.id.botonSumar);
        botonsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText("Suma: "+sumadelosedittext(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())));
            }
        });

        botonrestar=findViewById(R.id.buttonRestar);
        botonrestar.setOnClickListener(v -> {
            resultado.setText("Resta: "+restadelosedittext(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())));
        });

        botonmultiplicar=findViewById(R.id.buttonMultiplicar);
        botonmultiplicar.setOnClickListener(v -> {
            resultado.setText("Multiplicacion: "+multiplicaciondelosedittext(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())));
        });

        botondividir=findViewById(R.id.buttonDividir);
        botondividir.setOnClickListener(v -> {
            resultado.setText("Division: "+divisiondelosedittext(Integer.parseInt(num1.getText().toString()),Integer.parseInt(num2.getText().toString())));
        });

        resultado = findViewById(R.id.tvresultado);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
    }

    public int sumadelosedittext(int n1, int n2){
        int totalsuma;
        totalsuma=n1+n2;
        return totalsuma;
    }

    public int restadelosedittext(int n1, int n2){
        int total;
        total=n1-n2;
        return total;
    }

    public int multiplicaciondelosedittext(int n1, int n2){
        int total;
        total=n1*n2;
        return total;
    }

    public float divisiondelosedittext(float n1, float n2){
        float total;
        total=n1/n2;
        return total;
    }
}