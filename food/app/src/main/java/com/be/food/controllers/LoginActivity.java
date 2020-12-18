package com.be.food.controllers;

import androidx.appcompat.app.AppCompatActivity;

import com.be.food.R;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
EditText Email, Password;
Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email= findViewById(R.id.edt_email);
        Password= findViewById(R.id.edt_password);
        Login= findViewById(R.id.btn_login);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Login ();

            }
        });
    }

    private void Login (){
        String email=Email.getText().toString();
        String password=Password.getText().toString();

        if (email.isEmpty())
        {
            Email.setError("invalid email");
        }
        else if (password.isEmpty())
        {
            Password.setError("invalid password");

        }
        else{
            SharedPreferences sref = getSharedPreferences("h",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sref.edit();
            editor.putBoolean("connected",true);
            editor.apply();
            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }

    }
}