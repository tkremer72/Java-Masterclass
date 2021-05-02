//class Movie {
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//    public String plot() {
//        return "No plot here!";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//    public String plot() {
//        return "A giant shark attacks the beach goers of Amityville";
//    }
//}
//class IndependenceDay extends Movie {
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//    @Override
//    public String plot() {
//        return "Aliens try to destroy the world, Will Smith saves the day!";
//    }
//}
//class MazeRunner extends Movie {
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Kids try and escape a maze!";
//    }
//}
//class StarWars extends Movie {
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial forces try to take over the universe!";
//    }
//}
//class Forgetable extends Movie {
//    public Forgetable() {
//        super("Forgetable");
//    }
//    //No plot method
//}
class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine() {
        return "Car -> startEngine()";
    };
    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake()";
    }
}
class Mustang extends Car {
    public Mustang(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mustang -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mustang -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mustang -> brake()";
    }
}
class Porsche extends Car {
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";

    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}
class Chevy extends Car {
    public Chevy(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Chevy -> startEngine()";

    }

    @Override
    public String accelerate() {
        return "Chevy -> accelerate()";
    }

    @Override
    public String brake() {
        return "Chevy -> brake()";
    }
}
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
public class Main {
    public static void main(String[] args) {
//    for(int i = 1; i < 11; i++) {
//        Movie movie = randomMovie();
//        System.out.println("Movie # " + i +
//                " : " + movie.getName() + "\n" +
//                "Plot: " + movie.plot() + "\n");
//    }
    Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("****************************");
        Porsche porsche = new Porsche(8, "911");
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());
        System.out.println("*****************************");
        Mustang mustang = new Mustang(8, "5.0");
        System.out.println(mustang.startEngine());
        System.out.println(mustang.accelerate());
        System.out.println(mustang.brake());
        System.out.println("*****************************");
        Chevy chevy = new Chevy(8, "5.0");
        System.out.println(chevy.startEngine());
        System.out.println(chevy.accelerate());
        System.out.println(chevy.brake());
        System.out.println("*****************************");
        Ford ford = new Ford(8, "Escort");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }

//    public static Movie randomMovie() {
//        int randomNumber = (int)(Math.random() * 5) + 1;
//        System.out.println("Random number generated was: " + randomNumber);
//        switch(randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new Forgetable();
//        }
//        return null;
//    }



}
