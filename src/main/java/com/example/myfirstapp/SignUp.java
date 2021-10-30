package com.example.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;
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

    }
}
