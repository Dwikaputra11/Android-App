package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvJudul, tvNama,tvTelp;
    EditText etNama, etTelp;
    ImageView ivLogo;
    RadioGroup rgjKelamin;
    RadioButton rbLaki,rbPerempuan;
    CheckBox cbBersedia;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_nama);
        etTelp = findViewById(R.id.et_telp);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                String telp = etTelp.getText().toString();

                Intent pindah = new Intent(MainActivity.this,MainActivity2.class);

                pindah.putExtra(MainActivity2.EXTRA_NAMA, nama);
                pindah.putExtra(MainActivity2.EXTRA_TELP, telp);

                startActivity(pindah);
            }
        });
    }
}