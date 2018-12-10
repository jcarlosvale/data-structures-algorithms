package com.data.structure.sorting;

import com.data.structure.general.*;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class SortingTest {

    private static final int SIZE_ARRAY = 100;

    @Test
    public void bubbleSortSortedTest() {
        Element<Integer>[] array = createSortedArray(SIZE_ARRAY);
        Sorting.bubbleSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void bubbleSortInvertedTest() {
        Element<Integer>[] array = createInvertedArray(SIZE_ARRAY);
        Sorting.bubbleSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void bubbleSortRandomTest() {
        Element<Integer>[] array = createRandomArray(SIZE_ARRAY);
        Sorting.bubbleSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void insertionSortSortedTest() {
        Element<Integer>[] array = createSortedArray(SIZE_ARRAY);
        Sorting.insertionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void insertionSortInvertedTest() {
        Element<Integer>[] array = createInvertedArray(SIZE_ARRAY);
        Sorting.insertionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void insertionSortRandomTest() {
        Element<Integer>[] array = createRandomArray(SIZE_ARRAY);
        Sorting.insertionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void selectionSortSortedTest() {
        Element<Integer>[] array = createSortedArray(SIZE_ARRAY);
        Sorting.selectionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void selectionSortInvertedTest() {
        Element<Integer>[] array = createInvertedArray(SIZE_ARRAY);
        Sorting.selectionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void selectionSortRandomTest() {
        Element<Integer>[] array = createRandomArray(SIZE_ARRAY);
        Sorting.selectionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    private Element<Integer>[] createRandomArray(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<n+1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return toArray(list);
    }

    private Element<Integer>[] toArray(List<Integer> list) {
        Element<Integer> [] array = new Element[list.size()];
        for (int i=0; i<list.size(); i++) {
            array[i] = new Element<Integer>(list.get(i));
        }
        return array;
    }

    private Element<Integer>[] createSortedArray(int n) {
        Element<Integer> [] array = new Element[n];
        for (int i=1; i<n+1; i++) {
            array[i-1] = new Element<Integer>(i);
        }
        return array;
    }

    private Element<Integer>[] createInvertedArray(int n) {
        Element<Integer> [] array = new Element[n];
        for (int i=n; i>0; i--) {
            array[n-i] = new Element<Integer>(i);
        }
        return array;
    }
}