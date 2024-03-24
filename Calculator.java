package HW_7;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        char operation = '\0';

        try {
            System.out.print("\033[H\033[J");
            System.out.print("Введите первое число: ");
            num1 = scanner.nextDouble();

            System.out.print("\033[H\033[J");
            System.out.print("Введите операцию (+, -, *, /): ");
            operation = scanner.next().charAt(0);

            System.out.print("\033[H\033[J");
            System.out.print("Введите второе число: ");
            num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operation);
            System.out.print("\033[H\033[J");
            System.out.println("Результат: " + result);

            // Логируем операцию
            CalculatorLogger.log("Вычисление: " + num1 + " " + operation + " " + num2 + " = " + result);

        } catch (InputMismatchException e) {
            System.out.print("\033[H\033[J");
            System.out.println("Неверный ввод. Пожалуйста, введите числа.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double calculate(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return new AdditionOperation().execute(num1, num2);
            case '-':
                return new SubtractOperation().execute(num1, num2);
            case '*':
                return new MultiplyOperation().execute(num1, num2);
            case '/':
                return new DivisionOperation().execute(num1, num2);
            default:
                System.out.print("\033[H\033[J");
                throw new IllegalArgumentException("Неверная операция");
        }
    }
}

