package com.example.bmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Bmi {
    @FXML
    TextField height;
    @FXML
    TextField weight;
    @FXML
    public void check(ActionEvent actionEvent) {
        double height = Double.parseDouble(this.height.getText());
        double weight = Double.parseDouble(this.weight.getText());
        double bmi = weight/(height * height);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (bmi < 18.5){
            alert.setContentText("gầy");
        } else if (bmi < 24.9) {
            alert.setContentText("Bình thường");
        } else if (bmi < 29) {
            alert.setContentText("thừa cân");
        } else if (bmi < 34.9) {
            alert.setContentText("Béo phì mức 1");
        } else if (bmi >= 35) {
            alert.setContentText("Béo phì mức 2");
        }
        alert.show();
    }
}
