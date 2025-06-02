package io.github.renwalker;

import java.util.Scanner;

import io.github.Calculator;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean keepRunning = true;
            Float previousResult = null; // Stores the last calculation result

            while (keepRunning) {
                float firstNumber;
                
                // Offer to reuse the previous result
                if (previousResult != null) {
                    System.out.print("Use previous result (" + previousResult + ") as first number? (yes/no): ");
                    String reuseChoice = scanner.next().toLowerCase();
                    if (reuseChoice.equals("yes")) {
                        firstNumber = previousResult; // Skip input for first number
                    } else {
                        System.out.print("Enter first number: ");
                        firstNumber = scanner.nextFloat();
                    }
                } else {
                    System.out.print("Enter first number: ");
                    firstNumber = scanner.nextFloat();
                }

                System.out.print("Enter second number: ");
                float secondNumber = scanner.nextFloat();

                System.out.print("Enter operation (addition, subtraction, multiplication, division, exponentiation, modulus): ");
                String operation = scanner.next();

                try {
                    Calculator calculator = new Calculator(firstNumber, secondNumber, operation);
                    previousResult = calculator.getResult(); // Store the result for future use
                    System.out.println("Result: " + previousResult);
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                    previousResult = null; // Reset on error
                }

                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String choice = scanner.next().toLowerCase();
                if (choice.equals("no") || choice.equals("exit")) {
                    keepRunning = false;
                }
            }

            System.out.println("Calculator closed. Goodbye!");
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}