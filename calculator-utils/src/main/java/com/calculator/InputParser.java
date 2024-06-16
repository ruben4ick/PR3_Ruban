package com.calculator;

public class InputParser {
    public static int[] parseInput(String input) {
        String[] parts = input.split(" ");
        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(parts[0]);
        numbers[1] = Integer.parseInt(parts[1]);
        return numbers;
    }
}