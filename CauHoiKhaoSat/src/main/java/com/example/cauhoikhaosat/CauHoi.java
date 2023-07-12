package com.example.cauhoikhaosat;

import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class CauHoi {
    public String question;

    public CauTraLoi answerA;
    public CauTraLoi answerB;
    public CauTraLoi answerC;
    public CauTraLoi answerD;
    public CauTraLoi rightAnswer;
    public ToggleGroup userAnswer;

    public CauHoi(String question, CauTraLoi answerA, CauTraLoi answerB, CauTraLoi answerC, CauTraLoi answerD, CauTraLoi rightAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.rightAnswer = rightAnswer;
    }

    public boolean isRightAnswer(){
        RadioButton selected = (RadioButton) this.userAnswer.getSelectedToggle();
        return selected.getText().equals(rightAnswer.content);
    }
}
