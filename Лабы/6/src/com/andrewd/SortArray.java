package com.andrewd;

public class SortArray {
    public static long[] bubbleSort(long[] array) {
        long[] temp_arr = array.clone();

        outer: while (true) {
            for (int i = 1; i < temp_arr.length; i++) {
                boolean swappedWhileTheLoop = false;
                long temp1 = temp_arr[i-1];
                long temp2 = temp_arr[i];

                if (temp1 > temp2) {
                    // swap
                    temp_arr[i-1] = temp2;
                    temp_arr[i] = temp1;
                    swappedWhileTheLoop = true;
                }
                if (i == temp_arr.length-1 && !swappedWhileTheLoop) break outer;
            }
        }
        return temp_arr;
    }

    public static long[] insertionSort(long[] array) {
        long[] sorted_array_template = new long[array.length];
        int sorting_border = 0;
        for (int n = 0; n < array.length; n++) {
            int insertion_point = 0;
            if (sorting_border > 0) {
                while (insertion_point < sorting_border && sorted_array_template[insertion_point] < array[n]) {
                    insertion_point++; // Поиск точки вставки
                }
            }
            for (int m = sorting_border-1; m >= insertion_point; m--) { // Пока не дойдём до точки вставки
                sorted_array_template[m+1] = sorted_array_template[m]; // Сдвиг всех елементов вправо с границы отсортированых елементов до точки вставки
            }
            sorted_array_template[insertion_point] = array[n];
            sorting_border++;
        }
        return sorted_array_template;
    }
}
