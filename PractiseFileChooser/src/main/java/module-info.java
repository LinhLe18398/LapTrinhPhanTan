module com.example.practisefilechooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practisefilechooser to javafx.fxml;
    exports com.example.practisefilechooser;
}