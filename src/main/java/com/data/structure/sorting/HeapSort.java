package com.data.structure.sorting;

import com.data.structure.general.Element;

public class HeapSort {
    public static void sort(Element array[]) {
        int n = array.length;
        //left = 2 * i + 1
        //right = 2 * i + 2
        //Heap initial
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeap(array, n, i);
        }

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--) {
            // Move current root to end
            Element temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            maxHeap(array, i, 0);
        }
    }


    public static void maxHeap(Element[] array, int sizeElements, int indexLargest) {
        int largest = indexLargest;
        int leftIndex  = 2*indexLargest + 1;
        int rightIndex = 2*indexLargest + 2;

        // If left child is larger than root
        if (leftIndex < sizeElements && array[leftIndex].isHigherThan(array[largest].getValue())) {
            largest = leftIndex;
        }

        // If right child is larger than largest so far
        if (rightIndex < sizeElements && array[rightIndex].isHigherThan(array[largest].getValue())) {
            largest = rightIndex;
        }

        // If largest is not root
        if (largest != indexLargest)
        {
            Element swap = array[indexLargest];
            array[indexLargest] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            maxHeap(array, sizeElements, largest);
        }
    }
}
