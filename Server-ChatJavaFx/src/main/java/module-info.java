module com.example.serverchatjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.serverchatjavafx to javafx.fxml;
    exports com.example.serverchatjavafx;
}