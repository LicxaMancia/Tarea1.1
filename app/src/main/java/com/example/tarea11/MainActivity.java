package com.example.tarea11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    EditText num1, num2;
    Button btnSumar, btnRestar, btnDividir, btnMultiplicar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        btnSumar = (Button) findViewById(R.id.btnSumar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1, n2, res;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                res = n1 + n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.putExtra("resultado","Resultado de la suma: "+res);
                startActivity(intent);

            }
        });

        btnRestar = (Button)findViewById(R.id.btnResta);

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1, n2, res;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                res = n1 - n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.putExtra("resultado","Resultado de la resta: "+res);
                startActivity(intent);

            }
        });

        btnDividir = (Button) findViewById(R.id.btnDividir);

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1, n2, res;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                res = n1 / n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.putExtra("resultado","Resultado de la division: "+res);
                startActivity(intent);

            }
        });

        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1, n2, res;
                n1 = Float.parseFloat(num1.getText().toString());
                n2 = Float.parseFloat(num2.getText().toString());
                res = n1 * n2;

                //Enviar a otra ventana
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.putExtra("resultado","Resultado de la multiplicacion: "+res);
                startActivity(intent);

            }
        });


    }

}




