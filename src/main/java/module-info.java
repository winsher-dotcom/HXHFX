module com.example.hxhjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.base;
    requires javafx.graphics;

    opens com.example.hxhjavafx to javafx.fxml;
    exports com.example.hxhjavafx;
}