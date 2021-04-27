import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner is a build in Java class

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();//checks the input to see if it is an int, if it qualifies it is true if not it is false.
        if(hasNextInt) {//code below only executes if hasNextInt comes to true
            int yearOfBirth = scanner.nextInt();//auto converts what is typed into an integer
            scanner.nextLine();//When entering numeric values, you must call scanner.nextLine()

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();//Reading a line of input from the console
            int age = 2021 - yearOfBirth;
            if(age >= 0 && age <= 100) {// if age is within range, print below
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth!");
            }
        } else {
            System.out.println("Unable to parse year of birth!");
        }
        scanner.close();
    }
}
