public class SharedDigit {
//First solution to this coding challenge
    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if(numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99) {
            int numberOne1st = numberOne/10;
            int numberOneLast = numberOne%10;
            int numberTwo1st = numberTwo/10;
            int numberTwoLast = numberTwo%10;

            return (numberOne1st==numberTwo1st || numberOneLast==numberTwoLast || numberOne1st==numberTwoLast || numberOneLast==numberTwo1st);
        }
        return false;
    }

//Second solution to this challenge
//        public static boolean hasSharedDigit(int numberOne, int numberTwo) {
//            if(numberOne >= 10 && numberOne <=99 && numberTwo >=10 && numberTwo <=99) {
//                return (numberOne/10==numberTwo/10 || numberOne%10==numberTwo%10 ||  numberOne/10==numberTwo%10 || numberOne%10==numberTwo/10);
//            }
//            return false;
//        }

    //Third solution to this problem, less readability
//    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
//        return (numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99) &&
//                (numberOne / 10 == numberTwo / 10 || numberOne % 10 == numberTwo % 10 || numberOne / 10 == numberTwo % 10 || numberOne % 10 == numberTwo / 10);
//    }

//Fourth solution without nested loops
//public static boolean hasSharedDigit(int numberOne, int numberTwo) {
//        if(numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo >99) {
//            return false;
//        }
//        for(int i = numberOne; i > 0; i /= 10) {
//            for(int j = numberTwo; j > 0; j /= 10) {
//                if(i % 10 == j % 10) {
//                    return true;
//                }
//            }
//        }
//        return false;
//}

//Fifth solution, not a good one but a solution none the less
//    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
//        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
//            return false;
//        }
//
//        int originalnumberTwo = numberTwo; // hold value of numberTwo
//        while (numberOne > 0) {
//            while (numberTwo > 0) {
//                if (numberOne % 10 == numberTwo % 10) {
//                    return true;
//                }
//                numberTwo /= 10;
//            }
//            numberOne /= 10;
//            numberTwo = originalnumberTwo; // reset value of numberTwo since it became 0
//        }
//        return false;
//    }
}
