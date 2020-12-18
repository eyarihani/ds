package com.be.food.controllers;

import androidx.appcompat.app.AppCompatActivity;
import com.be.food.R;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.nfc.NdefMessage;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class Details extends AppCompatActivity {
    TextView NameFood,Description,Prix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        NameFood = findViewById(R.id.nom);
        Description = findViewById(R.id.description);
        Prix = findViewById(R.id.prix);

        Intent intent = getIntent();

       String Name = intent.getStringExtra("name");
        String descr = intent.getStringExtra("desc");
       String price = intent.getStringExtra("price");

        NameFood.setText(Name);
        Description.setText(descr);
        Prix.setText(price);

    }
}