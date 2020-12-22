package JsonReader;

import java.util.ArrayList;

public class RecipeJSON {

    private String recipeName;

    private ArrayList<String> ingredients;
    private String ingredientsExact;

    private String instructions;
    private Integer timeNeeded;

    private String image;
    private String description;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
