package com.example.pmac1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloController {

    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField verifyPasswordField;
    @FXML
    private Label messageLabel;

    @FXML
    protected void onSignUpButtonClick() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String password = passwordField.getText();
        String verifyPassword = verifyPasswordField.getText();

        if (isFormValid(name, email, password, verifyPassword)) {
            messageLabel.setText("Signup successful!");
        }
    }

    // Validation functions
    public boolean isFormValid(String name, String email, String password, String verifyPassword) {
        if (name.isEmpty()) {
            messageLabel.setText("Name cannot be empty.");
            return false;
        }
        if (!isValidEmail(email)) {
            messageLabel.setText("Invalid email format.");
            return false;
        }
        if (!isValidPassword(password)) {
            messageLabel.setText("Password must be at least 8 characters long.");
            return false;
        }
        if (!password.equals(verifyPassword)) {
            messageLabel.setText("Passwords do not match.");
            return false;
        }
        return true;
    }

    public boolean isValidEmail(String email) {
        // Regular expression to check if the email is in a valid format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isValidPassword(String password) {
        // Password must be at least 8 characters long
        return password.length() >= 8;
    }

    // Simple function to validate password for testing manually
    public boolean validatePassword(String password) {
        return password.length() >= 8;
    }
}
