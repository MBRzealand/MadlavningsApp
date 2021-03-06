package JsonReader;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sample.Recipes;


public class SelectRecipe {

    static Recipes currentRecipe;

    public static Recipes getCurrentCraft() {
        return currentRecipe;
    }

    public static void setCurrentCraft(Recipes currentCraft) {
        SelectRecipe.currentRecipe = currentCraft;
    }


    public static void selectRecipe(String Name) throws JsonProcessingException {

    ObjectMapper objectMapper = new ObjectMapper();

    String jsonStr = JsonItemString.getJsonData();


    RecipeListJSON recipeListJSON = objectMapper.readValue(jsonStr, RecipeListJSON.class);


    boolean searchingForItem = true;


        while (searchingForItem) {

            String searchedRecipe = Name;


            RecipeJSON fetchedItem = recipeListJSON.getRecipeList().stream()
                    .filter(x -> searchedRecipe.equals(x.getRecipeName()))
                    .findAny().orElse(null);


            if (fetchedItem != null) {

                searchingForItem = false;

                currentRecipe = new Recipes(fetchedItem.getRecipeName(),fetchedItem.getIngredients(),fetchedItem.getIngredientsExact(),
                        fetchedItem.getInstructions(), fetchedItem.getTimeNeeded(), fetchedItem.getImage(), fetchedItem.getDescription() );


            } else {
                System.out.println("Item Doesn't exist\n");

                searchingForItem = false;
            }

        }

    }

}
