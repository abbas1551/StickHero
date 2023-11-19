module com.example.stilltesing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stilltesing to javafx.fxml;
    exports com.example.stilltesing;
}