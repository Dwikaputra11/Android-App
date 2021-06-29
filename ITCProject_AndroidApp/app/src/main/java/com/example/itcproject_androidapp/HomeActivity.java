package com.example.itcproject_androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    final static String EXTRA_EMAIL = "extra_email";
    TextView tvGetEmail;
    Button btnShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvGetEmail = findViewById(R.id.tv_getEmail);
        btnShop = findViewById(R.id.btn_shop);

        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        tvGetEmail.setText(email);

        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(HomeActivity.this,ShopActivity.class);
                move.putExtra(ShopActivity.EXTRA_EMAIL, email);
                startActivity(move);
            }
        });
    }
}