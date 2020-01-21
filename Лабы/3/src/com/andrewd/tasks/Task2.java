package com.andrewd.tasks;

public class Task2 {
    public static double calculate_function_value(double t, int n, int l) {
        if (n < 1) throw new IllegalArgumentException("t should be greater than 0");
        double result = 0;

        for (int i = 1; i <= n; i++) {
            result += calc_element_value(t, l);
        }
        return result;
    }

    private static double calc_element_value(double t, int l) {
        return (l % 2 != 0) ? first_formula(t, l) : second_formula(t, l);
    }

    private static double first_formula(double t, int l) {
        return (1/t)*l;
    }

    private static double second_formula(double t, int l) {
        if (t <= 0) throw new IllegalArgumentException("t should be greater than 0");
        return ( 1/Math.sqrt(t) )*l;
    }
}
