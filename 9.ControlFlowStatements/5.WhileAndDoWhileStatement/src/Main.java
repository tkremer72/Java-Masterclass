public class Main {
    public static void main(String[] args) {
//        int count = 1;
////        while (count != 6) {//AS long as the count is not equal to six
////            System.out.println("Count value is " + count);
////            count++;
////        }
////        System.out.println("****************************");
//        //Code above using the for loop
////        for (int i = 1; i < 7; i++) {
////            System.out.println("Count value is " + count);
////        }This is wrong, the instructor points this out later
//
//        //Identical to above
////        for(count = 1; count != 6; count++) {
////            System.out.println("Count value is " + count);
////        }
////Another example of a while loop below
//    count = 1;
////    while(true) {
////        if(count == 6) { //As long as the count is equal to six
////            break;
////        }
////        System.out.println("Count value is " + count);
////        count++;
////    }
//        System.out.println("************************");//Do while loop below, always executes once at least
//    do {
//        System.out.println("Count value was " + count);
//        count++;
//        if(count > 100) {
//            break;
//        }
//    } while(count != 6);

        //Challenge
        //Create a method called isEvenNumber that takes a parameter of type int
        //Its purpose is to determine if the argument passed to the method is an
        //even number or not.
        //Return true if an even number, otherwise return false.
//    int number = 4;
//    int finishNumber = 20;
//    while(number <= finishNumber) {
//        number++;
//        if(!isEvenNumber(number)) {
//            continue;//Allows the loop to continue but doesn't process anything beyond if the number isn't even number
//        }
//        System.out.println("Even number " + number);
//    }
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;//Allows the loop to continue but doesn't process anything beyond if the number isn't even number
            }
            System.out.println("Even number " + number);
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("The number of even numbers is " + evenNumbersFound);
    }
    
    public static boolean isEvenNumber(int number) {
        if((number % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
//Modify the while code above
//Make it also record the total number of even numbers that have been found
//and break once 5 are found and at the end display the total number of even numbers.