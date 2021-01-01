package com.example.tavern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class tav5 extends AppCompatActivity {

    GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tav5);

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
                        Intent intent = new Intent(tav5.this, gAnand1.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1){
                        Intent intent = new Intent(tav5.this, gAnand2.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2){
                        Intent intent = new Intent(tav5.this, gAnand3.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3){
                        Intent intent = new Intent(tav5.this, gAnand4.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4){
                        Intent intent = new Intent(tav5.this, gAnand5.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5){
                        Intent intent = new Intent(tav5.this, gAnand6.class);
                        startActivity(intent);
                    }
                    else if (finalI == 6){
                        Intent intent = new Intent(tav5.this, gAnand7.class);
                        startActivity(intent);
                    }
                    else if (finalI == 7){
                        Intent intent = new Intent(tav5.this, gAnand8.class);
                        startActivity(intent);
                    }
                    else if (finalI == 8){
                        Intent intent = new Intent(tav5.this, gAnand9.class);
                        startActivity(intent);
                    }
                    else if (finalI == 9){
                        Intent intent = new Intent(tav5.this, gAnand10.class);
                        startActivity(intent);
                    }
                    else if (finalI == 10){
                        Intent intent = new Intent(tav5.this, gAnand11.class);
                        startActivity(intent);
                    }
                    else if (finalI == 11){
                        Intent intent = new Intent(tav5.this, gAnand12.class);
                        startActivity(intent);
                    }
                    else if (finalI == 12){
                        Intent intent = new Intent(tav5.this, gAnand13.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(tav5.this,"Please set activity for this card item",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
