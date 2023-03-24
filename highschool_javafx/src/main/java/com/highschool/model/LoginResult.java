package com.highschool.model;

import javafx.scene.control.ButtonType;

public class LoginResult {
 Person person = new Person();

    public LoginResult(Person person) {
        this.person = person;
    }
    public LoginResult(String username, String password) {
        person.setUsername(username);
        person.setPassword(password);
    }

    public Person getPerson() {
        return person;
    }
    public String getUsername() {
        return person.getUsername();
    }
    public String getPassword() {
        return person.getPassword();
    }
    public ButtonType getResult() {
        return null;
    }
}

