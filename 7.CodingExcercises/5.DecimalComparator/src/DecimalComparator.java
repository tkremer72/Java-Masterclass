public class DecimalComparator{

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble){
        int firstCheck = (int)(firstDouble * 1000);
        int secondCheck = (int)(secondDouble * 1000);
        if(firstCheck - secondCheck == 0){
            return true;
        } else
            return false;
    }
}