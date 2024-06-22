module project360 {
    requires javafx.controls;
    requires javafx.fxml;

    opens project360 to javafx.fxml;
    exports project360;
}
