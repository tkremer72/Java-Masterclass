public class Main {

    public static void main(String[] args) {

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        //Without the parenthesis below, the multiplication happens before the addition.
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("TheRemainder = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("IsNoRemainer = " + isNoRemainder);

        if(!isNoRemainder) {
            System.out.println("Got some remainder!");
        }


    }
}
