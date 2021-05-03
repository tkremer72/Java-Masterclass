import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {//Method to store and print the values entered in by user
        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {//method to get values entered by user five times
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {//method to get the average of stored numbers entered by user
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
