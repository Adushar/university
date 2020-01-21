package com.andrewd.strategies;

public class BubbleSort implements SortStrategy {
    @Override
    public long[] sort(long[] array) {
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
}
