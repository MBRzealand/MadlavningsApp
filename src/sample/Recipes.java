package sample;

import java.util.ArrayList;

public class Recipes {

    String recipeName;
    ArrayList<String> ingredients;
    String instructions;
    Integer timeNeeded;


    public Recipes(String newRecipeName, ArrayList<String> newIngredients, String newInstructions, int newTime){

        this.recipeName = newRecipeName;
        this.ingredients = newIngredients;
        this.instructions = newInstructions;
        this.timeNeeded = newTime;

    }

    public static void returnStats(Recipes x){

        System.out.println("Recipe Name is: " + x.recipeName );
        System.out.println("Ingredients needed: " + x.ingredients);
        System.out.println("Instructions: " + x.instructions);
        System.out.println("Time needed: " + x.timeNeeded);
        System.out.println("----------------------------------------");
    }

}
