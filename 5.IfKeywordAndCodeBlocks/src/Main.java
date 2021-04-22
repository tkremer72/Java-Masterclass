
public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000!");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here!");
//        }
        if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
        //Challenge print out a second score on the screen with the following
        //Score set to 10000
        //level completed set to 8
        //bonus set to 200
        //but make sure the first printout above still displays as well
//The way I did it below/ uses more memory
        int newScore = score + 9200;
        int newlevelCompleted = levelCompleted + 3;
        int newBonus = bonus + 100;
        if(gameOver == true) {
            int finalScore = newScore + (newlevelCompleted * newBonus);
            finalScore += 1000;
            System.out.println("Your new final score was " + finalScore);
        }

        //The way the instructor does it which involves duplication, not good.
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        if(gameOver == true) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        //Using methods to refrain from code duplication


    }
}
