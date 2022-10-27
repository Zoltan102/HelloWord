package hu.petrik.emreklista;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class EmberekController {
    @FXML
    private ListView<Ember> emberek;

    @FXML
    private void initialize() {
        Ember e1 = new Ember("Gipsz Jakab", 25);
        Ember e2 = new Ember("Teszr Elek", 52);
        Ember e3 = new Ember("Lakatos Brandon Károly", 11);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }
}