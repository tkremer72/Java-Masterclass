//The word public refers to the type of access available for the class

public class Car {//statement to create a new class named car
    //Creating the state or characteristic components for the class car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {//this method is a setter
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;//updates the model variable with the contents of the parameter model
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {//this method is a getter
        return this.model;
    }
}
