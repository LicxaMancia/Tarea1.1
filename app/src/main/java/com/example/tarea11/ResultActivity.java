package com.example.tarea11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText("");
        resultado.setText(getIntent().getStringExtra("resultado").toString());
    }
}