package com.andrewd.tasks;

public class Task1 {
    public static double calculate_sum_of_the_row(int k, double z) {
        if (k <= 1 || k >= 15) throw new IllegalArgumentException("k should be between 1 and 15");
        if (z <= 0) throw new IllegalArgumentException("k should be between 1 and 15");

        double sum_of_the_row = 0;
        // in this case iteration will be ok, cause k is limited to 15)
        for (int i = 1; i <= k; i++) {
            sum_of_the_row += calc_element_value(i, k, z);
        }

        return sum_of_the_row;
    }

    private static double calc_element_value(int i, int k, double z) {
        double left_block = 1/Math.sqrt(z*i);
        double right_block = Math.tan( (double) k/i ); // if we will not convert it to double we will get int result (1/2 == 0)

        return left_block + right_block;
    }
}
