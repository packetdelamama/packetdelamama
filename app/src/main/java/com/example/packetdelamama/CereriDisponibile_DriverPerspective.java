package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CereriDisponibile_DriverPerspective extends AppCompatActivity {

    private Button button_trimiteConfirmare;

    public ListView theListView;
    public ArrayAdapter<String> myAdapter;
    private Button button_trimiteCerere;

    static public ArrayList<String> match_list2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereri_disponibile__driver_perspective);

        String mydata = "De la: " + "Pitesti" + "\n" + "Catre: " + "Bucuresti"
                + "\n"+ "Tel. ridicare: " + "0761234567" + "\n" + "Tel. predare: " + "0767654321";
        String mydata2 = "De la: " + "Pitesti" + "\n" +"Catre: " + "Bucuresti"
                + "\n"+ "Tel. ridicare: " + "0747654321" + "\n" + "Tel. predare: " + "0741234567";
        //String[ ] myData = {"Visual Basic .NET", "Java", "Android", "C# .NET", "PHP", "C++", "Scala", "Ruby on Rails", "Javascript", "HTML", "Python", "Swift"};
        String[] myData = { mydata, mydata2};
        theListView = (ListView) findViewById(R.id.dynamicList);
        myAdapter = new ArrayAdapter<String>( CereriDisponibile_DriverPerspective.this,
                android.R.layout.simple_list_item_1, myData);//match_list_TsP.match_list);
        theListView.setAdapter(myAdapter);




        button_trimiteConfirmare = (Button) findViewById(R.id.trimitere_Confirmare);
        button_trimiteConfirmare.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( CereriDisponibile_DriverPerspective.this, ActionPage.class);
                startActivity(intent_register);
            }
        });
    }
}
