package com.example.tavern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class switchPanel extends AppCompatActivity {

    CardView cardView2,cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_panel);
        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(switchPanel.this, tavMain.class);
                startActivity(i);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(switchPanel.this, tavMain.class);
                startActivity(i);
            }
        });

    }

}
