module hu.petrik.helloword {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.emreklista to javafx.fxml;
    exports hu.petrik.emreklista;
}