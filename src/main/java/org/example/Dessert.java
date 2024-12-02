package org.example;

public class Dessert extends Recipe {
    public int calories;

    public Dessert(String name, String ingredient, int calories) {
        super(name, ingredient);
        this.calories = calories;
    }


    @Override
    public void displayRecipe() {
        System.out.println("Dessert: " + name + "\nMain Ingredient: " + ingredient + "\nCalories: " + calories);
    }
}
