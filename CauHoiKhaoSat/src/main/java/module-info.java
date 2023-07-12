module com.example.cauhoikhaosat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cauhoikhaosat to javafx.fxml;
    exports com.example.cauhoikhaosat;
}