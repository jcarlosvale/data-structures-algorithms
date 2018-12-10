package com.data.structure.sorting;

import com.data.structure.general.Element;

public class QuickSort {

    public static void sort(Element array[]) {
        quickSort(array,0,array.length-1);
    }

    private static void quickSort(Element array[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(array, low, partitionIndex-1);
            quickSort(array, partitionIndex+1, high);
        }
    }

    private static int partition(Element[] array, int low, int high) {
        Element pivot = array[high];
        int indexSmallElement = (low-1); // index of smaller element
        for (int indexHighElement = low; indexHighElement < high; indexHighElement++) {
            // If current element is smaller than or equal to pivot
            if (array[indexHighElement].isLessThan(pivot.getValue())) {
                indexSmallElement++;

                // swap arr[i] and arr[j]
                Element temp = array[indexSmallElement];
                array[indexSmallElement] = array[indexHighElement];
                array[indexHighElement] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Element temp = array[indexSmallElement+1];
        array[indexSmallElement+1] = array[high];
        array[high] = temp;

        return indexSmallElement+1;
    }
}
