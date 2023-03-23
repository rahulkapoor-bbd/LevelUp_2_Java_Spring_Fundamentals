package com.highschool.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.highschool.App;

import javafx.scene.control.*;


public class LoginController {
    private List<Person> persons = new ArrayList<>();

    //read persons username & pin from textFile / database

    //LOGIN METHOD
    public void login(String username, String password) throws IOException {
        Person person = null;
        for (Person p : persons) {

            if (p.getUsername().equals(username) && p.getPassword().equals(password)) 
            {
                person = p;
                break;
            }
        }
        if (person == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Invalid username, password, or role.");
            alert.showAndWait();
        } 
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Login successful.");
            alert.showAndWait();

            App.setRoot("primary");
        }
    }
}
