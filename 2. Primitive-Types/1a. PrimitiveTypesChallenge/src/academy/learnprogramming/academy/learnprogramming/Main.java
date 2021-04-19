


package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;//Create a byte variable and set it to any valid byte value
        short shortValue = 20;//Create a short variable and set it to any valid short value
        int intValue = 50;//Create an integer and set it to any valid integer value

        /* Create a long variable and set it to 50000 plus ten times the sum of 
        the byte plus the short plus the integer */

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("The new total for the long is = " + longTotal);

        short shortTotal = (short) (1000 + 10 *//here we need to cast because there are two types
                (byteValue + shortValue + intValue));

        System.out.println("The new total for this challenge = " + shortTotal);
    }
}
