package com.example.gmc_bot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaRegistrar extends AppCompatActivity {

    Button botaoAbrirTLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_registrar);
        botaoAbrirTLogin=findViewById(R.id.btnAbrirTelaLogin);
        botaoAbrirTLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);
                finish();
            }
        });
    }
}