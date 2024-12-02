package org.example;

import java.util.ArrayList;

public class RecipeCatalog {

    ArrayList<Recipe> recipes = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void displayRecipe() {
        for (Recipe recipe : recipes) {
            recipe.displayRecipe();
            System.out.println("---------------");


        }
    }

}

