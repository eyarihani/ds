package com.be.food.viewholders;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.be.food.controllers.Details;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.be.food.R;
import com.be.food.model.Food;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import java.sql.Driver;
import java.util.List;
import java.util.jar.Attributes;

public class foodViewHolders extends RecyclerView.Adapter<foodViewHolders.AdapterFood> {
    Context context;
    List<Food> food;



    public foodViewHolders(Context context, List<Food> food)
    {
        this.context=context;
        this.food=food;

    }
    @NonNull
    @Override
    public foodViewHolders.AdapterFood onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(context).inflate(R.layout.fooditem,parent,false);
        return new AdapterFood(row);
    }

    @Override
    public void onBindViewHolder(@NonNull final foodViewHolders.AdapterFood holder, final int position) {

        holder.NameFood.setText(food.get(position).getNameFood());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, Details.class);
                intent.putExtra("name",food.get(position).getNameFood());
                intent.putExtra("desc",food.get(position).getDescription());
                intent.putExtra("price",food.get(position).getPrix());
                    context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return food.size();
    }

    public class AdapterFood extends RecyclerView.ViewHolder {
TextView NameFood;
        public AdapterFood(@NonNull View itemView) {
            super(itemView);
NameFood= itemView.findViewById(R.id.foodname);


        }
    }
}