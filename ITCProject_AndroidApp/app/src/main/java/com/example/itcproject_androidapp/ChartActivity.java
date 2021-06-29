package com.example.itcproject_androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChartActivity extends AppCompatActivity {
    TextView tvQtyPants,tvPricePants,tvQtyBag,tvPriceBag,
            tvQtySmartphone,tvPriceSmartphone,tvQtyShirt,tvPriceShirt,
            tvTtlQty,tvTtlPrice;

    Button btnOrder;

    final static String EXTRA_EMAIL = "extra_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);

        String email = getIntent().getStringExtra(EXTRA_EMAIL);

        Intent intent =  getIntent();
        int sumBag = intent.getIntExtra("sumBag",0);
        int sumPants = intent.getIntExtra("sumPants",0);
        int sumShirt = intent.getIntExtra("sumShirt",0);
        int sumSmartphone = intent.getIntExtra("sumSmartphone",0);

        tvPriceBag = findViewById(R.id.tv_priceBag);
        tvPriceSmartphone = findViewById(R.id.tv_priceSmartphone);
        tvPriceShirt= findViewById(R.id.tv_priceShirt);
        tvPricePants = findViewById(R.id.tv_pricePants);

        tvQtyBag = findViewById(R.id.tv_qtyBag);
        tvQtySmartphone = findViewById(R.id.tv_qtySmartphone);
        tvQtyShirt = findViewById(R.id.tv_qtyShirt);
        tvQtyPants = findViewById(R.id.tv_qtyPants);
        tvTtlPrice = findViewById(R.id.tv_ttlPrice);
        tvTtlQty = findViewById(R.id.tv_ttlQty);

        btnOrder = findViewById(R.id.btn_order);

        int rpBag = 150000;
        int rpHP = 2000000;
        int rpShirt = 30000;
        int rpPants = 60000;

        rpBag *= sumBag;
        rpHP *= sumSmartphone;
        rpPants *= sumPants;
        rpShirt *= sumShirt;
        int ttlQty = sumBag + sumPants + sumShirt + sumSmartphone;
        int ttlPrice = rpBag + rpHP + rpPants + rpShirt;

        /* memberi text angka text view */
        tvQtyPants.setText(String.valueOf(sumPants));
        tvQtyBag.setText(String.valueOf(sumBag));
        tvQtyShirt.setText(String.valueOf(sumShirt));
        tvQtySmartphone.setText(String.valueOf(sumSmartphone));
        tvPricePants.setText(String.valueOf(rpPants));
        tvPriceBag.setText(String.valueOf(rpBag));
        tvPriceSmartphone.setText(String.valueOf(rpHP));
        tvPriceShirt.setText(String.valueOf(rpShirt));
        tvTtlQty.setText(String.valueOf(ttlQty));
        tvTtlPrice.setText(String.valueOf(ttlPrice));


        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(ChartActivity.this,OrderActivity.class);
                move.putExtra(OrderActivity.EXTRA_EMAIL, email);
                startActivity(move);
            }
        });
    }
}