# First And Last Digit Sum
Write a method named sumFirstAndLastDigit with one parameter of type int called number

The method needs to find the first and the last digit of the parameter number passed to the
method, using a loop and return the sum of the first and the lsat digit of that number.

If the number is negative then the method needs to return -1 to indicate an invalid value.

Example Input/Output
sumFirstAndLastNumber(252); should return 4, the first digit is 2 and the last digit is 2
which gives us 2+2 and the sum is 4;
sumFirstAndLastNumber(257); should return 9
sumFirstAndLastNumber(0); should return 0
sumFirstAndLastNumber(5); should return 10
sumFirstAndLastNumber(-10) should return -1
