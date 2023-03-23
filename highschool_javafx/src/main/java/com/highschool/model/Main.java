package com.highschool.model;

import java.util.Optional;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
          
        LoginDialog loginDialog = new LoginDialog();
        loginDialog.showAndWait();

        // Close the JavaFX application
        primaryStage.close();
    }
}
