package HW5_task1;


public class CalculatorPresenter {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        view.showWelcomeMessage();
        String operation = view.getUserOperation();
        if (!operation.matches("[+\\-*/]")) {
            view.showError("Неправильный оператор");
            return;
        }
        double number1 = view.getUserNumber("первое");
        double number2 = view.getUserNumber("второе");
        try {
            switch (operation) {
                case "+":
                    view.getResult(model.add(number1, number2));
                    break;
                case "-":
                    view.getResult(model.subtract(number1, number2));
                    break;
                case "*":
                    view.getResult(model.multiply(number1, number2));
                    break;
                case "/":
                    view.getResult(model.divide(number1, number2));
                    break;
            }
        } catch (IllegalArgumentException e) {
            view.showError(e.getMessage());
        }
    }
}