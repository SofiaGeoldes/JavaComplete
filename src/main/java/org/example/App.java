package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        RecipeCatalog catalog = new RecipeCatalog();


        catalog.addRecipe(new Dessert("Ciocolata de casa", "Zahar", 300));
        catalog.addRecipe(new Dessert("Albinuta", "Miere", 500));
        catalog.addRecipe(new Dessert("Alba ca Zapada", "Cocos", 400));
        catalog.addRecipe(new MainDish("Friptura", "Pui", 50));
        catalog.addRecipe(new MainDish("Ciorba", "Cartofi", 30));


        catalog.displayRecipe();


    }

}
