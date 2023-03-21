module com.highschool {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.highschool to javafx.fxml;
    exports com.highschool;
}
