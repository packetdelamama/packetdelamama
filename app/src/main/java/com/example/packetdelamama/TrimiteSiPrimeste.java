package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrimiteSiPrimeste extends AppCompatActivity {

    public String adresa_livrare;
    public String adresa_ridicare;
    public String telefon_livrare;
    public String telefon_ridicare;
    public String data_ridicare;
    public String metoda_plata;

    public EditText e_adresa_livrare;
    public EditText e_adresa_ridicare;
    public EditText e_telefon_livrare;
    public EditText e_telefon_ridicare;
    public EditText e_data_ridicare;
    public EditText e_metoda_plata;

    private Button button_trimiteSiPrimeste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimite_si_primeste);

        e_adresa_livrare = (EditText) findViewById (R.id.orasTrimitere);
        adresa_livrare = e_adresa_livrare.getText().toString();

        e_adresa_ridicare = (EditText) findViewById (R.id.orasPrimire);
        adresa_ridicare = e_adresa_ridicare.getText().toString();

        e_telefon_livrare = (EditText) findViewById (R.id.telefonTrimitere);
        telefon_livrare = e_telefon_livrare.getText().toString();

        e_telefon_ridicare = (EditText) findViewById (R.id.telefonRidicare);
        telefon_ridicare = e_telefon_ridicare.getText().toString();

        e_data_ridicare = (EditText) findViewById (R.id.dataLivrare);
        data_ridicare = e_data_ridicare.getText().toString();

        e_metoda_plata = (EditText) findViewById (R.id.tipPlata);
        metoda_plata = e_metoda_plata.getText().toString();

        button_trimiteSiPrimeste = (Button) findViewById(R.id.cautaCurse);
        button_trimiteSiPrimeste.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( TrimiteSiPrimeste.this, CurseDisponibile.class);
                startActivity(intent_register);
            }
        });
    }
}
