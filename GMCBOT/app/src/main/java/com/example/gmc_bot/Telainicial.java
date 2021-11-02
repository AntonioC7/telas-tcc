package com.example.gmc_bot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Telainicial extends AppCompatActivity {
    int onoff=0;
    Button botaoIniciar;
    Button botaoSair;
    Button botaoConfig;
    Button botaoGraficos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicial);
        botaoIniciar=findViewById(R.id.btnIniciar);
        botaoSair=findViewById(R.id.btnSair);
        botaoGraficos=findViewById(R.id.btnGraficos);
        botaoGraficos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaGraficos= new Intent(getApplicationContext(),TelaGraficos.class);
                startActivity(telaGraficos);
                finish();
            }
        });

        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);
                finish();
            }
        });
        botaoIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(onoff==0) {
                    onoff = 1;
                    botaoIniciar.setText("PARAR");
                } else if (onoff==1){
                    onoff = 0;
                    botaoIniciar.setText("INICIAR");
                }
            }
        });
    }
}