package com.example.packetdelamama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register_MainPage extends AppCompatActivity {
    private Button button_register;
    private Button button_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register__main_page);

        button_register = (Button) findViewById(R.id.save_register);
        button_register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_register = new Intent( Register_MainPage.this, Login_MainPage.class);
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
}
