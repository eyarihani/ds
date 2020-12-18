package com.be.food.controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.be.food.model.Food;
import com.be.food.viewholders.foodViewHolders;

import com.be.food.R;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
public ArrayList<Food> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);

        list= new ArrayList<Food>();
        Food f1=new Food("Burger","KING","15.0 Dt");
        Food f2=new Food("Burger","KFC","19.0 Dt");
        Food f3=new Food("Burger","MC","45.0 Dt");
        list.add(f1);
        list.add(f2);
        list.add(f3);
        foodViewHolders food = new foodViewHolders(getApplicationContext(), list );
        recyclerView.setAdapter(food);

    }
}