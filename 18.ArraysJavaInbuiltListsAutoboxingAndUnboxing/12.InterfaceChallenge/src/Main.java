import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player thomas = new Player("Thomas", 15, 15);
        System.out.println("Player " + thomas.getName() + " statistics!");
        System.out.println(thomas.toString());//if you don't use toString() Java will assume it automatically
        saveObject(thomas);
        thomas.setHitPoints(28);
        System.out.println(thomas);
        thomas.setWeapon("Battle Axe");
        saveObject(thomas);
        //loadObject(thomas);
        System.out.println(thomas);

        System.out.println("*********************************************");

        //when using the interface you can't access methods directly
        ISaveable werewolf = new Monster("Werewolf", 20, 40);//This line can also be as below
        System.out.println("Monster " + ((Monster)werewolf).getName() + " Statistics!");

        System.out.println("Werewolf strength = " + ((Monster) werewolf).getStrength());//this is casting
        saveObject(werewolf);
        System.out.println(werewolf);

        System.out.println("**********************************************");

        Monster lycan = new Monster("Lycan", 30, 99);
        //When using the monster instance to access the interface you can access methods directly
        System.out.println("Monster " + ((Monster) lycan).getName() + " Statistics!");

        System.out.println("Lycan strength = " + lycan.getStrength());
        saveObject(lycan);
        System.out.println(lycan);

    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    //Method to save an object
    public static void saveObject(ISaveable objectToSave) {//can use this method to save any type of class
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device!");
        }
    }
    //Method to load an object
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
