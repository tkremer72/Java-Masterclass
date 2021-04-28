public class SimpleCalculator {

    private double firstNumber = 0;
    private double secondNumber = 0;

    //Getters
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    //Setters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    //Addition getter
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
    //Subtraction getter
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
    //Multiplication getter
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
    //Division getter
    public double getDivisionResult() {
        if(secondNumber == 0) {
            return 0;
        } else {
            return firstNumber/secondNumber;
        }
        //return (secondNumber == 0) ? 0 : firstNumber/secondNumber;
    }


}
