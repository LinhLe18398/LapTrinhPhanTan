module com.example.maytinh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maytinh to javafx.fxml;
    exports com.example.maytinh;
}