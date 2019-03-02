package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_MainPage extends AppCompatActivity {
    public String phone_number;
    public String password;

    public EditText e_phone_number;
    public EditText e_password;

    private Button button_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__main_page);

        e_phone_number = (EditText) findViewById (R.id.phoneLogin_text);
        phone_number = e_phone_number.getText().toString();

        e_password = (EditText) findViewById (R.id.passwordLogin_text);
        password = e_password.getText().toString();

        button_login = (Button) findViewById(R.id.loginButton);
        button_login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( Login_MainPage.this, ActionPage.class);
                startActivity(intent_register);
            }
        });

    }
}
