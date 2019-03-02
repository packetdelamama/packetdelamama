package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransportaColet extends AppCompatActivity {
    private Button button_afiseazaCereri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporta_colet);

        button_afiseazaCereri = (Button) findViewById(R.id.cautaClienti);
        button_afiseazaCereri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( TransportaColet.this, CereriDisponibile_DriverPerspective.class);
                startActivity(intent_register);
            }
        });
    }
}
