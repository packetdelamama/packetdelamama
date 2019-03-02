package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TransportaColet extends AppCompatActivity {
    public String oras_plecare;
    public String oras_sosire;
    public String ora_sosire;
    public int pret_lei;


    public EditText e_oras_plecare;
    public EditText e_oras_sosire;
    public EditText e_ora_sosire;
    public EditText e_pret_lei;

    private Button button_afiseazaCereri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporta_colet);

        e_oras_plecare = (EditText) findViewById (R.id.orasPlecare);
        oras_plecare = e_oras_plecare.getText().toString();

        e_oras_sosire = (EditText) findViewById (R.id.orasDestinatie);
        oras_plecare = e_oras_sosire.getText().toString();

        e_ora_sosire = (EditText) findViewById (R.id.oraPlecare);
        ora_sosire = e_ora_sosire.getText().toString();

        e_pret_lei = (EditText) findViewById (R.id.phoneLogin_text);
        pret_lei = Integer.parseInt(e_pret_lei.getText().toString());

        button_afiseazaCereri = (Button) findViewById(R.id.cautaClienti);
        button_afiseazaCereri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( TransportaColet.this, CereriDisponibile_DriverPerspective.class);
                startActivity(intent_register);
            }
        });
    }
}
