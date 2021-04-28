# Sum Calculator

Write a class with the name SimpleCalculator.  The class needs two fields(instance
variables) with names firstNumber and secondNumber both of type double.

Write the following methods(instance methods):
    method named getFirstNumber without any parameters.  It needs to return the value
of firstNumber field.
    method named getSecondNumber without any parameters.  It needs to return the value 
of the secondNumber field.
    method named setFirstNumber with one parameter of type double, it needs to set 
the value of the first number field.
    method named setSecondNumber with one parameter of type double, it needs to set 
the value of the second number field.
    method named getAdditionResult without any parameters, it needs to return the result of
adding the field values of firstNumber and secondNumber.
    method named getSubtractionResult without any parameters, it needs to return the result
of subtracting the field values of secondNumber from firstNumber.
    method named getMultiplicationResult without any parameters, it needs to return the
result of multiplying the field values firstNumber and secondNumber.
    method named getDivisionResult without any parameters, it needs to return the result
of dividing the field values of firstNumber by the secondNumber.  In case the value of secondNumber
is 0 then return 0.

Test Example
TEST CODE:
    SimpleCalculator calculator = new Calculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
    System.out.println("divide= " + calculator.getDivisionResult());

Output:
add=9.0
subtract=1.0
multiply=0.0
divide=0.0