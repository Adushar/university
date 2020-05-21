package com.andrewd;

import com.andrewd.strategies.SortStrategy;

public class Sort {
    public static long[] main(long[] array, SortStrategy strategy) {
        return strategy.sort(array);
    }
}
