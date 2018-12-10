package com.data.structure.sorting;

import com.data.structure.general.Element;

public class MergeSort {

    public static void sort(Element array[]) {
        mergeSort(array,0,array.length-1);
    }

    private static void mergeSort(Element[] array, int left, int right) {
        if (left < right) {
            int middle = (left+right)/2;
            mergeSort(array,left,middle);
            mergeSort(array,middle+1,right);
            merge(array,left,middle,right);
        }
    }

    private static void merge(Element[] array, int left, int middle, int right) {
        int sizeLeftArray = middle - left + 1;
        int sizeRightArray = right - middle;

        //sub-arrays
        Element[] arrayLeft = new Element[sizeLeftArray];
        Element[] arrayRight = new Element[sizeRightArray];

        //copying values
        for(int i = 0; i < sizeLeftArray; i++) {
            arrayLeft[i] = array[i+left];
        }
        for(int i = 0; i < sizeRightArray; i++) {
            arrayRight[i] = array[i+middle+1];
        }

        //merging
        int leftIndex = 0;
        int rightIndex = 0;
        int arrayIndex = left;

        while (leftIndex < sizeLeftArray && rightIndex < sizeRightArray) {
            if (arrayLeft[leftIndex].isLessThan(arrayRight[rightIndex].getValue())) {
                array[arrayIndex] = arrayLeft[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = arrayRight[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        //remaining elements from left and right
        while (leftIndex < sizeLeftArray) {
            array[arrayIndex] = arrayLeft[leftIndex];
            leftIndex++;
            arrayIndex++;
        }

        while (rightIndex < sizeRightArray) {
            array[arrayIndex] = arrayRight[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }
}
