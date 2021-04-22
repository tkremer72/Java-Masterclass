public class Main {

    public static void main(String[] args) {
        //D in unicode represents 0044;
        char myChar = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println("My character = " + myChar);
        System.out.println("My Unicode Character = " + myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println("My copyright Char = " + myCopyrightChar);
        //Boolean

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println("True boolean value = " + myTrueBooleanValue);
        System.out.println("False boolean value = " + myFalseBooleanValue);

        boolean isCustomerOverTwentyOne = true;
        System.out.println("Is customer over 21 = " + isCustomerOverTwentyOne);
    }
}
