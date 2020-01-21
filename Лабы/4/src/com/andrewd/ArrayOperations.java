package com.andrewd;

public class ArrayOperations {
    public static int find_max(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array is empty");

        int biggest_el = 0;
        for (int el: arr) {
            if (el > biggest_el) biggest_el = el;
        }

        return biggest_el;
    }

    public static int sum_of_second_and_biggest(int[] arr) {
        return find_max(arr) + arr[1];
    }

    public static int[] format(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException("Array is empty");

        int[] brand_new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];

            if (el < 0)        brand_new_arr[i] = el + find_max(arr);
            else if ( el == 0) brand_new_arr[i] = 1;
            else brand_new_arr[i] = el*2;
        }

        return brand_new_arr;
    }
}
