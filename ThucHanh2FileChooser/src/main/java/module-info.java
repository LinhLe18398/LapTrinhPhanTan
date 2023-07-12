module com.example.thuchanh2filechooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.thuchanh2filechooser to javafx.fxml;
    exports com.example.thuchanh2filechooser;
}