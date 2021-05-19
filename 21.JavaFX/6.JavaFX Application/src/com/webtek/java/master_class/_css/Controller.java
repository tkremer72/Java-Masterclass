package com.webtek.java.master_class._css;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridPane;

    //Initialize the UI
    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    //Increase the label on mouse hover
    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }

    //Reduce label size on mouse hover
    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }

    //Select a file on button click
    @FXML
    public void handleClick() {
        //FileChooser chooser = new FileChooser();
        //File file = chooser.showOpenDialog(gridPane.getScene().getWindow());//This keeps the user from interacting with anything but the file picker
        //if(file != null) {
        //System.out.println(file.getPath());
        //} else {
        //System.out.println("Chooser was cancelled.");
        //}

        
        DirectoryChooser chooser = new DirectoryChooser();
        File file = chooser.showDialog(gridPane.getScene().getWindow());//When using the directoryChooser, use showDialog instead of showOpenDialog
        if(file != null){
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled.");
        }
    }
}
