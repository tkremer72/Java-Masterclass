public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();
        System.out.println("***********************");

        Parrot parrot = new Parrot("Austrailian wingneck");
        parrot.breath();
        parrot.eat();
        parrot.fly();
        System.out.println("***********************");

        Penguin penguin = new Penguin("Emporer");
        penguin.breath();
        penguin.eat();
        penguin.fly();
    }
}
