package sample;

import JsonReader.JsonItemString;
import JsonReader.RecipeJSON;
import JsonReader.RecipeListJSON;
import JsonReader.SelectRecipe;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.*;
import java.util.*;


public class Controller extends UserTerms {  // eksempel på nedarvning

    BufferedWriter output = new BufferedWriter(new FileWriter("credentials.txt",true));
    Scanner input = new Scanner(new FileReader("credentials.txt"));
    StringBuilder sb = new StringBuilder();

    @FXML
    private ImageView RecipePreview;

    @FXML
    private ImageView LoginLogo;

    @FXML
    private ImageView SignInLogo;

    @FXML
    private javafx.scene.control.ListView<String> ListView;



    @FXML
    private ImageView recipeImage;

    @FXML
    private Label recipeExactIngredients;

    @FXML
    private Label RecipeInstructions;

    @FXML
    private Text RecipeName;

    //--------------------------------------------{Tabs}------------------------------------------

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab SignInTab;

    @FXML
    private Tab TermsTab;

    @FXML
    private Button BackButton;

    @FXML
    private Tab SignUpTab;

    @FXML
    private Tab HomeTab;

    @FXML
    private Tab RecipeTab;

    //--------------------------------------------{Text}----------------------------------------------------------------


    @FXML
    private Label Terms;

    @FXML
    private TextField FilterInput;

    @FXML
    private Label previewDescription;

    @FXML
    private TextField SignInEmail;

    @FXML
    private TextField SignInPassword;

    @FXML
    private TextField SignUpEmail;

    @FXML
    private TextField SignUpPassword;

    @FXML
    private TextField VerifyPassword;

    @FXML
    private Text LogInWarning;

    @FXML
    private Text SignUpWarning;

    //-------------------------------------------{Button}---------------------------------------------------------------

    @FXML
    private Button AllRecipiesButton;

    @FXML
    private Button SignUpButton;

    @FXML
    private Button SignInButton;

    @FXML
    private Button SignUpConfirmButton;

    @FXML
    private Button selectRecipeButton;

    //------------------------------------------{variables}-------------------------------------------------------------

    // eksempel på et par variable
    boolean noFoundLogin = true;

    ArrayList<String[]> listOfDetailsSplit = new ArrayList<>();

    ObjectMapper objectMapper = new ObjectMapper();

    String jsonStr = JsonItemString.getJsonData();

    RecipeListJSON recipeListJSON = objectMapper.readValue(jsonStr, RecipeListJSON.class);

    String allLogins;

    //---------------------------------------{Backend Functions}--------------------------------------------------------


    public Controller() throws IOException {
    }

    void checkCreatedUsers(){
        while (input.hasNext()) {
            sb.append(input.next());
        }
    }

    public void initialize() {

        tabPane.getSelectionModel().select(TermsTab);

        Terms.setText(getTerms());

        SignInLogo.setImage(new Image("/images/logo.png"));
        LoginLogo.setImage(new Image("/images/logo.png"));

        tabPane.addEventFilter(      // eksempel på brug af Enum til at disable left og right piletasterne
                KeyEvent.ANY,        // da de navigerer mellem tabs og dette ikke skal være muligt for brugeren
                event -> {
                    if (EnumSet.of(KeyCode.LEFT, KeyCode.RIGHT).contains(event.getCode())) {
                        event.consume();
                    }
                });

        loadRecipes();
    }



    void loadRecipes() {

       ArrayList<String> listViewData = new ArrayList<>();

        for (int i = 0; i < recipeListJSON.getRecipeList().size(); i++) {

            listViewData.add(recipeListJSON.getRecipeList().get(i).getRecipeName());

        }

        ListView.getItems().addAll(listViewData);
        ListView.refresh();

    }

    //---------------------------------------{Frontend Functions}-------------------------------------------------------

    @FXML
    void GoToSignUp(ActionEvent event) {
        tabPane.getSelectionModel().select(SignUpTab);
        LogInWarning.setText(null);
        SignUpWarning.setText(null);
        SignUpEmail.clear();
        SignUpPassword.clear();
        VerifyPassword.clear();
    }

    @FXML
    void GoToHomeTab(ActionEvent event) {
        tabPane.getSelectionModel().select(HomeTab);
    }

    @FXML
    void BackTologIn(ActionEvent event) {
        tabPane.getSelectionModel().select(SignInTab);
        LogInWarning.setText(null);
        SignUpWarning.setText(null);
        SignInEmail.clear();
        SignInPassword.clear();
    }


    @FXML
    void logIn(ActionEvent event) {  // eksempel på persistens (hente gemt data)

        String enteredEmail = SignInEmail.getText().toLowerCase();
        String enteredPassword = SignInPassword.getText();
        String actualEmail = null;
        String actualPassword = null;

        try {
            input = new Scanner(new FileReader("credentials.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        checkCreatedUsers();

        allLogins = sb.toString();

        input.close();

        List<String> listOfUserDetail = new ArrayList<>(Arrays.asList(allLogins.split("----------")));

        listOfUserDetail.remove(listOfUserDetail.get(0));

        for (int i = 0; i < listOfUserDetail.size(); i++) {
            listOfDetailsSplit.add(listOfUserDetail.get(i).split(":"));
            actualEmail = listOfDetailsSplit.get(i)[0];

            if (enteredEmail.equals(actualEmail)) {
                actualEmail = listOfDetailsSplit.get(i)[0];
                actualPassword = listOfDetailsSplit.get(i)[1];
                break;
            }

            actualEmail = null;
        }

        if ((enteredEmail.equals(actualEmail)) && enteredPassword.equals(actualPassword)){
            tabPane.getSelectionModel().select(HomeTab);
            noFoundLogin = false;
            LogInWarning.setText(null);
        }


        if(noFoundLogin){
            LogInWarning.setText("Wrong email or password");
            SignInPassword.clear();
        }


    }


    @FXML
    void signUp(ActionEvent event) throws IOException {   // eksempel på persistens (gemme data)
        sb.setLength(0);

        output = new BufferedWriter(new FileWriter("credentials.txt",true));

        String Email = SignUpEmail.getText().toLowerCase();
        String Password = SignUpPassword.getText();
        String tmpPass = VerifyPassword.getText();

        if( ((Email.equals("") || Password.equals("")) || tmpPass.equals(""))) {

            SignUpWarning.setText("Invalid E-mail Or Password");

        }else if(!Password.equals(tmpPass)){

            SignUpWarning.setText("Passwords Do Not Match");
            SignUpPassword.clear();
            VerifyPassword.clear();

        } else {

            output.write("\n");
            output.write(Email + ":");
            output.write(Password);
            output.write("\n");
            output.write("----------");
            output.close();

            input = new Scanner(new FileReader("credentials.txt"));

            checkCreatedUsers();
            allLogins = sb.toString();
            input.close();

            SignUpWarning.setText(null);
            tabPane.getSelectionModel().select(SignInTab);

        }

    }


    @FXML
    void displayImage(MouseEvent event) {

        String currentImageName = recipeListJSON.getRecipeList().get(ListView.getSelectionModel().getSelectedIndex()).getImage();
        String currentDescription = recipeListJSON.getRecipeList().get(ListView.getSelectionModel().getSelectedIndex()).getDescription();

        RecipePreview.setImage(new Image("/images/"+currentImageName));
        previewDescription.setText(currentDescription);
    }


    @FXML
    void selectCurrentRecipe(ActionEvent event) throws JsonProcessingException {   // eksempel på exceptions

        String selectedRecipe = recipeListJSON.getRecipeList().get(ListView.getSelectionModel().getSelectedIndex()).getRecipeName();

        JsonReader.SelectRecipe.selectRecipe(selectedRecipe);

        recipeImage.setImage(new Image("/images/"+ SelectRecipe.getCurrentCraft().image));

        RecipeName.setText(SelectRecipe.getCurrentCraft().recipeName);

        recipeExactIngredients.setText(SelectRecipe.getCurrentCraft().ingredientsExact);

        RecipeInstructions.setText(SelectRecipe.getCurrentCraft().instructions);

        tabPane.getSelectionModel().select(RecipeTab);
    }




    @FXML
    void SearchForIngredients(ActionEvent event) {

        String ingredient = FilterInput.getText();
        ArrayList<RecipeJSON> filteredRecipes = new ArrayList<>();
        ArrayList<String> convertedFilteredRecipes = new ArrayList<>();

        for (int i = 0; i < recipeListJSON.getRecipeList().size(); i++) {  // eksempel på loop 1: for i loop

            if (recipeListJSON.getRecipeList().get(i).getIngredients().contains(ingredient)) {

                filteredRecipes.add(recipeListJSON.getRecipeList().get(i));

            }
        }

        for (RecipeJSON filteredRecipe : filteredRecipes) {  // eksempel på loop 2: enhanced for loop

            convertedFilteredRecipes.add(filteredRecipe.getRecipeName());

        }

            ListView.getItems().clear();
            ListView.getItems().addAll(convertedFilteredRecipes);
            ListView.refresh();


            if(ingredient.equals("")){
                loadRecipes();
            }


    }
}
