package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.net.Uri.parse;

public class MainActivity2 extends AppCompatActivity {

    final static String EXTRA_NAMA = "extra_nama";
    final static  String EXTRA_TELP = "extra_telp";

    TextView tvGetNama, tvGetTelp;
    Button btnHubungi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvGetNama = findViewById(R.id.tv_getNama);
        tvGetTelp = findViewById(R.id.tv_getTelp);
        btnHubungi = findViewById(R.id.btn_hubungi);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String telp = getIntent().getStringExtra(EXTRA_TELP);

        tvGetNama.setText("Nama: " + nama);
        tvGetTelp.setText("Nomor Telepon: " + telp);

        btnHubungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomorHp = "087822535180";
                Intent hubungi = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + nomorHp));
                startActivity(hubungi);
            }
        });
    }
}