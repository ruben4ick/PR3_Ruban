package com.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return (double) a / b;
    }

    public double calculateMean(double[] values) {
        return MathUtils.mean(values);
    }

    public long calculateFactorial(int n) {
        return MathUtils.factorial(n);
    }

    public boolean compareNumbers(double a, double b, double epsilon) {
        return MathUtils.nearlyEqual(a, b, epsilon);
    }
}
