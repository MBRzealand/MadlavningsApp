package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Controller {

    BufferedWriter output = new BufferedWriter(new FileWriter("credentials.txt",true));
    BufferedWriter saveOutput;
    Scanner input = new Scanner(new FileReader("credentials.txt"));
    Scanner loadInput;
    StringBuilder sb = new StringBuilder();
    StringBuilder loadSB = new StringBuilder();


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

    //-------------------------------------------{Button}---------------------------------------------------------------

    @FXML
    private Button SignUpButton;

    @FXML
    private Button SignInButton;

    @FXML
    private Button SignUpConfirmButton;

    //------------------------------------------{variables}-------------------------------------------------------------

    boolean noFoundLogin = true;

    //---------------------------------------{Backend Functions}--------------------------------------------------------

    public Controller() throws IOException {
    }

    void checkCreatedUsers(){
        while (input.hasNext()) {
            sb.append(input.next());
        }
    }

    //---------------------------------------{Frontend Functions}-------------------------------------------------------

    @FXML
    void GoToSignUp(ActionEvent event) {
        tabPane.getSelectionModel().select(SignUpTab);

    }


    @FXML
    void logIn(ActionEvent event) throws FileNotFoundException {
        sb.setLength(0);
        input = new Scanner(new FileReader("credentials.txt"));

        checkCreatedUsers();

        input.close();


        List<String[]> finalListOfUserDetail = new ArrayList<>();

        String allLogins = sb.toString();

        List<String> listOfUserDetail = new ArrayList<>(Arrays.asList(allLogins.split("----------")));

        listOfUserDetail.remove(listOfUserDetail.get(0));

        for (String s : listOfUserDetail) {
            String[] tmplist = s.split(":");
            finalListOfUserDetail.add(tmplist);
        }

        String enteredEmail = SignInEmail.getText().toLowerCase();
        String enteredPassword = SignInPassword.getText();


        for (String[] strings : finalListOfUserDetail) {

            if ((strings[1].contains(enteredPassword) && !enteredPassword.equals("")) &&
                    (strings[0].contains(enteredEmail.toLowerCase()) && !enteredEmail.equals(""))) {
                tabPane.getSelectionModel().select(HomeTab);
                noFoundLogin = false;
                LogInWarning.setText(null);
                break;

            }

        }


        if(noFoundLogin){
            LogInWarning.setText("Wrong email or password");
        }
    }


    @FXML
    void signUp(ActionEvent event) throws IOException {

        input = new Scanner(new FileReader("credentials.txt"));

        String Email = SignUpEmail.getText().toLowerCase();
        String Password = SignUpPassword.getText();
        String VerifyPassword = VerifyPassword.getText();

        if( (Email.equals("") || Password.equals("")) || VerifyPassword.equals("")){

            System.out.println("FUCK");

        } else {

            output.write("\n");
            output.write(Email + ":");
            output.write(Password);
            output.write("\n");
            output.write("----------");
            output.close();

            tabPane.getSelectionModel().select(SignInTab);

        }

        checkCreatedUsers();
        input.close();

    }


}
