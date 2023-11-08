package com.example.supermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {

    private EditText password,email;
    private Button register2;
    private FireBase fb;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        register2 = findViewById(R.id.register2);
        fb = new FireBase(FirebaseAuth.getInstance(), this);
        login = findViewById(R.id.LogIn2);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password4);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fb.signIn(email.getText().toString(), password.getText().toString());
            }
        });
        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignInActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}