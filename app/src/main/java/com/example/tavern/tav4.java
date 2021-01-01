package com.example.tavern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class tav4 extends AppCompatActivity {

    GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tav4);

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
                        Intent intent = new Intent(tav4.this, bAnand1.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1){
                        Intent intent = new Intent(tav4.this, bAnand2.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2){
                        Intent intent = new Intent(tav4.this, bAnand3.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3){
                        Intent intent = new Intent(tav4.this, bAnand4.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4){
                        Intent intent = new Intent(tav4.this, bAnand5.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5){
                        Intent intent = new Intent(tav4.this, bAnand6.class);
                        startActivity(intent);
                    }
                    else if (finalI == 6){
                        Intent intent = new Intent(tav4.this, bAnand7.class);
                        startActivity(intent);
                    }
                    else if (finalI == 7){
                        Intent intent = new Intent(tav4.this, bAnand8.class);
                        startActivity(intent);
                    }
                    else if (finalI == 8){
                        Intent intent = new Intent(tav4.this, bAnand9.class);
                        startActivity(intent);
                    }
                    else if (finalI == 9){
                        Intent intent = new Intent(tav4.this, bAnand10.class);
                        startActivity(intent);
                    }
                    else if (finalI == 10){
                        Intent intent = new Intent(tav4.this, bAnand11.class);
                        startActivity(intent);
                    }
                    else if (finalI == 11){
                        Intent intent = new Intent(tav4.this, bAnand12.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(tav4.this,"Please set activity for this card item",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
