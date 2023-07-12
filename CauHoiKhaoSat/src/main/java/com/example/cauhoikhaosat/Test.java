package com.example.cauhoikhaosat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {

        CauHoi[] cauHois = new CauHoi[]{
                new CauHoi("1+1=?",
                        new CauTraLoi("9"),
                        new CauTraLoi("2"),
                        new CauTraLoi("3"),
                        new CauTraLoi("6"),
                        new CauTraLoi("2")
                ),
                new CauHoi("1+3=?",
                        new CauTraLoi("4"),
                        new CauTraLoi("1"),
                        new CauTraLoi("3"),
                        new CauTraLoi("6"),
                        new CauTraLoi("4")
                )
        };

        VBox vbox = new VBox();

        for(int i = 0; i < cauHois.length; i++){
            Label question = new Label(cauHois[i].question);
            ToggleGroup toggleGroup = new ToggleGroup();
            RadioButton option1 = new RadioButton(cauHois[i].answerA.content);
            option1.setToggleGroup(toggleGroup);
            RadioButton option2 = new RadioButton(cauHois[i].answerB.content);
            option2.setToggleGroup(toggleGroup);
            RadioButton option3 = new RadioButton(cauHois[i].answerC.content);
            option3.setToggleGroup(toggleGroup);
            RadioButton option4 = new RadioButton(cauHois[i].answerD.content);
            option4.setToggleGroup(toggleGroup);
            cauHois[i].userAnswer = toggleGroup;
            vbox.getChildren().addAll(question, option1, option2, option3, option4);
        }


        Button submitButton = new Button("Nộp bài");
        vbox.getChildren().add(submitButton);

        submitButton.setOnAction(actionEvent -> {
            int point = 0;
            for(int i = 0; i < cauHois.length; i++){
                if(cauHois[i].isRightAnswer()){
                    point++;
                }
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(point + "");
            alert.show();
        });
        Scene scene = new Scene(vbox, 800, 700);
        stage.setScene(scene);
        stage.show();
    }
}
