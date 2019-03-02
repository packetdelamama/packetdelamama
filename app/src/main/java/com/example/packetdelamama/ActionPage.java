package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ActionPage extends AppCompatActivity {

    public Button btnSignOut;
    private Button button_Trimit;
    private Button button_Primesc;
    private Button button_Transport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_page);
        findViews();
        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ActionPage.this,Login_MainPage.class));
                finish();
            }
        });
        button_Trimit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( ActionPage.this, TrimiteSiPrimeste.class);
                startActivity(intent_register);
            }
        });
        button_Primesc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( ActionPage.this, TrimiteSiPrimeste.class);
                startActivity(intent_register);
            }
        });
        button_Transport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( ActionPage.this, TransportaColet.class);
                startActivity(intent_register);
            }
        });
    }
    private void findViews() {
        btnSignOut = findViewById(R.id.btn_sign_out);
        button_Trimit = findViewById(R.id.trimitePachet);
        button_Primesc = findViewById(R.id.primestePachet);
        button_Transport = findViewById(R.id.transportaPachet);
    }

}

