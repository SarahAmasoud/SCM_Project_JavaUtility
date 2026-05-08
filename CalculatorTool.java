import java.util.Scanner;

public class CalculatorTool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator Tool");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");

        int choice = scanner.nextInt();

        double result;

        if (choice == 1) {

            result = num1 + num2;
            System.out.println("Result: " + result);

        } else if (choice == 2) {

            result = num1 - num2;
            System.out.println("Result: " + result);

        } else {

            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}