package com.example.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.myfirstapp.database.DatabaseHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUp {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpName;

    @FXML
    private Button signUpButton;

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField signUpSurname;

    @FXML
    private TextField login_field;

    @FXML
    private CheckBox signUpCheckBoxMale;
    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private TextField signUpCountry;

    @FXML
    void initialize() {
        signUpButton.setOnAction(event -> {
            signUpNewUser();
        });
    }

    private void signUpNewUser() {
            DatabaseHandler dbHandler = new DatabaseHandler();
            String nameText = signUpName.getText().trim();
            String surnameText = signUpSurname.getText().trim();
            String loginText = login_field.getText().trim();
            String passwordText = password_field.getText().trim();
            String countryText = signUpCountry.getText();
            String genderText = "male";
            if (signUpCheckBoxFemale.isSelected())
                genderText = "female";
            User user =new User(nameText, surnameText, loginText, passwordText,countryText, genderText);

            dbHandler.signUpUser(user);
    }
}
