package com.example.tavern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class tavMain extends AppCompatActivity {

    EditText emailId, password, fName, userName, phoneNum;
    Button btn;
    FirebaseAuth mFirebaseAuth;
    ImageView imageView;
    TextView tvSignIn;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tav_main);

        mFirebaseAuth = FirebaseAuth.getInstance();
        fName = findViewById(R.id.fullName);
        userName = findViewById(R.id.userName);
        emailId = findViewById(R.id.email);
        phoneNum = findViewById(R.id.phNo);
        password = findViewById(R.id.pass);
        btn = findViewById(R.id.joinus);
        imageView = findViewById(R.id.imgView);
        tvSignIn = findViewById(R.id.tvSign);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                String name = fName.getText().toString();
                String username = userName.getText().toString();
                String email = emailId.getText().toString();
                String phNo = phoneNum.getText().toString();
                String pass = password.getText().toString();

                UserHelper userHelper = new UserHelper(name, username, email, phNo, pass);

                reference.setValue(userHelper);

                if(email.isEmpty()){
                        emailId.setError("Please enter email id");
                        emailId.requestFocus();
                }
                else if (pass.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                else if (email.isEmpty() && pass.isEmpty()){
                    Toast.makeText(tavMain.this, "Fields are empty!", Toast.LENGTH_SHORT).show();
                }
                else if(!(email.isEmpty() && pass.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(tavMain.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(tavMain.this, "Sign up unsuccessful, Please try again", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(tavMain.this, tavFirst.class));
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(tavMain.this, "Error occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tavMain.this, signing.class);
                startActivity(intent);
            }
        });
    }
}
