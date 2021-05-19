package com.webtek.java.master_class._css;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridPane;
    @FXML
    private WebView webView;

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
//        FileChooser chooser = new FileChooser();
//        File file = chooser.showOpenDialog(gridPane.getScene().getWindow());//This keeps the user from interacting with anything but the file picker
//        if(file != null) {
//        System.out.println(file.getPath());
//        } else {
//        System.out.println("Chooser was cancelled.");
//        }
        //Below is the code to allow a user to save a selection from the file chooser.
        //Instead of showOpenDialog, use showSaveDialog.
//        FileChooser chooser = new FileChooser();
//        chooser.setTitle("Save Application File");
//        chooser.getExtensionFilters().addAll(
//                new FileChooser.ExtensionFilter("Text", "*.txt"),//ensures users can only select files of a certain type
//                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
//                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.jpeg", "*.png", "*.gif"), //you can include multiple extensions for the same file type
//                new FileChooser.ExtensionFilter("All Files", "*.*") //allows users to select all type of files if needed.
//                //The above filter would be a catch all filter
//        );
//        File file = chooser.showOpenDialog(gridPane.getScene().getWindow());//This keeps the user from interacting with anything but the file picker
//        if (file != null) {//you can also use showOpenMultipleDialog to allow the user to select more than one file
//            System.out.println(file.getPath());
//        } else {
//            System.out.println("Chooser was cancelled.");
//        }

//Code below allows the user to select multiple files
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text", "*.txt"),//ensures users can only select files of a certain type
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.jpeg", "*.png", "*.gif"), //you can include multiple extensions for the same file type
                new FileChooser.ExtensionFilter("All Files", "*.*") //allows users to select all type of files if needed.
                //The above filter would be a catch all filter
        );
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());//This keeps the user from interacting with anything but the file picker
        if (file != null) {//you can also use showOpenMultipleDialog to allow the user to select more than one file
            for (int i = 0; i < file.size(); i++) {
                System.out.println(file.get(i));
            }
//            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled.");
        }

//        DirectoryChooser chooser = new DirectoryChooser();
//        File file = chooser.showDialog(gridPane.getScene().getWindow());//When using the directoryChooser, use showDialog instead of showOpenDialog
//        if(file != null){
//            System.out.println(file.getPath());
//        } else {
//            System.out.println("Chooser was cancelled.");
//        }
    }

    //What happens when user clicks our hyperlink
    @FXML
    public void handleLinkClick() {
//        try {
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        } catch(IOException e) {
//            e.printStackTrace();
//        } catch(URISyntaxException e) {
//            e.printStackTrace();
//        }
        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
    }


}
