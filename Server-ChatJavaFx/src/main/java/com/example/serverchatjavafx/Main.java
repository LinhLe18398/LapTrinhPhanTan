package com.example.serverchatjavafx;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.time.temporal.Temporal;
import java.util.ResourceBundle;

public class Main implements Initializable {
    @FXML
    private Button button;
    @FXML
    private TextField text;
    @FXML
    private ScrollPane sp;
    @FXML
    private VBox vbox;

    private Server server;
    private int serverPort = 8080;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            server = new Server(new ServerSocket(serverPort));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        vbox.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                sp.setVvalue((Double) t1);
            }
        });

        server.receiveMessageFromClient(vbox);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String messageToClient = text.getText();
                if (! messageToClient.isEmpty()){
                    HBox hBox = new HBox();
                    hBox.setAlignment(Pos.CENTER_RIGHT);
                    hBox.setPadding(new Insets(5,5,5,10));
                    Text text1 = new Text(messageToClient);
                    TextFlow textFlow = new TextFlow(text1);
                    textFlow.setStyle("-fx-color: rgb(239,242,255); -fx-background-color: rgb(15,125,242); -fx-background-radius: 20px");
                    textFlow.setPadding(new Insets(5,10,5,10));
                    text1.setFill(Color.color(0.936,0.945,0.996));
                    hBox.getChildren().add(textFlow);
                    vbox.getChildren().add(hBox);
                    server.sendMessageToClient(messageToClient);
                    text.clear();
                }
            }
        });

    }
    public void addLabel(String message, VBox vbox){
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_LEFT);
        hBox.setPadding(new Insets(5,5,5,10));
        Text text1 = new Text(message);
        TextFlow textFlow = new TextFlow(text1);
        textFlow.setStyle("-fx-background-color: rgb(233,233,235); -fx-background-radius: 20px");
        textFlow.setPadding(new Insets(5,10,5,10));
        hBox.getChildren().add(textFlow);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                vbox.getChildren().add(hBox);
            }
        });
    }

}
