package com.andrewd.strategies;

public class SelectionSort implements SortStrategy {

    @Override
    public long[] sort(long[] array) {
        long[] arrayClone = array.clone();

        for (int i = 0; i < arrayClone.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arrayClone.length; j++){
                if (arrayClone[j] < arrayClone[index]){
                    index = j;//searching for lowest index
                }
            }
            long smallerNumber = arrayClone[index];
            arrayClone[index] = arrayClone[i];
            arrayClone[i] = smallerNumber;
        }
        return arrayClone;
    }
}
