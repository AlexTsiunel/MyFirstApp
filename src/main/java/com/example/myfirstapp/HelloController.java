package com.example.myfirstapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSigInButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void initialize() {

        authSigInButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();
            if(!loginText.equals("")&& !loginPassword.equals("")){
                loginUser(loginText, loginPassword);
            }else {
                System.out.println("Login and password is empty");
            }
        });
        /*
       участок кода отвечает за кнопку loginSignUpButton (соответствует кнопке register в файле hello-view.fxml).
         */
        loginSignUpButton.setOnAction(event -> {
            loginSignUpButton.getScene().getWindow().hide(); //Прячим окно с кнопкой

            FXMLLoader loader = new FXMLLoader(); //Создаём объект-загрузчика
            loader.setLocation(getClass().getResource(
                    "signUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }

    private void loginUser(String loginText, String loginPassword) {

    }
}

/*
"C:/Users/Leshii82/IdeaProjects/MyFirstApp/src/main/resources/com/example/myfirstapp/view.fxml"
 */

