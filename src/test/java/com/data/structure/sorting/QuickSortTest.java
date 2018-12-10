package com.data.structure.sorting;

import com.data.structure.general.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {
    private static final int SIZE_ARRAY = 10;

    @Test
    public void quickSortOneElementTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(1);
        QuickSort.sort(array);
        assertEquals(new Integer(1),array[0].getValue());
    }

    @Test
    public void quickSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        QuickSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void  quickSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        QuickSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void  quickSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        QuickSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }
}