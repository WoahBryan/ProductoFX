module com.mycompany.productofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.productofx to javafx.fxml;
    exports com.mycompany.productofx;
}
