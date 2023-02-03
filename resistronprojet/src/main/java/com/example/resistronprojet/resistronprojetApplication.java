package com.example.resistronprojet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class resistronprojetApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resistronp.fxml"));
        Stage stage = loader.load();
        stage.show();
    }
    static int value1;
    static int value2;
    static double value3 = 1;
    static double value4;
}

