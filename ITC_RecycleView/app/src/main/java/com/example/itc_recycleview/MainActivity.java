package com.example.itc_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<UserPemain> listPemain ;
    private PemainAdapter pemainAdapter;

    private int[] imgPemain = {
            R.drawable.messi,
            R.drawable.lukaku,
            R.drawable.sancho,
            R.drawable.donnarumma,
            R.drawable.alaba,
            R.drawable.aguero,
            R.drawable.depay,
            R.drawable.odegaard,
            R.drawable.grealish,
            R.drawable.varane
    };

    private static String[] namaPemain = {
            "Lionel Messi",
            "Romelu Lukaku",
            "Jadon Sancho",
            "Gianluigi Donnarumma",
            "David Alaba",
            "Kun Aguero",
            "Memphis Depay",
            "Martin Odegaard",
            "Jack Grealish",
            "Raphael Varane"
    };

    private static String[] pindahKlub = {
            "Barcelona --> Paris Saint-German",
            "Inter Milan --> Chelsea",
            "Borussia Dortmund --> Manchaster United",
            "AC Milan --> Paris Saint-German",
            "Bayern Munchen --> Real Madrid",
            "Manchester City --> Barcelona",
            "Lyon --> Barcelona",
            "Real Madrid --> Arsenal",
            "Aston Villa --> Manchester City",
            "Real Madrid --> Manchester United"
    };
    private static String[] transfer = {
            "Free",
            "Rp1,9 Trillion",
            "Rp1,4 Trillion",
            "Free",
            "Free",
            "Free",
            "Free",
            "Rp791 Billion",
            "Rp2 Trillion",
            "Rp845 Billion"
    };
    private static String[] gaji = {
            "Rp591,7 billion/year",
            "Rp8,9 billion",
            "Rp6,9 billion/week",
            "Rp204 billion/year",
            "Rp174,4 billion/year",
            "Rp104 billion/year",
            "Rp120 billion/year",
            "Rp40 billion/year",
            "Rp6 billion/week",
            "Rp4 billion/year"
    };
    private static String[] asalNegara = {
            "Argentina",
            "Belgium",
            "England",
            "Italy",
            "Austria",
            "Argentina",
            "Netherlands",
            "Norway",
            "England",
            "France"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getData();

        RecyclerView recyclerView = findViewById(R.id.rv_main);
        pemainAdapter = new PemainAdapter(listPemain);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(pemainAdapter);

    }

    public void getData(){
        listPemain = new ArrayList<>();
        for (int i = 0; i < namaPemain.length;i++){
            listPemain.add(new UserPemain(namaPemain[i],asalNegara[i],gaji[i],transfer[i],pindahKlub[i],imgPemain[i]));
        }
    }

}