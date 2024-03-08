import java.util.Scanner;

 import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        do {

            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            System.out.println("Choose operation (+, -, *, /):");
            char operator = sc.next().charAt(0);

            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    continue; //
                }
            } else {
                System.out.println("Invalid operator!");
                continue; //
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (Y/N)");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Calculator closed.");

    }
}