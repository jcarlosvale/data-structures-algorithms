package com.data.structure.searching;

import com.data.structure.general.Element;
import com.data.structure.sorting.QuickSort;

public class Searching {
    public static boolean linearSearch(Element [] array, Element searchElement) {
        for (Element element : array) {
            if (element.isEqualTo(searchElement.getValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(Element [] array, Element searchElement) {
        QuickSort.sort(array);
        return binarySearch(array,0,array.length-1,searchElement);
    }

    private static boolean binarySearch(Element[] array, int minIndex, int maxIndex, Element searchElement) {
        if (maxIndex >= minIndex) {
            int midIndex = (minIndex + maxIndex) / 2;
            if (array[midIndex].isEqualTo(searchElement.getValue())) {
                return true;
            }
            if (array[midIndex].isHigherThan(searchElement.getValue())) {
                return binarySearch(array, minIndex, midIndex-1, searchElement);
            }
            return binarySearch(array, midIndex+1, maxIndex, searchElement);
        }
        return false;
    }
}
