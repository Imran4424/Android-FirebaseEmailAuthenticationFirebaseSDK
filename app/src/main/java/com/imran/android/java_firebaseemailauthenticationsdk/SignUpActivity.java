package com.imran.android.java_firebaseemailauthenticationsdk;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText repeatPassword;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.editTextNameSignUp);
        email = (EditText) findViewById(R.id.editTextEmailSignUp);
        password = (EditText) findViewById(R.id.editTextPasswordSignUp);
        repeatPassword = (EditText) findViewById(R.id.editTextRePasswordSignUp);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void registerUser(View view) {
        String nameInput = name.getText().toString().trim();
        String emailInput = email.getText().toString().trim();
        String passwordInput = password.getText().toString().trim();
        String repeatPasswordInput = repeatPassword.getText().toString().trim();
    }
}