package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    final static String EXTRA_NAME = "extra_name";
    final static String EXTRA_EMAIL = "extra_email";
    TextView tvEnrollNum,tvAddress,tvBirth;
    EditText etEnrollNum,etAddress,etBirth;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etEnrollNum = findViewById(R.id.et_enrollnum);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enrollNum = etEnrollNum.getText().toString();
                String name = getIntent().getStringExtra(EXTRA_NAME);
                String email = getIntent().getStringExtra(EXTRA_EMAIL);
                Intent move1 = new Intent(MainActivity2.this,MainActivity3.class);

                move1.putExtra(MainActivity3.EXTRA_ENROLL,enrollNum);
                move1.putExtra(MainActivity3.EXTRA_NAME1,name);
                move1.putExtra(MainActivity3.EXTRA_EMAIL1,email);
                startActivity(move1);
            }
        });
    }
}