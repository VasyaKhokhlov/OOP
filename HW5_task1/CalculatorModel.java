package HW5_task1;



public class CalculatorModel {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) throws IllegalArgumentException {
        if (number2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return number1 / number2;
    }
}
