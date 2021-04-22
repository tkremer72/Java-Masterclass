

public class Main {

public static void main(String[] args) {
    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;

    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);

    //Below is an example of an overflow
    System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
    //Below is an example of an underflow
    System.out.println("Busted Min Value = " + (myMinIntValue - 1));
    //Below is a literal integer value maximum, if you try to add one or more it creates an error
    int myMaxIntTest = 2147483647;
    System.out.println(myMaxIntTest);

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);

    //Below is a declaration for a long variable
    long myLongValue = 100L;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Maximum Value = " + myMaxLongValue);
    //Below without the l at the end of the declaration,
    // java treats this as integer and throws an error
    long bigLongLiteralValue = 2147483647234l;
    System.out.println("My big long literal value = " + bigLongLiteralValue);
    //Maximum short value
    short bigShortLiteralValue = 32767;
    System.out.println("My big short literal value = " + bigShortLiteralValue);

    //Arithmetic with primitive data types.

    int myTotal = (myMinIntValue / 2);
    System.out.println("My Total = " + myTotal);
    //Below uses casting to tell java that the code will work
    byte myNewByteValue = (byte)(myMinByteValue / 2);
    short myNewShortValue = (short)(myMinShortValue / 2);
    System.out.println("My new min byte value = " + myNewByteValue);
    System.out.println("My new min short value = " + myNewShortValue);

    



}
}
