package com.andrewd.tasks;

public class Task3 {
    public static double calculate_sum_of_row(double limit) {
        if (limit <= 0) throw new IllegalArgumentException("limit should be grater than 0");

        double result = 0;
        for (int i = 0;; i++) {
            double element_value = Math.pow(-1, i)/factorial(i);

            if ( Math.abs(element_value) < limit) break;
            else result += element_value;
        }

        return result;
    }

    // CRIME SCENE DO NOT CROSS
    private static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}
