package com.example.logindemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
    @FXML
    TextField username;
    @FXML
    PasswordField password;

    @FXML
    public void login(ActionEvent actionEvent) {
        String username = this.username.getText();
        String password = this.password.getText();

        if (username.equals("admin") && password.equals("password")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Dang nhap thanh cong");
            alert.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Dang nhap that bai");
            alert.show();
        }
    }
}
