package com.example.quanlidiemso;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class LayoutTable implements Initializable {
    public Student[] students = {
            new Student("001", "Nguyễn Phú Hưng", "K18", "Nam", "SmartCity", "8"),
            new Student("002", "Nguyễn Cao Thắng", "K18", "Nam", "Định Công", "7"),
            new Student("003", "Lê Ngọc Linh", "K17", "Nam", "Timescity", "10")
    };
    @FXML
    private TableView<Student> tableView;
    @FXML
    private TableColumn<Student, String> id;
    @FXML
    private TableColumn<Student, String> name;
    @FXML
    private TableColumn<Student, String> clasS;
    @FXML
    private TableColumn<Student, String> gender;
    @FXML
    private TableColumn<Student, String> address;
    @FXML
    private TableColumn<Student, String> score;

    protected ObservableList<Student> listStudent = FXCollections.observableArrayList(students);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<Student,String>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
        clasS.setCellValueFactory(new PropertyValueFactory<Student,String>("clasS"));
        gender.setCellValueFactory(new PropertyValueFactory<Student,String>("gender"));
        address.setCellValueFactory(new PropertyValueFactory<Student,String>("address"));
        score.setCellValueFactory(new PropertyValueFactory<Student,String>("score"));
        tableView.setItems(listStudent);

    }

    @FXML private TextField idTf;
    @FXML private TextField nameTf;
    @FXML private TextField classTf;
    @FXML private TextField genderTf;
    @FXML private TextField addressTf;
    @FXML private TextField scoreTf;

    public void add() {
        Student student = new Student();
        student.setId(idTf.getText());
        student.setName(nameTf.getText());
        student.setClasS(classTf.getText());
        student.setGender(genderTf.getText());
        student.setAddress(addressTf.getText());
        student.setScore(scoreTf.getText());
        listStudent.add(student);
    }

    public void remove(ActionEvent actionEvent) {
        Student selected = tableView.getSelectionModel().getSelectedItem();
        listStudent.remove(selected);
    }
}
