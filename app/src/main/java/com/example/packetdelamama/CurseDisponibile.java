package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurseDisponibile extends AppCompatActivity {
    private Button button_trimiteCerere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curse_disponibile);


        button_trimiteCerere = (Button) findViewById(R.id.trimiteCerere);
        button_trimiteCerere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( CurseDisponibile.this, CereriDisponibile_DriverPerspective.class);
                startActivity(intent_register);
            }
        });
    }
}
