package org.example;


public abstract class Recipe {
    public String name;
    public String ingredient;

    public Recipe(String name, String ingredient) {
        this.name = name;
        this.ingredient = ingredient;
    }

    public abstract void displayRecipe();
}
