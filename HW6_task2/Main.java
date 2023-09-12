package HW6_task2;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorInputView inputView = new CalculatorInputView();
        CalculatorOutputView outputView = new CalculatorOutputView();
        CalculatorController controller = new CalculatorController(model, outputView);

        String operation = inputView.getOperation();
        int num1 = inputView.getOperand();
        int num2 = inputView.getOperand();

        controller.performOperation(operation, num1, num2);
    }
}
