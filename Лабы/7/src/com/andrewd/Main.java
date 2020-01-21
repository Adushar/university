package com.andrewd;
import com.andrewd.strategies.BubbleSort;
import com.andrewd.strategies.InsertionSort;
import com.andrewd.strategies.SelectionSort;
import com.andrewd.strategies.SortStrategy;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long[] testArray = new long[] {624, 83, 27367, 12, 246, 92, -432};

        SortStrategy arraySorter;
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);
        switch (randomInt) {
            case (0):
                arraySorter = new InsertionSort();
                System.out.println("InsertionSort");
                break;
            case (1):
                arraySorter = new BubbleSort();
                System.out.println("BubbleSort");
                break;
            default:
                arraySorter = new SelectionSort();
                System.out.println("SelectionSort");
                break;
        }
        testArray = arraySorter.sort(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}
