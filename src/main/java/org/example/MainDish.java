package org.example;

public class MainDish extends Recipe {
    int cookingTime;

    public MainDish(String name, String ingredient, int cookingTime) {
        super(name, ingredient);
        this.cookingTime = cookingTime;
    }

    @Override
    public void displayRecipe() {
        System.out.println("Main Dish: "  + name + "\nMain Ingredient: " + ingredient + "\nCookingTime: " + cookingTime);


    }
}
