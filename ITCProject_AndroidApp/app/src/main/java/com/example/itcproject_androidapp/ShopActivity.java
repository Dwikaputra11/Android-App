package com.example.itcproject_androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShopActivity extends AppCompatActivity {
    Button btnChart;
    EditText etSumShirt,etSumBag,etSumSmartphone,etSumPants;
    final static String EXTRA_EMAIL = "extra_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        String value;
        etSumBag = findViewById(R.id.et_sumBag);
        etSumPants = findViewById(R.id.et_sumPants);
        etSumSmartphone = findViewById(R.id.et_sumSmartphone);
        etSumShirt = findViewById(R.id.et_sumShirt);
        String email = getIntent().getStringExtra(EXTRA_EMAIL);

        btnChart = findViewById(R.id.btn_chart);

        btnChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sumBag = etSumBag.getText().toString().trim();
                String sumSmartphone = etSumSmartphone.getText().toString().trim();
                String sumPants = etSumPants.getText().toString().trim();
                String sumShirt = etSumShirt.getText().toString().trim();

                /*Log.d("sumBag = ", sumBag);
                Log.d("sumSmartphone = ", sumSmartphone);
                Log.d("sumPants = ", sumPants);
                Log.d("sumShirt = ", sumShirt);
                Log.d("SumBag : " , String.valueOf(Integer.parseInt(sumBag)));
                Log.d("SumPants : " , String.valueOf(Integer.parseInt(sumPants)));
                Log.d("SumSmartphone : " , String.valueOf(Integer.parseInt(sumSmartphone)));
                Log.d("SumShirt : " , String.valueOf(Integer.parseInt(sumShirt)));*/

                if (TextUtils.isEmpty(sumShirt)) {
                    etSumShirt.setError("Fill The Blank");
                } else if (TextUtils.isEmpty(sumSmartphone)) {
                    etSumSmartphone.setError("Fill The Blank");
                } else if (TextUtils.isEmpty(sumBag)) {
                    etSumBag.setError("Fill The Blank");
                } else if (TextUtils.isEmpty(sumPants)) {
                    etSumPants.setError("Fill The Blank");
                } else {
                    Intent move = new Intent(ShopActivity.this, ChartActivity.class);
                    move.putExtra("sumBag", Integer.parseInt(sumBag));
                    move.putExtra("sumShirt", Integer.parseInt(sumShirt));
                    move.putExtra("sumPants", Integer.parseInt(sumPants));
                    move.putExtra("sumSmartphone", Integer.parseInt(sumSmartphone));
                    move.putExtra(ChartActivity.EXTRA_EMAIL, email);
                    startActivity(move);
                }
            }
        });
    }
}