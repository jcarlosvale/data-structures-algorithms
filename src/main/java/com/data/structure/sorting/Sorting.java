package com.data.structure.sorting;

import com.data.structure.general.Element;

public class Sorting {

    public static void bubbleSort(Element array[]) {
        int length = array.length;
        for (int i = 0; i < length+1; i++) {
            for (int j = 0; j < length-i-1; j++) {
                if (array[j].isHigherThan(array[j+1].getValue())) {
                    swap(array,j,j+1);
                }
            }
        }
    }

    private static void swap(Element[] array, int i, int j) {
        Element temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
