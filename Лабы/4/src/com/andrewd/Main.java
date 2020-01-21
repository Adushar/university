package com.andrewd;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sample_arr = {6, 3, 0, 2, 5, -7};
        System.out.println( ArrayOperations.find_max(sample_arr) ); // 6
        System.out.println( ArrayOperations.sum_of_second_and_biggest(sample_arr) ); // 3 + 6

        int[] formated_arr = ArrayOperations.format(sample_arr);
        System.out.println( Arrays.toString(formated_arr) ); // { 12, 6, 1, 4, 10, -1 }
    }
}
