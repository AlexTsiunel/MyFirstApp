package com.example.myfirstapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 350);
        stage.setTitle("FirstApp!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


/*

https://metanit.com/java/javafx/1.1.php


Уроки #6
https://www.youtube.com/watch?v=Jx0DRIlm7Yo&t=84s
Уроки #7
https://www.youtube.com/watch?v=aC97NRrTO8E&t=363s
Уроки #8
https://www.youtube.com/watch?v=F-x8K0U0Cts&t=315s
Уроки #9
https://www.youtube.com/watch?v=7vV6Vj-lhOM&t=547s
Урок #10 - Подключение к базе данных (Java JDBC)
https://www.youtube.com/watch?v=BJ2SCZEkKoQ
Урок #11 - Добавление пользователя в базу данных
https://www.youtube.com/watch?v=b7nc7X0-t_4





Иконки качай отсюда
https://www.iconfinder.com/icon-sets/newest
 */