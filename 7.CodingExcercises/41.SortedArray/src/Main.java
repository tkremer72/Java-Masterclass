import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] integers = SortedArray.getIntegers(5);
        int[] sorted = SortedArray.sortIntegers(integers);
        SortedArray.printArray(sorted);
    }


}
