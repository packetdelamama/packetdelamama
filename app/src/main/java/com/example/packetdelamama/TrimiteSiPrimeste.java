package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.packetdelamama.data.ClientsRequest;
import com.example.packetdelamama.data.DriversRequest;

import java.util.ArrayList;

public class TrimiteSiPrimeste extends AppCompatActivity {

    public String adresa_livrare;
    public String adresa_ridicare;
    public String telefon_livrare;
    public String telefon_ridicare;
    public String data_ridicare;
    public String metoda_plata;

    public ArrayList<ClientsRequest> requests = new ArrayList<>();
    public ArrayList<String> match_list = new ArrayList<>();

    public EditText e_adresa_livrare;
    public EditText e_adresa_ridicare;
    public EditText e_telefon_livrare;
    public EditText e_telefon_ridicare;
    public EditText e_data_ridicare;
    public EditText e_metoda_plata;

    public String[] match_list1;

    private Button button_trimiteSiPrimeste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trimite_si_primeste);

        e_adresa_livrare = (EditText) findViewById (R.id.orasTrimitere);
        adresa_livrare = e_adresa_livrare.getText().toString();
//        adresa_livrare = "Bucuresti";

        e_adresa_ridicare = (EditText) findViewById (R.id.orasPrimire);
        adresa_ridicare = e_adresa_ridicare.getText().toString();
//        adresa_ridicare = "Pitesti";

        e_telefon_livrare = (EditText) findViewById (R.id.telefonTrimitere);
        telefon_livrare = e_telefon_livrare.getText().toString();

        e_telefon_ridicare = (EditText) findViewById (R.id.telefonRidicare);
        telefon_ridicare = e_telefon_ridicare.getText().toString();

        e_data_ridicare = (EditText) findViewById (R.id.dataLivrare);
        data_ridicare = e_data_ridicare.getText().toString();
//        data_ridicare = "12/12";

        e_metoda_plata = (EditText) findViewById (R.id.tipPlata);
        metoda_plata = e_metoda_plata.getText().toString();

        //Primeste lista de drivers


//        TransportaColet drivers1 = new TransportaColet();
//        TransportaColet drivers2 = new TransportaColet();

//        int k = 0;


        button_trimiteSiPrimeste = (Button) findViewById(R.id.cautaCurse);
        button_trimiteSiPrimeste.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TransportaColet drivers = new TransportaColet();

                drivers.requests.add( new DriversRequest("12", "Bucuresti", "Pitesti","12/12", "15"));
                drivers.requests.add( new DriversRequest("1", "Bucuresti", "Pitesti","12/12", "25"));
                drivers.requests.add( new DriversRequest("16", "Bucuresti", "Pitesti","12/12", "30"));

                for ( DriversRequest driver : drivers.requests ) {
                    Boolean match = adresa_ridicare.equals(driver.oras_plecare) && adresa_livrare.equals(driver.oras_sosire)
                            && data_ridicare.equals(driver.data_plecare);
                    if ( match ) {
                        CurseDisponibile.match_list2.add("Ora plecare: <" + driver.ora_plecare + ">  pret: <" + driver.pret_lei + ">");
//                match_list1[k] = "Ora plecare: <" + driver.ora_plecare + ">  pret: <" + driver.pret_lei + ">";
//                k++;
                    }
                }

                Intent intent_register = new Intent( TrimiteSiPrimeste.this, CurseDisponibile.class);
                intent_register.putStringArrayListExtra("match_list", match_list);
                addRequest(adresa_livrare, adresa_ridicare, data_ridicare, telefon_ridicare, telefon_livrare, metoda_plata);
                startActivity(intent_register);
            }
        });
    }

    protected void addRequest(String adresa_livrare, String adresa_ridicare, String data_ridicare, String telefon_ridicare, String telefon_livrare, String metoda_plata) {
        requests.add(new ClientsRequest(adresa_ridicare, adresa_livrare, telefon_livrare, telefon_ridicare, data_ridicare, metoda_plata));
    }
}
