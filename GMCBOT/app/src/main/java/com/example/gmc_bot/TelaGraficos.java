package com.example.gmc_bot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaGraficos extends AppCompatActivity {
    Button botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_graficos);
        botaoVoltar=findViewById(R.id.btnVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Telainicial= new Intent(getApplicationContext(),Telainicial.class);
                startActivity(Telainicial);
                finish();
            }
        });

    }
}