module com.example.unddungdemtuoi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.unddungdemtuoi to javafx.fxml;
    exports com.example.unddungdemtuoi;
}