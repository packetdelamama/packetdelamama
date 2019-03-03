package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.packetdelamama.data.DriversRequest;

import java.sql.Driver;
import java.util.ArrayList;

public class TransportaColet extends AppCompatActivity {

    public String oras_plecare;
    public String oras_sosire;
    public String ora_plecare;
    public String data_plecare;
    public String pret_lei;

    ArrayList<DriversRequest> requests = new ArrayList<>();

    public EditText e_oras_plecare;
    public EditText e_oras_sosire;
    public EditText e_ora_sosire;
    public EditText e_data_plecare;
    public EditText e_pret_lei;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporta_colet);

        e_oras_plecare = findViewById (R.id.orasPlecare);
        oras_plecare = e_oras_plecare.getText().toString();

        e_oras_sosire = findViewById (R.id.orasDestinatie);
        oras_sosire = e_oras_sosire.getText().toString();

        e_ora_sosire = findViewById (R.id.oraPlecare);
        ora_plecare = e_ora_sosire.getText().toString();

        e_data_plecare = findViewById (R.id.dataPlecare);
        data_plecare = e_data_plecare.getText().toString();

        e_pret_lei = findViewById (R.id.pretCursa);
        pret_lei = e_pret_lei.getText().toString();

        Button button_afiseazaCereri = findViewById(R.id.cautaClienti);
        button_afiseazaCereri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( TransportaColet.this, CereriDisponibile_DriverPerspective.class);

                addRequest(oras_plecare, oras_sosire, ora_plecare, data_plecare, pret_lei);

                startActivity(intent_register);
            }
        });


    }

    protected void addRequest(String oras_plecare, String oras_sosire, String ora_plecare, String data_plecare, String pret_lei) {
        requests.add(new DriversRequest(ora_plecare,oras_sosire,oras_plecare,data_plecare,pret_lei));
    }
}
