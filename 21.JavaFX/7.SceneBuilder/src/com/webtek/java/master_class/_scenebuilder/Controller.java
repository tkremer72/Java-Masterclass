package com.webtek.java.master_class._scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label;

    @FXML
    public void handleAction() {
        label.setText("Ok Button Pressed!");
    }

}
