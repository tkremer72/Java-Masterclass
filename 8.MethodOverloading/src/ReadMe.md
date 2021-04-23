# Method Overloading Challenge
Create a method called calcFeetAndInchesToCentimeters
It needs to have 2 parameters, feet is the first, inches is the second
You should validate that the first parameter feet is >= 0
you should validate that the second parameter inches is >=0 and <=12
return -1 from the method if either of the above is not true

If the parameters are valid, then calculate how many centimeters comprise the feet
and inches passed to this method and return that value.

Create a 2nd method of the same name but with only one parameter of inches
validate that it is >=0 
return -1 if it is not true
But if it is valid, calculate how many feet are in the inches
and then here is the tricky part, call the other overloaded method passing the correct feet and inches
calculated so that it can calculate correctly.
Hints: use double for your number datatypes is probably a good idea 1 inch = 2.54cm and one foot = 12 inches
Use the link I give you to confirm your code is calculating correctly.
Calling another overloaded method just requires you to use the right number of parameters. 
