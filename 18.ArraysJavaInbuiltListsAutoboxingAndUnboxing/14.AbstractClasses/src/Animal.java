
public abstract class  Animal {

    //Create a field
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breath();

    public String getName() {
        return name;
    }
}
