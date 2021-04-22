# A hole in the logic
    Orignally the challenge requirements where as follows. 
    Challenge create a method called displayHighscorePosition, it should take in a players name as a
    parameter, and a second parameter as a poisition in the high score table.  You should display the players
    name along with a message like " managed to get into position " and the position they got and a further
    message " on the high score table ".
        Create a 2nd method called calculateHighScorePosition
        it should be sent one argument only, the players name
        it should return an int
        the return data should be
        1 if the score is > 1000
        2 if the score is > 500 and < 1000
        3 if the score is > 100 and < 500
        4 in all other cases
        Call both methods and display the results of the following
        a score of 1500, 900, 400, 50
    Instead of the score being just greater than 1000, 500, and 100 it 
    should be >= greater than or equal to, otherwise when the result is
    is not equal to 1000, 500, 100 the player will be positioned to 4 

        