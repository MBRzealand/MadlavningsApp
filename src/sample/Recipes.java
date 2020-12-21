package sample;

import java.util.ArrayList;

public class Recipes {

    String recipeName;
    ArrayList<String> ingredients;
    String ingredientsExact;
    String instructions;
    Integer timeNeeded;


    public Recipes(String newRecipeName, ArrayList<String> newIngredients, String newExactIngredients, String newInstructions, int newTime){

        this.recipeName = newRecipeName;
        this.ingredients = newIngredients;
        this.ingredientsExact = newExactIngredients;
        this.instructions = newInstructions;
        this.timeNeeded = newTime;

    }

    public static void returnStats(Recipes x){
        if (x != null) {
            System.out.println("Recipe Name is: " + x.recipeName);
            System.out.println("Ingredients needed: " + x.ingredients);
            System.out.println("Exact ingredients needed: " + x.ingredientsExact);
            System.out.println("Instructions: " + x.instructions);
            System.out.println("Time needed: " + x.timeNeeded);
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Nothing Found");
        }
    }

}
