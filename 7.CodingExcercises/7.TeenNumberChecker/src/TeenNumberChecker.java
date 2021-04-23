public class TeenNumberChecker {

    public static boolean hasTeen(int numberOne, int numberTwo, int numberThree) {
        return isTeen(numberOne) || isTeen(numberTwo) || isTeen(numberThree);
    }
    public static boolean isTeen(int number) {
        return (number >= 13 && number <=19);
    }
}
