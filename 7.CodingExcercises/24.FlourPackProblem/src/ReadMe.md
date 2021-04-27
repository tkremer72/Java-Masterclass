# Flour Pack Problem

Write a method named canPack with three parameters of type int named bigCount, 
smallCount, and goal

The parameter bigCount represents the count of big flour bags(5 kilos each)

the parameter smallCount represents the count of small flout bags(1 kilo each)

the parameter goal represents the goal amount of kilos of flour needed to assemble a package

therefore the sum of the kilos of bigCount and smallCount must be at least equal to the value
of goal.  The method should return true if it is possible to make a package with goal kilos of
flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount.  For
example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since
each big bag is 5 kilos and can not be divided.  However, if goal = 9, bigCount = 1, and smallCount 
= 5, then the method should return true because of 1 full bigCount bag and four full smallCount bags
equal goal, and it is okay if there are additional bags leftover.

If any of the parameters are negative, return false.

Example Input/Output

canPack(1, 0, 4) should return false
canPack(1, 0, 5) should return true
canPack(0, 5, 4) should return true
canPack(2, 2, 11) should return true
canPack(-3, 2, 12) should return false

