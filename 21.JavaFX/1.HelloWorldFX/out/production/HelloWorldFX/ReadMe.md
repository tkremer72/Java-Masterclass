# JavaFx 
add a module-info.java file and include the following code
module HelloWorldFX {
requires javafx.fxml;
requires javafx.controls;

    opens package name;
}