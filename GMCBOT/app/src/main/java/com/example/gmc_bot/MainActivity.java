package com.example.gmc_bot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoEntrar;
    Button botaoRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoEntrar=findViewById(R.id.btnEntrar);
        botaoRegistrar=findViewById(R.id.btnRegistrar);
        botaoRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaregistro= new Intent(getApplicationContext(),TelaRegistrar.class);
                startActivity(telaregistro);
                finish();
            }
        });
        botaoEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaInicial= new Intent(getApplicationContext(),Telainicial.class);
                startActivity(telaInicial);
                finish();
            }
        });
    }
}