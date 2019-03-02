package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CereriDisponibile_DriverPerspective extends AppCompatActivity {

    private Button button_trimiteConfirmare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereri_disponibile__driver_perspective);

        button_trimiteConfirmare = (Button) findViewById(R.id.trimitere_Confirmare);
        button_trimiteConfirmare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( CereriDisponibile_DriverPerspective.this, ActionPage.class);
                startActivity(intent_register);
            }
        });
    }
}
