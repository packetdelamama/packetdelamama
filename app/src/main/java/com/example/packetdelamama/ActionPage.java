package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActionPage extends AppCompatActivity {

    private Button button_Trimit;
    private Button button_Primesc;
    private Button button_Transport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_page);

        button_Trimit = (Button) findViewById(R.id.trimitePachet);
        button_Trimit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( ActionPage.this, TrimiteSiPrimeste.class);
                startActivity(intent_register);
            }
        });

        button_Primesc = (Button) findViewById(R.id.primestePachet);
        button_Primesc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( ActionPage.this, TrimiteSiPrimeste.class);
                startActivity(intent_register);
            }
        });

        button_Transport = (Button) findViewById(R.id.transportaPachet);
        button_Transport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( ActionPage.this, TransportaColet.class);
                startActivity(intent_register);
            }
        });

    }



}
