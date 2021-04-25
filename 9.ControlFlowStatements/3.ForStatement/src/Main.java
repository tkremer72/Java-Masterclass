public class Main {
    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = "
//                + calculateInterest(10000, 2.0));
        //One way to loop is below
//        System.out.println("10,000 at 3% interest = "
//                + calculateInterest(10000, 3.0));
//        System.out.println("10,000 at 4% interest = "
//                + calculateInterest(10000, 4.0));
//        System.out.println("10,000 at 5% interest = "
//                + calculateInterest(10000, 5.0));

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }
        //For loop challenge
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i
                    + "% interest = " +//below converts the number with only 2 decimal places
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }
        //Challenge 2 go backwards
        System.out.println("Separation message!");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i
                    + "% interest = " +//below converts the number with only 2 decimal places
                    String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("************************************************");
        //Challenge three
        int count = 0;
        for(int i = 1; i < 100; i++) {

            if(isPrime(i)) {
               count++;
               System.out.println("Number " + i + " is a prime number!");
               if(count == 10) {
                   System.out.println("Exiting the loop!");
                   break;
               } else {
               }
           }
        }
    }

  public static boolean isPrime(int n) {
        if(n == 1){
            return false;
        } else {
            //for(int i = 2; i <= n/2; i++) {//below optimizes this line and uses the square root method
            //The above for loop takes longer than the below one.
            for(int i = 2; i <= (long)Math.sqrt(n); i++) {//This version is better.
                System.out.println("Looping through numbers " +i);
                if(n % i == 0) {
                    return false;
                }
            }
        }
        return true;
  }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
