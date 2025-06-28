//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package anurag;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean valid = true;

        // Perform operation using if conditions
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
                valid = false;
            }
        } else {
            System.out.println("Invalid operator!");
            valid = false;
        }

        // Display result if valid
        if (valid) {
            System.out.println("Result: " + result);
        }

    }
}

