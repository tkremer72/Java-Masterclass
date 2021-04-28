public class Main {
    public static void main(String[] args) {
        //Create an object for this class which takes the car blueprint
        // and creates an object for use.
        Car porsche = new Car(); //This line creates an object porsche and initializes it.
        Car holden = new Car();

        porsche.setModel("Carrera");//Setting the model

        System.out.println("Porsche " + porsche.getModel());//Getting the model

    }
}
