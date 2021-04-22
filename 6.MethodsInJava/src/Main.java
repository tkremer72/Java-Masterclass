public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //Challenge create a method called displayHighscorePosition, it should take in a players name as a
        //parameter, and a second parameter as a poisition in the high score table.  You should display the players
        //name along with a message like " managed to get into position " and the position they got and a further
        //message " on the high score table ".

        //Create a 2nd method called calculateHighScorePosition
        //it should be sent one argument only, the players name
        //it should return an int
        //the return data should be
        //1 if the score is >= 1000
        //2 if the score is >= 500 and < 1000
        //3 if the score is >= 100 and < 500
        //4 in all other cases
        //Call both methods and display the results of the following
        //a score of 1500, 900, 400, 50
        //

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Adam", highScorePosition);
         highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Thomas", highScorePosition);
         highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Rufus", highScorePosition);
         highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Molly", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Jimmy", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Michael", highScorePosition);
    }


    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table ");
    }
    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
        int position = 4;//assuming position 4 will be returned
        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
