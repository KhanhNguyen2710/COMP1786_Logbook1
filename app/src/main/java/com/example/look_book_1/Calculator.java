package com.example.look_book_1;

public class Calculator {
    public static double calculate(String expression) {
        String[] parts;
        int result = 0;

        if (expression.contains("+")) {
            parts = expression.split("\\+"); //
            for (String part : parts) {
                result += Integer.parseInt(part);
            }
        }
        else if (expression.contains("-")) {
            parts = expression.split("-");
            if (parts.length == 2) {
                result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
            }
        }

        else if (expression.contains("x")) { //??
            parts = expression.split("x");
            result = 1;
            for (String part : parts) {
                result *= Integer.parseInt(part);
            }

        }

        else if (expression.contains("/")) {
            parts = expression.split("/");
            if (parts.length == 2) {
                int divisor = Integer.parseInt(parts[1]);
                if (divisor != 0) {
                    result = Integer.parseInt(parts[0]) / divisor;
                } else {
                    return Double.NaN;
                }
            }
        }

        return result;
    }
}
