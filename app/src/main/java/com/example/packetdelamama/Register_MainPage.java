package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.packetdelamama.data.User;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Register_MainPage extends AppCompatActivity {
    private Button button_register;
    private Button button_back;

    public ArrayList<User> registeredUsers = new ArrayList<>();

    public EditText e_user_name;
    public EditText e_phone_number;
    public EditText e_email_address;

    public String user_name;
    public String phone_number;
    public String email_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__main_page);

        e_user_name = (EditText) findViewById (R.id.name_text);
        user_name = e_user_name.getText().toString();

        e_phone_number = (EditText) findViewById (R.id.phoneLogin_text);
        phone_number = e_phone_number.getText().toString();

        e_email_address = (EditText) findViewById (R.id.email_text);
        email_address = e_email_address.getText().toString();

        button_register = (Button) findViewById(R.id.save_register);
        button_register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( Register_MainPage.this, Login_MainPage.class);
                // save users in a list;
                addRegisteredUser(user_name, phone_number, email_address);
                startActivity(intent_register);
            }
        });

        button_back = (Button) findViewById(R.id.back_toMain);
        button_back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( Register_MainPage.this, MainActivity.class);
                startActivity(intent_register);
            }
        });


    }

    protected void addRegisteredUser(String user_name, String phone_number, String email_address) {
        registeredUsers.add(new User(user_name, phone_number, email_address));
    }
}
