package org.management.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.BufferedReader;
import java.io.FileReader;

public class SingInController {
    @FXML
    private Label singInText;
    @FXML
    private VBox vBox;
    @FXML
    private TextField userName;
    @FXML
    private TextField password;

    @FXML
    protected void onSingInButtonClick() throws Exception{
        FileReader fileReader = new FileReader("C:/repos/Management/src/main/resources/Users.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        boolean found = false;
        String line;
        while((line = bufferedReader.readLine()) != null){
            if (line.split(" ")[0].equals(userName.getText())) {
                found = true;
                if (line.split(" ")[1].equals(password.getText())){
                    singInText.setText("Sikeres belépés!");
                }
                else{
                    singInText.setText("Hibás Jelszó");
                }
            }
        }
        if (!found){
            singInText.setText("Nincs ilyen felhasználó név");
        }
        bufferedReader.close();
        fileReader.close();
    }
    @FXML
    protected void onHomeButtonClick() throws Exception {
        Parent newContent = FXMLLoader.load(getClass().getResource("/org/management/homeView.fxml"));
        vBox.getChildren().setAll(newContent);
    }

}
