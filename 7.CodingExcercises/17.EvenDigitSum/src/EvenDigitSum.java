public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {//Is number less than zero
            return -1;//if above is true return -1 for invalid value
        }
        int total = 0; //store the total in a variable, initialize value
        while(number > 0) { //as long as the number is greater than 0 zero do work
            if(number % 2 == 0) {//Divide the number by 2 and if the result is zero do the next line
                total += number % 10; //add the number to the total count
            }
            number /= 10; //divide the number by ten
        }
        return total; //return the total value
    }
}
