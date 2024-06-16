package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation: add, subtract, multiply, divide, mean, factorial, compare, or 'exit' to quit:");
            String operation = scanner.nextLine().trim();

            if (operation.equals("exit")) {
                System.out.println("Exiting...");
                break;
            }

            switch (operation) {
                case "add":
                case "subtract":
                case "multiply":
                case "divide":
                    System.out.println("Enter two numbers (space separated):");
                    String input = scanner.nextLine().trim();
                    String[] parts = input.split(" ");
                    int a = Integer.parseInt(parts[0]);
                    int b = Integer.parseInt(parts[1]);

                    switch (operation) {
                        case "add":
                            System.out.println("Result: " + calculator.add(a, b));
                            break;
                        case "subtract":
                            System.out.println("Result: " + calculator.subtract(a, b));
                            break;
                        case "multiply":
                            System.out.println("Result: " + calculator.multiply(a, b));
                            break;
                        case "divide":
                            System.out.println("Result: " + calculator.divide(a, b));
                            break;
                    }
                    break;

                case "mean":
                    System.out.println("Enter numbers (space separated):");
                    input = scanner.nextLine().trim();
                    parts = input.split(" ");
                    double[] values = new double[parts.length];
                    for (int i = 0; i < parts.length; i++) {
                        values[i] = Double.parseDouble(parts[i]);
                    }
                    System.out.println("Mean: " + calculator.calculateMean(values));
                    break;

                case "factorial":
                    System.out.println("Enter a number:");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Factorial: " + calculator.calculateFactorial(n));
                    break;

                case "compare":
                    System.out.println("Enter two numbers and an epsilon (space separated):");
                    input = scanner.nextLine().trim();
                    parts = input.split(" ");
                    double num1 = Double.parseDouble(parts[0]);
                    double num2 = Double.parseDouble(parts[1]);
                    double epsilon = Double.parseDouble(parts[2]);
                    System.out.println("Are the numbers nearly equal? " + calculator.compareNumbers(num1, num2, epsilon));
                    break;

                default:
                    System.out.println("Unknown operation.");
                    break;
            }
        }

        scanner.close();
    }
}
