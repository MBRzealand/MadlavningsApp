package sample;

import java.util.ArrayList;

public class Recipes {

    String recipeName;
    ArrayList<String> ingredients;
    String ingredientsExact;
    String instructions;
    Integer timeNeeded;
    String image;
    String description;


    // eksempel på constructor
    public Recipes(String newRecipeName, ArrayList<String> newIngredients, String newExactIngredients, String newInstructions, int newTime, String img, String description){

        this.recipeName = newRecipeName;
        this.ingredients = newIngredients;
        this.ingredientsExact = newExactIngredients;
        this.instructions = newInstructions;
        this.timeNeeded = newTime;
        this.image = img;
        this.description = description;

    }

    // funktion til bugfixing, ikke relevant for selve programmet
    public static void returnStats(Recipes x){
        if (x != null) {
            System.out.println("Recipe Name is: " + x.recipeName);
            System.out.println("Ingredients needed: " + x.ingredients);
            System.out.println("Exact ingredients needed: " + x.ingredientsExact);
            System.out.println("Instructions: " + x.instructions);
            System.out.println("Time needed: " + x.timeNeeded);
            System.out.println("Image path: " + x.image);
            System.out.println("Description; " + x.description);
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Nothing Found");
        }
    }

}
