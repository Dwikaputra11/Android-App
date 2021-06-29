package com.example.itcproject_androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    final static String EXTRA_EMAIL = "extra_email";
    TextView tvGetEmail;
    Button btnInfo;
    ImageButton imgBtnInstagram,imgBtnTwitter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        btnInfo = findViewById(R.id.btn_info);
        imgBtnInstagram = findViewById(R.id.imgBtn_instagram);
        imgBtnTwitter = findViewById(R.id.imgBtn_twitter);
        tvGetEmail = findViewById(R.id.tv_getEmail);

        String email = getIntent().getStringExtra(EXTRA_EMAIL);
//        Log.d("email = ", email);
        tvGetEmail.setText(email);

        imgBtnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(Intent.ACTION_VIEW);
                move.setData(Uri.parse("https://www.instagram.com/dwikaputra_/"));
                startActivity(move);
            }
        });

        imgBtnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(Intent.ACTION_VIEW);
                move.setData(Uri.parse("https://twitter.com/Dwikariswanda"));
                startActivity(move);
            }
        });


        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(Intent.ACTION_VIEW);
                move.setData(Uri.parse("https://www.tokopedia.com/"));
                startActivity(move);
            }
        });
    }
}