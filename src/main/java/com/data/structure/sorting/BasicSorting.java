package com.data.structure.sorting;

import com.data.structure.general.Element;

public class BasicSorting {

    public static void bubbleSort(Element array[]) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1; j++) {
                if (array[j].isHigherThan(array[j+1].getValue())) {
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void insertionSort(Element array[]){
        for (int i = 1; i < array.length; i++){
            Element aux = array[i];
            int j = i;
            while ((j > 0) && (array[j-1].isHigherThan(aux.getValue()))){
                array[j] = array[j-1];
                j -= 1;
            }
            array[j] = aux;
        }
    }

    public static void selectionSort(Element array[]) {
        int i, j, min;
        for (i = 0; i < array.length; i++) {
            min = i;
            for (j = (i+1); j < array.length; j++) {
                if(array[j].isLessThan(array[min].getValue())) {
                    min = j;
                }
            }
            if (!array[i].isEqualTo(array[min].getValue())) {
                swap(array,i,min);
            }
        }
    }

    public static void shellSort(Element array[])
    {
        // Start with a big gap, then reduce the gap
        for (int gap = array.length/2; gap > 0; gap = gap/2) {
            for (int i = gap; i < array.length; i++) {
                Element temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap].isHigherThan(temp.getValue()); j = j - gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    private static void swap(Element[] array, int i, int j) {
        Element temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
