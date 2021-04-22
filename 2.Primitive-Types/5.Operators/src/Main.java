public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult + " + previousResult);
        result = result - 1; // 3 - 1 = 2;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult + " + previousResult);

        result = result * 10;// 2 * 10 = 20;
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1;
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++; //1 + 1 = 2;
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1;
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2;// 1 + 2 = 3;
        System.out.println("1 + 2 = " + result);
        //result = result * 10;
        result *= 10; //3 * 10 = 30;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;//30 / 3 = 10;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; //10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        //Below uses if then to check for conditional logic

        boolean isAlien = false;
        if(isAlien == false) {//A semi colon here would terminate this conditional check
            //the two equal signs here is checking to
            // see if the condition is identical or equal to each other
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens!");
            //By wrapping the code in curly braces we create a code block and both lines
            //51 and 52 will execute instead of only line 51
        }
        int topScore = 80;
        if(topScore < 100) {
        System.out.println("You have the top score!");
        }

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100)) {
            //The extra parenthesis makes the code easier to read
            //Performing two conditional checks with the logical
            //and operator, both conditions must be true
            System.out.println("Greater than second top score and less than 100!");
        }
        //Below uses the logical or || operator which only requires one or the other
        // condition to be true
        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }
        //Challenge
        int newValue = 50;
        if(newValue == 50) {
            //Using only one equal sign here will throw an error because the single is an
            //assignment operator and we need to use the equal to sign ==
            System.out.println("This is not an error but is true!");
        }

        boolean isCar = false;
        if(isCar) {//The ! is the logical complement operator
            System.out.println("This is not supposed to happen!");
        }
        //Ternary operator
        isCar = true;
        boolean wasCar = isCar ? true : false;

        if(wasCar) {
            System.out.println("wasCar is true");
        }


    }
}
