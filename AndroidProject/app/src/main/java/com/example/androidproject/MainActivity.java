package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvEmail,tvJudul,tvSignUp,tvPass,tvName;
    EditText etEmail,etName,etPass;
    RadioGroup rgGender;
    RadioButton rbFemale,rbMale;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.et_email);
        etName = findViewById(R.id.et_name);
        btnNext = findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String name = etName.getText().toString();
            String email = etEmail.getText().toString();

            Intent move = new Intent(MainActivity.this,MainActivity2.class);

            move.putExtra(MainActivity2.EXTRA_NAME,name);
            move.putExtra(MainActivity2.EXTRA_EMAIL,email);


            startActivity(move);
            }
        });
    }

}