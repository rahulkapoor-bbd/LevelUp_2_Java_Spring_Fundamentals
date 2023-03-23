module com.highschool {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.highschool to javafx.fxml;
    exports com.highschool;
}
