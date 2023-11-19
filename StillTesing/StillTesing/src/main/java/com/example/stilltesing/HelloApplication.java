package com.example.stilltesing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game.fxml"));

        Scene welcome = new Scene(fxmlLoader.load(), 420, 800);
        stage.setTitle("Hello!");
        stage.setScene(welcome);// yeah I can edit this
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

