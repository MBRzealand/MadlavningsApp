package JsonReader;

import java.util.ArrayList;

public class RecipeJSON {

    private String recipeName;

    private ArrayList<String> ingredients;
    private String ingredientsExact;

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

    public String getIngredientsExact() {
        return ingredientsExact;
    }

    public void setIngredientsExact(String ingredientsExact) {
        this.ingredientsExact = ingredientsExact;
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
}
