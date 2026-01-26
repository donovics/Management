package org.management.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.management.Application;

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
    @FXML
    protected void onSingInButtonClick() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/org/management/singInView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(scene);
        stage.setFullScreen(true);
    }
    @FXML
    protected void onExitButtonClick() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}