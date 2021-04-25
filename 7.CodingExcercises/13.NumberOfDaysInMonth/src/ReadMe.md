# Number of Days in Month
Write a method isLeapYear with a parameter of type int named year

The parameter needs to be greater than or equal to 1 and less than or equal to 9999

If the parameter is not in that range return false

Otherwise if it is in that valid range, calculate if the year is a leap year and return true if it is
or return false if it is not.

Write another method getDaysInMonth with two parameters month and year.  Both of type int

If parameter month is < 1 or >9999 return -1.0

This method needs to return the number of days in the month.  Be careful about leap years
they have 29 days in a month(February)
You should check if the year is a leap year using the method isLeapYear described above.

getDaysInMonth(2, 2020); should return 29 since February has 29 days in a leap year and 2020 is a leap year
getDaysInMonth(2, 2018); should return 28 since February has 28 days if it is not a leap year and 2018 is not a leap year
getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid
getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1-9999