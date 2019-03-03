package com.example.packetdelamama;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
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

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        drawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

        findViews();
//        btnSignOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut();
//                startActivity(new Intent(ActionPage.this,Login_MainPage.class));
//                finish();
//            }
//        });
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer( GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

