public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int properDivisorsSum = 0;

        for(int i = 1; i < number; i++) {
            if(number % i == 0)
                properDivisorsSum += i;
        }
        return properDivisorsSum == number && number > 1;
    }
}
