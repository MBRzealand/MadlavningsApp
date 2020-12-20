package JsonReader;

import java.util.ArrayList;

public class RecipeJSON {

    private String recipeName;
    private ArrayList<String> ingredients;
    private String instructions;
    private Integer timeNeeded;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Integer getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(Integer timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

//    private int durability;
//    private int difficulty;
//    private int maxQuality;
//    private int craftsmanship;
//    private int level;




    public String printInfo(){

        return "Recipe Name = " + getRecipeName() + "\nIngredients = "
                + getIngredients() + "\nInstructions = " + getInstructions() + "\nTime = "
                + getTimeNeeded();

    }


}
