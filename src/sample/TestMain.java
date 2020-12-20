package sample;

import com.fasterxml.jackson.core.JsonProcessingException;

public class TestMain extends JsonReader.SelectRecipe {

    public static void main(String[] args) throws JsonProcessingException {

        selectRecipe("Toast");
        Recipes.returnStats(getCurrentCraft());

    }


}
