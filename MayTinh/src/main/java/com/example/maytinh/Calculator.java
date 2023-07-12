package com.example.maytinh;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Calculator {
    @FXML
    TextField firstNum;

    @FXML
    TextField secondNum;

    @FXML
    public void add(ActionEvent actionEvent) {
        double firstNumber = Double.parseDouble(this.firstNum.getText());
        double secondNumber = Double.parseDouble(this.secondNum.getText());
        double result = firstNumber + secondNumber;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: " + result);
        alert.show();
    }

    @FXML
    public void sub(ActionEvent actionEvent) {
        double firstNumber = Double.parseDouble(this.firstNum.getText());
        double secondNumber = Double.parseDouble(this.secondNum.getText());
        double result = firstNumber - secondNumber;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: " + result);
        alert.show();

    }

    @FXML
    public void mul(ActionEvent actionEvent) {
        double firstNumber = Double.parseDouble(this.firstNum.getText());
        double secondNumber = Double.parseDouble(this.secondNum.getText());
        double result = firstNumber * secondNumber;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: " + result);
        alert.show();
    }

    @FXML
    public void div(ActionEvent actionEvent) {
        double firstNumber = Double.parseDouble(this.firstNum.getText());
        double secondNumber = Double.parseDouble(this.secondNum.getText());
        double result = firstNumber / secondNumber;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Kết quả là: " + result);
        alert.show();
    }
}
