package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    final static String EXTRA_NAME1 = "extra_name";
    final static String EXTRA_EMAIL1 = "extra_email";
    final static String EXTRA_ENROLL = "extra_enroll";

    TextView tvGetName, tvGetEmail,tvGetEnrollNum;
    Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvGetName = findViewById(R.id.tv_getName);
        tvGetEmail = findViewById(R.id.tv_getEmail);
        tvGetEnrollNum = findViewById(R.id.tv_getEnrollNum);
        btnContact = findViewById(R.id.btn_contact);

        String name = getIntent().getStringExtra(EXTRA_NAME1);
        String email = getIntent().getStringExtra(EXTRA_EMAIL1);
        String enrollNum = getIntent().getStringExtra(EXTRA_ENROLL);

        tvGetName.setText("Name:\n" + name);
        tvGetEmail.setText("Email :\n" + email);
        tvGetEnrollNum.setText("Enrollment Number :\n" + enrollNum);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberHp = "087822535180";
                Intent contact = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + numberHp));
                startActivity(contact);
            }
        });
    }
}