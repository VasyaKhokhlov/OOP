package HW7;

import java.util.ArrayList;
import java.util.List;

public class ComplexCalculator {
    private List<OperationListener> listeners = new ArrayList<>();
    private CalculationStrategy strategy;

    public ComplexCalculator(ComplexNumberFactory factory, CalculationStrategy strategy) {
        this.strategy = strategy;
    }



    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = strategy.calculate(num1, num2);
        notifyListeners("сложение: " + num1.toString() + " + " + num2.toString() + " = " + result.toString());
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = strategy.calculate(num1, num2);
        notifyListeners("умножение: " + num1.toString() + " * " + num2.toString() + " = " + result.toString());
        return result;
    }

    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = strategy.calculate(num1, num2);
        notifyListeners("деление: " + num1.toString() + " / " + num2.toString() + " = " + result.toString());
        return result;
    }

    public void addListener(OperationListener listener) {
        listeners.add(listener);
    }

    public void removeListener(OperationListener listener) {
        listeners.remove(listener);
    }

    private void notifyListeners(String operation) {
        for (OperationListener listener : listeners) {
            listener.onOperationPerformed(operation);
        }
    }
}