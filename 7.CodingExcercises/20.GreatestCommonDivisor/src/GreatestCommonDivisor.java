public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstDenominator, int secondDenominator) {
        if(firstDenominator < 10 || secondDenominator < 10) {
            return -1;
        }
        while(secondDenominator != 0) {
            if(firstDenominator > secondDenominator) {
                firstDenominator -= secondDenominator;
            } else {
                secondDenominator -= firstDenominator;
            }
        }
        return firstDenominator;
    }
}
