package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_register;
    private Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_register = (Button) findViewById(R.id.register_button);
        button_register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( MainActivity.this, Register_MainPage.class);
                startActivity(intent_register);
            }
        });

        button_login = (Button) findViewById(R.id.login_button);
        button_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_login = new Intent( MainActivity.this, Login_MainPage.class);
                startActivity(intent_login);
            }
        });


    }
}
