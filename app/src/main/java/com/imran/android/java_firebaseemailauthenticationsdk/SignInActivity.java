package com.imran.android.java_firebaseemailauthenticationsdk;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        email = (EditText) findViewById(R.id.editTextEmailSignIn);
        password = (EditText) findViewById(R.id.editTextPasswordSignIn);
        progressBar = (ProgressBar) findViewById(R.id.progressBarSignIn);
    }

    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }

    public void signInForm(View view) {

    }
}