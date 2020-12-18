package com.be.food.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import com.be.food.R;
import android.content.Intent;
import android.content.Context;
public class SplashActivity extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler= new Handler();
        handler.postDelayed(new Runnable(){

            @Override
            public void run (){

                SharedPref();
            }
        },2000);


    }
    public void SharedPref()
    {
        SharedPreferences sref = getSharedPreferences("h",Context.MODE_PRIVATE);
        boolean is_connected = sref.getBoolean("connected", false);
        if (is_connected){
            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }else{
            Intent intent= new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        }

    }

}