package com.example.unddungdemtuoi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class UngDungTinhTuoi {
    @FXML
    TextField year;

    @FXML
    public void calculateAge(ActionEvent actionEvent) {
        int now = 2023;
        int age = now - Integer.parseInt(year.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Tuổi của bạn là: " + age);
        alert.show();

    }
}
