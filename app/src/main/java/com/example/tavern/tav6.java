package com.example.tavern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class tav6 extends AppCompatActivity {

    GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tav6);

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
                        Intent intent = new Intent(tav6.this, bChanga1.class);
                        startActivity(intent);
                    }
                    else if (finalI == 1){
                        Intent intent = new Intent(tav6.this, bChanga2.class);
                        startActivity(intent);
                    }
                    else if (finalI == 2){
                        Intent intent = new Intent(tav6.this, bChanga3.class);
                        startActivity(intent);
                    }
                    else if (finalI == 3){
                        Intent intent = new Intent(tav6.this, bChanga4.class);
                        startActivity(intent);
                    }
                    else if (finalI == 4){
                        Intent intent = new Intent(tav6.this, bChanga5.class);
                        startActivity(intent);
                    }
                    else if (finalI == 5){
                        Intent intent = new Intent(tav6.this, bChanga6.class);
                        startActivity(intent);
                    }
                    else if (finalI == 6){
                        Intent intent = new Intent(tav6.this, bChanga7.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(tav6.this,"Please set activity for this card item",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
