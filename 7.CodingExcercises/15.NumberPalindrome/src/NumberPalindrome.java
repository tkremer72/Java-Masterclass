public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int storedNumber = number;
        while(storedNumber > 0) {
            //extract the least-significant
            int digit = storedNumber % 10;
            reverse = (reverse * 10) + digit;
            //drop least-significant
            storedNumber /= 10;
        }
        if(number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
