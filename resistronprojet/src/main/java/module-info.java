module com.example.resistronprojet {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resistronprojet to javafx.fxml;
    exports com.example.resistronprojet;
}