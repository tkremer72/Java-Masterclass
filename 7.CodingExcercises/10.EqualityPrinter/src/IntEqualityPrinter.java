public class IntEqualityPrinter {
    public static void printEqual(int one, int two, int three){
        final String INVALID_MESSAGE = "Invalid Value";

        if(one<0 || two<0 || three<0){
            System.out.println(INVALID_MESSAGE);
        } else if(one == two && two == three && three == one) {
            System.out.println("All numbers are equal");
        } else if(one == two || two == three || three == one){
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
