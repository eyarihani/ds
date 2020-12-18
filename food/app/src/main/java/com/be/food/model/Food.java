package com.be.food.model;

public class Food {
    String NameFood;
    String description;
    String prix;

    public Food(String nameFood, String description, String prix) {
        NameFood = nameFood;
        this.description = description;
        this.prix = prix;
    }

    public String getNameFood() {
        return NameFood;
    }

    public void setNameFood(String nameFood) {
        NameFood = nameFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
