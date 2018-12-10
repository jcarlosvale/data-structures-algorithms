package com.data.structure.sorting;

import com.data.structure.general.*;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BasicSortingTest {

    private static final int SIZE_ARRAY = 10;

    @Test
    public void bubbleSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        BasicSorting.bubbleSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void bubbleSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        BasicSorting.bubbleSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void bubbleSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        BasicSorting.bubbleSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void insertionSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        BasicSorting.insertionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void insertionSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        BasicSorting.insertionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void insertionSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        BasicSorting.insertionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void selectionSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        BasicSorting.selectionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void selectionSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        BasicSorting.selectionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void selectionSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        BasicSorting.selectionSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void shellSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        BasicSorting.shellSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void shellSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        BasicSorting.shellSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void shellSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        BasicSorting.shellSort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }
}