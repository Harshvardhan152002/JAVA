import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Select operation: +, -, *, / or q to quit");
            String operation = scanner.next();

            if (operation.equals("q")) {
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case "/":
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        scanner.close();
    }
}
