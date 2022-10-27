module hu.petrik.helloword {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.helloword to javafx.fxml;
    exports hu.petrik.helloword;
}