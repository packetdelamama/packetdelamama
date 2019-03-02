package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrimiteSiPrimeste extends AppCompatActivity {
    private Button button_trimiteSiPrimeste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimite_si_primeste);

        button_trimiteSiPrimeste = (Button) findViewById(R.id.cautaCurse);
        button_trimiteSiPrimeste.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( TrimiteSiPrimeste.this, CurseDisponibile.class);
                startActivity(intent_register);
            }
        });
    }
}
