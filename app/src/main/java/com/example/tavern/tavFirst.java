package com.example.tavern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class tavFirst extends AppCompatActivity {

    Spinner s1,s2;
    Button sub;
    LinearLayout lout;
    String state[] = null;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tav_first);

        s1 = findViewById(R.id.spinner1);
        s2 = findViewById(R.id.spinner2);
        sub = findViewById(R.id.loginbtn);
        lout = findViewById(R.id.logout);

        lout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intoMain = new Intent(tavFirst.this, tavMain.class);
                startActivity(intoMain);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc = s1.getSelectedItem().toString();
                String gen = s2.getSelectedItem().toString();
                if (loc.equals("Changa") && gen.equals("Male")) {
                    Intent intent = new Intent(tavFirst.this, tav6.class);
                    startActivity(intent);
                } else if (loc.equals("Changa") && gen.equals("Female")) {
                    Intent intent = new Intent(tavFirst.this, tav7.class);
                    startActivity(intent);
                } else if (loc.equals("Anand") && gen.equals("Male")) {
                    Intent intent = new Intent(tavFirst.this, tav4.class);
                    startActivity(intent);
                } else if (loc.equals("Anand") && gen.equals("Female")) {
                    Intent intent = new Intent(tavFirst.this, tav5.class);
                    startActivity(intent);
                } else if (loc.equals("Nadiad") && gen.equals("Male")) {
                    Intent intent = new Intent(tavFirst.this, tavSec.class);
                    startActivity(intent);
                } else if (loc.equals("Nadiad") && gen.equals("Female")) {
                    Intent intent = new Intent(tavFirst.this, tav3.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(tavFirst.this, "Select your location/gender", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}