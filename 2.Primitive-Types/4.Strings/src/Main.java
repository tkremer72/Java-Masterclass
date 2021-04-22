public class Main {

    public static void main(String[] args) {
        //Below are the 8 primitive types in Java
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string!";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more added to myString.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
        //Appending values like above in Java is ineffecient and will learn a better way moving foward.
    }
}
