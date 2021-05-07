import java.util.ArrayList;

class IntClass {//There is a better way of doing this with autoboxing
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //Can't do the following because a primitive type is not a class
        //ArrayList<int> intArrayList = new ArrayList<int>();
        //By creating the IntClass class we can do the following
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
//Example of AutoBoxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for(int i = 0; i <= 10; i++) {
//            intArrayList.add(Integer.valueOf(i));
//        }
//        for(int i = 0; i <= 10; i++) {
//            //Example of Unboxing
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }

        //The code for Autoboxing and Unboxing above is the long way of doing it
        //Short way below
        Integer myIntValue = 56; //is converted to Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue;//is converted to int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);//shortcut to the below code
            //myDoubleValues.add(Double.valueOf(dbl));
        }
        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);//shortcut to below code
            //double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
