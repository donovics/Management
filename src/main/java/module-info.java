module org.management.management {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens org.management to javafx.fxml;
    exports org.management;
    exports org.management.controllers;
    opens org.management.controllers to javafx.fxml;
}