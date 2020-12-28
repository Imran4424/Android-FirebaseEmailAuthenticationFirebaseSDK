package com.imran.android.java_firebaseemailauthenticationsdk;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText repeatPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.editTextNameSignUp);
        email = (EditText) findViewById(R.id.editTextEmailSignUp);
        password = (EditText) findViewById(R.id.editTextPasswordSignUp);
        repeatPassword = (EditText) findViewById(R.id.editTextRePasswordSignUp);
    }

    public void signUpForm(View view) {

    }
}