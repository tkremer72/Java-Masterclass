public class Main {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            //Check if number is divisible by 3 and 5
            if((i % 3 == 0) && (i % 5 == 0)) {
                //if condition above is true increase the count and increase the sum
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if(count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }

}
