module com.example.pmac1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pmac1 to javafx.fxml;
    exports com.example.pmac1;
}