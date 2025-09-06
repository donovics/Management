package org.management.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeController {
    @FXML
    private Label welcomeText;
    @FXML
    private javafx.scene.control.Button exitButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onSingInButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onExitButtonClick() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}