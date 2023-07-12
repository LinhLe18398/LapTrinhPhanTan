module com.example.ungdungchuyendoitiente {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ungdungchuyendoitiente to javafx.fxml;
    exports com.example.ungdungchuyendoitiente;
}