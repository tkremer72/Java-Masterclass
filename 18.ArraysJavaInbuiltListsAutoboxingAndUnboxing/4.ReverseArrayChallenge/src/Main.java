import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] array = { 1, 5, 3, 7, 11, 9, 15};//create an array
        System.out.println("Array = " + Arrays.toString(array));//pring out the array

        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];//Save i temporarily in temp
            array[i] = array[maxIndex - i];//swap the element 0 with the last element
            array[maxIndex - i] = temp; //swap the last element with the temp
        }
    }

}
