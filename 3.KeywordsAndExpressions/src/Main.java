

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        //Everything below except the word double forms the expression
        double kilometers = (100 * 1.609344);
        System.out.println("A kilometer is = " + kilometers);

        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression");
        }

//Which parts of the following code are expressions
        int score = 100;// score = 100 is the expression

        if(score > 99) {//score > 99 is the expression
            System.out.println("You got the high score!"); //"You got the high score!" is the expression
            score = 0;//everything on this line but the semi colon is the expression
        }

        
    }
}
