package HW5_task1;


import java.util.Scanner;

public class CalculatorView {
    private final Scanner scanner = new Scanner(System.in);

    public void showWelcomeMessage() {
        System.out.println("Добро пожаловать в калькулятор!");
    }

    public String getUserOperation() {
        System.out.println("Введите знак действия (+, -, *, /):");
        return scanner.nextLine();
    }

    public double getUserNumber(String name) {
        System.out.println("Введите " + name + " число:");
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Неправильное число");
            }
        }
    }

    public void showError(String message) {
        System.out.println("Ошибка: " + message);
    }

    public void getResult(double result) {
        System.out.println("Результат: " + result);
    }
}