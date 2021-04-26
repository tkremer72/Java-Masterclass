public class Main {
    public static void main(String[] args) {
        System.out.println("Has the same last digit = " + LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println("Is a valid number = " + LastDigitChecker.isValid(10));
        System.out.println("Has the same last digit = " + LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println("Is a valid number = " + LastDigitChecker.isValid(468));
        System.out.println("Has the same last digit = " + LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println("Is a valid number = " + LastDigitChecker.isValid(1051));
    }
}
