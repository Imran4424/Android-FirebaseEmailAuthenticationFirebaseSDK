package com.imran.android.java_firebaseemailauthenticationsdk;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText repeatPassword;
    private ProgressBar progressBar;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.editTextNameSignUp);
        email = (EditText) findViewById(R.id.editTextEmailSignUp);
        password = (EditText) findViewById(R.id.editTextPasswordSignUp);
        repeatPassword = (EditText) findViewById(R.id.editTextRePasswordSignUp);
        progressBar = (ProgressBar) findViewById(R.id.progressBarSignUp);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onResume() {
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }

    public void registerUser(View view) {
        String nameInput = name.getText().toString().trim();
        String emailInput = email.getText().toString().trim();
        String passwordInput = password.getText().toString().trim();
        String repeatPasswordInput = repeatPassword.getText().toString().trim();

        if (TextUtils.isEmpty(nameInput)) {
            showToast("User name is empty");
            return;
        }

        if (TextUtils.isEmpty(emailInput)) {
            showToast("Email is empty");
            return;
        }

        if (passwordInput.isEmpty()) {
            showToast("Password is empty");
            return;
        }

        if (repeatPasswordInput.isEmpty()) {
            showToast("Repeat password is empty");
            return;
        }

        if (passwordInput != repeatPasswordInput) {
            showToast("passwords not matched");
            return;
        }

        if (passwordInput.length() < 8) {
            showToast("Password is too short");
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}