package com.andrewd;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long[] testArray1 = new long[] {32, 11, 0, 4};
        testArray1 = SortArray.bubbleSort(testArray1);
        System.out.println(Arrays.toString(testArray1));

        long[] testArray2 = new long[] {624, 83, 27367, 12, 246, 92, -432};
        testArray2 = SortArray.insertionSort(testArray2);
        System.out.println(Arrays.toString(testArray2));
    }
}
