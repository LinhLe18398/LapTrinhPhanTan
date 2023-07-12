package com.example.cauhoikhaosat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Question extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Câu hỏi khảo sát");
        Label label = new Label("Màu sắc yêu thích của bạn là gì");
        RadioButton redRadioButton = new RadioButton("Red");
        RadioButton blueRadioButton = new RadioButton("Blue");
        RadioButton yellowRadioButton = new RadioButton("Yellow");
        Button button = new Button("Submit");

        // tạo đối tượng chỉ cho phép chọn 1 đáp án
        ToggleGroup toggleGroup = new ToggleGroup();
        redRadioButton.setToggleGroup(toggleGroup);
        blueRadioButton.setToggleGroup(toggleGroup);
        yellowRadioButton.setToggleGroup(toggleGroup);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, redRadioButton, blueRadioButton, yellowRadioButton, button);

        button.setOnAction(actionEvent -> {
            try {
                File file = new File("data.txt");
                FileWriter fileWriter = new FileWriter(file);
                RadioButton selected = (RadioButton) toggleGroup.getSelectedToggle();
                System.out.println(selected.getText());
                fileWriter.write(selected.getText());
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        Scene scene = new Scene(vBox, 500, 400);
        stage.setScene(scene);
        stage.show();

    }
}
