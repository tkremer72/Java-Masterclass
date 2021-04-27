public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 2) {//If the number is less than 2 it is invalid
            return -1;
        } else {
            for(int i = 2; i < number; i++) {
                if((number % i) == 0) {
                    number /= i;
                    i--;
                }
            }
            return number;
        }
    }
}
