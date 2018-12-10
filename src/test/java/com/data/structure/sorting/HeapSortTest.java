package com.data.structure.sorting;

import com.data.structure.UtilTest;
import com.data.structure.general.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {
    private static final int SIZE_ARRAY = 10;

    @Test
    public void heapSortOneElementTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(1);
        HeapSort.sort(array);
        assertEquals(new Integer(1),array[0].getValue());
    }

    @Test
    public void heapSortSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        HeapSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void  heapSortInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        HeapSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }

    @Test
    public void  heapSortRandomTest() {
        Element<Integer>[] array = UtilTest.createRandomArray(SIZE_ARRAY);
        HeapSort.sort(array);
        for (int i=0; i<SIZE_ARRAY; i++) {
            assertEquals(new Integer(i+1),array[i].getValue());
        }
    }
}