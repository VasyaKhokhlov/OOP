package HW7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComplexNumberFactory factory = new SimpleComplexNumberFactory();
        CalculationStrategy strategy = new AdditionStrategy();
        ComplexCalculator calculator = new ComplexCalculator(factory, strategy);

        calculator.addListener(new LogOperationListener());
        String choice = "";
        while (!choice.equals("4")) {
            ComplexNumber num1 = readComplexNumber1(scanner);
            ComplexNumber num2 = readComplexNumber2(scanner);
            System.out.println("Выберите операцию: ");
            System.out.println("1 - сложение\n2 - умножение\n3 - деление\n4 - выход");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":

                    ComplexNumber resultAddtion = calculator.add(num1, num2);
                    System.out.println("Результат: " + resultAddtion.getRealPart() + " + " + resultAddtion.getImaginaryPart() + "i");
                    System.out.println();
                    break;
                case "2":
                    ComplexNumber resultMultiplication = calculator.multiply(num1, num2);
                    System.out.println("Результат: " + resultMultiplication.getRealPart() + " * " + resultMultiplication.getImaginaryPart() + "i");
                    System.out.println();
                    break;
                case "3":
                    ComplexNumber resultDivision = calculator.divide(num1, num2);
                    System.out.println("Результат: " + resultDivision.getRealPart() + " / " + resultDivision.getImaginaryPart() + "i");
                    System.out.println();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    continue;
            }

        }
    }

    private static ComplexNumber readComplexNumber1(Scanner scanner) {
        System.out.println("Введите действительную и мнимую часть первого комплексного числа через пробел:");
        double realPart = scanner.nextDouble();
        double imaginaryPart = scanner.nextDouble();
        scanner.nextLine();
        ComplexNumberFactory factory = new SimpleComplexNumberFactory();
        return factory.createComplexNumber(realPart, imaginaryPart);
    }
    private static ComplexNumber readComplexNumber2(Scanner scanner) {
        System.out.println("Введите действительную и мнимую часть второго комплексного числа через пробел:");
        double realPart = scanner.nextDouble();
        double imaginaryPart = scanner.nextDouble();
        scanner.nextLine();
        ComplexNumberFactory factory = new SimpleComplexNumberFactory();
        return factory.createComplexNumber(realPart, imaginaryPart);
    }
}