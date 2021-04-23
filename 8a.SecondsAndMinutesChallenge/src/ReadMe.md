# Seconds And Minutes Challenge
Create a method called getDurationString with two parameters, first parameter minutes
and second parameter seconds.

You should validate that the first parameter minutes is >= 0
You should validate that the second parameter seconds is >= 0 and <=59

The method should return "Invalid Value" if either of the above parameters isn't true

If the parameters are valid, then calculate how many hours, minutes, and seconds equal the minutes and seconds 
passed to this method and return that value as string format "xxh yym zzs" where xx represents a number of hours
yy the mintes and zz the seconds.

Create a second method of the same name but with only one parameter seconds
Validate that it is >= 0 and return "Invalid Value" if it is not true

If it is valid, calculate how many minutes are in the seconds value and then call the other
ovreloaded method passing the correct minutes and seconds calculated so that it can calculate 
correctly.

Call both methods to print values to the console.

Tips: Use int or long for your number data types 
1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds
Methods should be static as we have used previously

Bonus: 
For the input 61 minutes output should be 01h 01m 00s but it is ok if it is 1h 1m 0s(tip use if-else)
Create a new console project and call it SecondsAndMinutesChallenge



