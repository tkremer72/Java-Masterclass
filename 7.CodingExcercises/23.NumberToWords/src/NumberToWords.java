public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0)//if the number is less than zero print invalid value
            System.out.print("Invalid Value");

        int count = getDigitCount(number); //store the digit in the count variable/initialize the count variable

        number = reverse(number);//set the value of number to the reverse value of the number

        for(int i = 0; i < count; i++) {
            int digit = number % 10;
            switch(digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            number /= 10;
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        int digit = 0;
        while(number != 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if(number < 0)
            return -1;

        int count = 0;

        do{
            count++;
            number /= 10;
        }
        while(number > 0);

        return count;
        }
    }

