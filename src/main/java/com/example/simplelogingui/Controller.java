package com.example.simplelogingui;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void validateLogin() {
        String enteredUser = usernameField.getText();
        String enteredPassword = passwordField.getText();

        if (enteredUser.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
            System.out.println("LOGIN SUCCESSFULL!");
        } else {
            System.out.println("LOGIN FAILED...");
        }
    }
}
