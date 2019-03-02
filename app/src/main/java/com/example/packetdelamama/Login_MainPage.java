package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_MainPage extends AppCompatActivity {

    private Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__main_page);

        button_login = (Button) findViewById(R.id.loginButton);
        button_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( Login_MainPage.this, ActionPage.class);
                startActivity(intent_register);
            }
        });

    }
}
