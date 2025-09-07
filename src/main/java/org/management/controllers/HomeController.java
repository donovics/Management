package org.management.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class HomeController {
    @FXML
    private Label welcomeText;
    @FXML
    private VBox vBox;
    @FXML
    private javafx.scene.control.Button exitButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    /*@FXML
    protected void onSingInButtonClick() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/management/singInView.fxml"));
        Stage stage = (Stage) singInButton.getScene().getWindow();
        stage.setScene(new Scene(root, 600, 600));
        stage.show();
    }*/
    @FXML
    protected void onSingInButtonClick() throws Exception {
        Parent newContent = FXMLLoader.load(getClass().getResource("/org/management/singInView.fxml"));
        vBox.getChildren().setAll(newContent);
    }
    @FXML
    protected void onExitButtonClick() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}