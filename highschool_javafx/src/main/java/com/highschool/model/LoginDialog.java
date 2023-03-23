package com.highschool.model;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;


public class LoginDialog extends Dialog<LoginResult> 
{
    private TextField usernameField;
    private PasswordField passwordField;

    public LoginDialog() throws IOException 
    {
        // Set the dialog title and header text
        setTitle("Login");
        setHeaderText("Please enter your login credentials:");

        // Create the username field
        usernameField = new TextField();
        usernameField.setPromptText("Username");

        // Create the password field
        passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        // Add the form fields to the dialog pane
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 150, 10, 10));
        grid.add(new Label("Username:"), 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(passwordField, 1, 1);
        getDialogPane().setContent(grid);


        LoginController lgc = new LoginController();

        lgc.login(usernameField.getText(), passwordField.getText());

        // Set the result converter
          setResultConverter(dialogButton -> {
              if (dialogButton == ButtonType.OK) {
                 return new LoginResult(usernameField.getText(), passwordField.getText());
              }
              return null;
         });

        // Add the OK and cancel buttons
        getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);

        
    }
}
