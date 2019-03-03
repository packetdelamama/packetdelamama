package com.example.packetdelamama;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CurseDisponibile extends AppCompatActivity {

    public ListView theListView;
    public ArrayAdapter<String> myAdapter;
    private Button button_trimiteCerere;

    static public ArrayList<String> match_list2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curse_disponibile);

        Intent myIntent = getIntent();
        //String[] match_list_1 = myIntent.getStringExtra("match_list");
        //match_list2 = myIntent.getStringArrayListExtra("match_list");
        TrimiteSiPrimeste match_list_TsP = new TrimiteSiPrimeste();
        String mydata = "Ora plecare: <" + "12" + ">  pret: <" + "35 lei" + ">";
        String mydata2 = "Ora plecare: <" + "12" + ">  pret: <" + "25 lei" + ">";
        String mydata3 = "Ora plecare: <" + "17" + ">  pret: <" + "30 lei" + ">";
        //String[ ] myData = {"Visual Basic .NET", "Java", "Android", "C# .NET", "PHP", "C++", "Scala", "Ruby on Rails", "Javascript", "HTML", "Python", "Swift"};
        String[] myData = { mydata, mydata2, mydata3};
        theListView = (ListView) findViewById(R.id.dynamicList);
        myAdapter = new ArrayAdapter<String>( CurseDisponibile.this,
                android.R.layout.simple_list_item_1, myData);//match_list_TsP.match_list);
        theListView.setAdapter(myAdapter);

        button_trimiteCerere = (Button) findViewById(R.id.trimiteCerere);
        button_trimiteCerere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( CurseDisponibile.this, ActionPage.class);
                startActivity(intent_register);
            }
        });
    }


}
