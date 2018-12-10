package com.data.structure.sorting;

import com.data.structure.general.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    private static final int SIZE_ARRAY = 10;

    @Test
    public void mergeSortOneElementTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(1);
        MergeSort.sort(array);
        assertEquals(new Integer(1),array[0].getValue());
    }

    @Test
    public void mergeSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        MergeSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void  mergeSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        MergeSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void  mergeSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        MergeSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }
}