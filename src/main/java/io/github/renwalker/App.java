package io.github.renwalker;

import java.util.Scanner;

import io.github.Calculator;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println();

        System.out.print("Enter second number: ");
        float secondNumber = scanner.nextFloat();
        System.out.println();

        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        String operation = scanner.next().toLowerCase();
        System.out.println();

        Calculator calculator = new Calculator(firstNumber, secondNumber, operation);

        float results = calculator.getResult();
        scanner.close();

        System.out.println("Calculation completed successfully.");}
}
