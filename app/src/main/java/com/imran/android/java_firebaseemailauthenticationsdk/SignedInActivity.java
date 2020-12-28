package com.imran.android.java_firebaseemailauthenticationsdk;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignedInActivity extends AppCompatActivity {
    private TextView name;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signed_in);

        name = (TextView) findViewById(R.id.textNameSigned);
        email = (TextView) findViewById(R.id.textEmailSigned);
    }

    public void signOutFinal(View view) {

    }
}