module org.example.atmjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.atmjavafx to javafx.fxml;
    exports org.example.atmjavafx;
}