public class Vehicle {
    //create fields specific to all vehicles
    private String name;
    private String size;

    //Create two more fields
    private int currentVelocity;
    private int currentDirection;

//constructor to initialize those fields
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    //method to control steering
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }
    //method to move
    public void move(int velocity, int direction) {//setting velocity and direction to specific number
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    //create getters for all fields.
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop() {
        this.currentVelocity = 0;
    }
}
