public class LastDigitChecker {
    public static boolean isValid(int number) {
        return(number > 9) && (number < 1001);//returns a number in the range of 10 - 1000
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {
        if(isValid(one) && isValid(two) && isValid(three)) {//Check to see if two of the numbers are valid
            one %= 10;//Use the modular operator to see if the numbers have remainders
            two %= 10;
            three %= 10;
            return (one == two) || (one == three) || (two == three);//only return the true if there is a match
        }
        return false;//otherwise return false.
    }
}
