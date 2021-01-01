package com.example.tavern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signing extends AppCompatActivity {

    ImageView img;
    EditText emailId, password;
    Button btn;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing);

        mFirebaseAuth = FirebaseAuth.getInstance();
        img = findViewById(R.id.GoBack);
        emailId = findViewById(R.id.email1);
        password = findViewById(R.id.pass1);
        btn = findViewById(R.id.loginbtn);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if( mFirebaseUser  != null){
                    Toast.makeText(signing.this, "You are logged in",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(signing.this, tavFirst.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(signing.this, "Please login",Toast.LENGTH_SHORT).show();
                }
            }
        };
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailId.getText().toString();
                String pass = password.getText().toString();
                if(email.isEmpty()){
                    emailId.setError("Please enter email id");
                    emailId.requestFocus();
                }
                else if (pass.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                else if (email.isEmpty() && pass.isEmpty()){
                    Toast.makeText(signing.this, "Fields are empty!", Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && pass.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(signing.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(signing.this, "Login error, Please login again!", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Intent intent = new Intent(signing.this, tavFirst.class);
                                startActivity(intent);
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(signing.this, "Error occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(signing.this, tavMain.class);
                startActivity(i);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
}
