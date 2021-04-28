import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        double sum = 0;
        double average = 0;
        int count = 0;

        while(true) {
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
        }
        scanner.nextLine();
        average = (sum/count);
        System.out.println("SUM = "+ Math.round(sum) +" AVG = "+ Math.round(average) );
        scanner.close();
    }
}

