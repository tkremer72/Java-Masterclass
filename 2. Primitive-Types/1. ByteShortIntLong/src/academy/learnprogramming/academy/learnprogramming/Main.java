package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Int data type
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;

        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);

        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));// Creates an overflow

        System.out.println("Busted MIN value = " + (myMinIntValue - 1));// Creates an underflow

        int myMaxIntTest = 2147483647;

        System.out.println(myMaxIntTest - myValue);

        // Byte data type
        byte myMinByteValue = Byte.MIN_VALUE;

        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value =" + myMinByteValue);

        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        // Short data type

        short myMinShortValue = Short.MIN_VALUE;

        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value =" + myMinShortValue);

        System.out.println("Short Maximum Value =" + myMaxShortValue);

        // Long data type
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;

        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value =" + myMinLongValue);

        System.out.println("Long Maximum Value =" + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_876L;
        System.out.println("My Big Long Literal Value = " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        System.out.println("My big short literal value =" + bigShortLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);//using casting 
        System.out.println("My Total =" + myTotal);
        System.out.println("My new byte value =" + myNewByteValue);

        short myNewShortValue = (short)(myMinShortValue/2);
        System.out.println("My new short value =" + myNewShortValue);
    }
}
