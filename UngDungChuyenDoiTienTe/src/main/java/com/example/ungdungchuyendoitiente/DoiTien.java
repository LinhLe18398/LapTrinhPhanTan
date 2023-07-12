package com.example.ungdungchuyendoitiente;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class DoiTien {
    @FXML
    TextField money;
    @FXML
    public void convert(ActionEvent actionEvent) {
     int money = Integer.parseInt(this.money.getText());
     int change = money * 23000;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Tien sau khi chuyen doi la: " + change + "VND");
        alert.show();
    }
}
