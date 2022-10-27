package hu.petrik.helloword;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label koszontoSzoveg;
    @FXML
    private TextField nevMezo;

    @FXML
    protected void koszontes(ActionEvent actionEvent) {
            String nev = nevMezo.getText().trim();

        if (nev.isEmpty()) {
            Alert felugroAblak = new Alert(Alert.AlertType.WARNING);
            felugroAblak.setContentText("Kérem adja meg a nevét!");
            felugroAblak.showAndWait()  ;
            koszontoSzoveg.setText("");
        } else {
            koszontoSzoveg.setText("Hello " + nev + "!");
        }
    }
}