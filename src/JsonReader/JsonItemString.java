package JsonReader;

public class JsonItemString {


    private static String JsonData = "{\n" +
            "   \"recipeList\":[\n" +
            "   {\n" +
            "       \"recipeName\": \"Toast\",\n" +
            "       \"ingredients\": [\"Ost\", \"Hvidt Brød\", \"Smør\", \"Skinke\"],\n" +
            "       \"instructions\": \"Smør brødet med smør, put skinke og ost imellem og put i toastjernet\",\n" +
            "       \"timeNeeded\": \"10\"\n" +
            "  },\n" +
            "  {\n" +
            "       \"recipeName\": \"Pasta\",\n" +
            "       \"ingredients\": [\"pasta\", \"vand\", \"salt\"],\n" +
            "       \"instructions\": \"kog pastaen\",\n" +
            "       \"timeNeeded\": \"15\"\n" +
            "  }\n" +
            " ]\n" +
            "}\n";


    public static String getJsonData() {
        return JsonData;
    }

    public static void setJsonData(String jsonData) {
        JsonData = jsonData;
    }
}


