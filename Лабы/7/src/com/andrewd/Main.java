package com.andrewd;
import com.andrewd.strategies.InsertionSort;
import com.andrewd.strategies.SortStrategy;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long[] testArray = new long[] {624, 83, 27367, 12, 246, 92, -432};

        SortStrategy strategy = new InsertionSort();
        long[] result = Sort.main(testArray, strategy);
        System.out.println(Arrays.toString(result));
    }
}
