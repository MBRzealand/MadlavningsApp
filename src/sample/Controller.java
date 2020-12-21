package sample;

import JsonReader.JsonItemString;
import JsonReader.RecipeListJSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.util.*;


public class Controller {

    BufferedWriter output = new BufferedWriter(new FileWriter("credentials.txt",true));
    BufferedWriter saveOutput;
    Scanner input = new Scanner(new FileReader("credentials.txt"));
    Scanner loadInput;
    StringBuilder sb = new StringBuilder();
    StringBuilder loadSB = new StringBuilder();



    @FXML
    private javafx.scene.control.ListView<String> ListView;

    //--------------------------------------------{Tabs}------------------------------------------

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab SignInTab;

    @FXML
    private Tab SignUpTab;

    @FXML
    private Tab HomeTab;


    //--------------------------------------------{Text}----------------------------------------------------------------


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
    private Button SignUpButton;

    @FXML
    private Button SignInButton;

    @FXML
    private Button SignUpConfirmButton;

    //------------------------------------------{variables}-------------------------------------------------------------

    boolean noFoundLogin = true;
    ArrayList<String[]> listOfDetailsSplit = new ArrayList<>();

    //---------------------------------------{Backend Functions}--------------------------------------------------------

    public Controller() throws IOException {
    }

    void checkCreatedUsers(){
        while (input.hasNext()) {
            sb.append(input.next());
        }
    }

    public void initialize() throws JsonProcessingException {
        loadRecipes();
    }

    void loadRecipes() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonStr = JsonItemString.getJsonData();

        RecipeListJSON recipeListJSON = objectMapper.readValue(jsonStr, RecipeListJSON.class);

        ArrayList<String> listViewData = new ArrayList<>();

        for (int i = 0; i < recipeListJSON.getRecipeList().size(); i++) {

            listViewData.add(recipeListJSON.getRecipeList().get(i).getRecipeName());

        }

        Collections.sort(listViewData);

        ListView.getItems().addAll(listViewData);

    }

    //---------------------------------------{Frontend Functions}-------------------------------------------------------

    @FXML
    void GoToSignUp(ActionEvent event) {
        tabPane.getSelectionModel().select(SignUpTab);
        LogInWarning.setText(null);
    }


    @FXML
    void logIn(ActionEvent event) throws FileNotFoundException {
        sb.setLength(0);
        input = new Scanner(new FileReader("credentials.txt"));

        checkCreatedUsers();

        input.close();

        String allLogins = sb.toString();

        List<String> listOfUserDetail = new ArrayList<>(Arrays.asList(allLogins.split("----------")));

        listOfUserDetail.remove(listOfUserDetail.get(0));

        String enteredEmail = SignInEmail.getText().toLowerCase();
        String enteredPassword = SignInPassword.getText();
        String actualEmail = null;
        String actualPassword = null;


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
    void signUp(ActionEvent event) throws IOException {

        input = new Scanner(new FileReader("credentials.txt"));

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

            SignUpWarning.setText(null);
            tabPane.getSelectionModel().select(SignInTab);

        }

        checkCreatedUsers();
        input.close();

    }

}
