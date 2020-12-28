package com.imran.android.java_firebaseemailauthenticationsdk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SignedInActivity extends AppCompatActivity {
    private TextView name;
    private TextView email;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed_in);

        name = (TextView) findViewById(R.id.textNameSigned);
        email = (TextView) findViewById(R.id.textEmailSigned);

        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void signOutFinal(View view) {
        firebaseAuth.signOut();
        startActivity(new Intent(this, MainActivity.class));
    }
}