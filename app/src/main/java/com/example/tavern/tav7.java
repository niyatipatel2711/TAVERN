package com.example.tavern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class tav7 extends AppCompatActivity {

    GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tav7);
        gridLayout = (GridLayout) findViewById(R.id.mainGrid1);

        setSingleEvent(gridLayout);
    }
    private void setSingleEvent(GridLayout gridLayout) {
        for(int i=0; i<gridLayout.getChildCount(); i++){
            CardView cardView = (CardView)gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0){
                        Intent intent = new Intent(tav7.this, gChanga.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1){
                        Intent intent = new Intent(tav7.this, gChanga.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2){
                        Intent intent = new Intent(tav7.this, gChanga.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3){
                        Intent intent = new Intent(tav7.this, gChanga.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(tav7.this,"Please set activity for this card item",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
