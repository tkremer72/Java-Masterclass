package com.webtek.java.master_class.hello_world_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//Below is manually coding in the fxml options usually used in an fxml file defined in line 15
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        //Add a greeting to the window pane manually
//        Label greeting = new Label("Welcome to JavaFX!");//Create the greeting object
//        greeting.setTextFill(Color.GREEN);//Set the text color to green
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);

        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
