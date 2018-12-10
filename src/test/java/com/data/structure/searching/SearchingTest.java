package com.data.structure.searching;

import com.data.structure.UtilTest;
import com.data.structure.general.Element;
import com.data.structure.sorting.BasicSorting;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchingTest {
    private static final int SIZE_ARRAY = 10;

    @Test
    public void linearSearchSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        boolean exists = Searching.linearSearch(array,new Element(5));
        assertTrue(exists);
    }

    @Test
    public void linearSearchInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        boolean exists = Searching.linearSearch(array,new Element(5));
        assertTrue(exists);
    }

    @Test
    public void linearSearchInexistTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        boolean exists = Searching.linearSearch(array,new Element(SIZE_ARRAY+1));
        assertFalse(exists);
    }

    @Test
    public void binarySearchSortedTest() {
        Element<Integer>[] array = UtilTest.createSortedArray(SIZE_ARRAY);
        boolean exists = Searching.binarySearch(array,new Element(5));
        assertTrue(exists);
    }

    @Test
    public void binarySearchInvertedTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        boolean exists = Searching.binarySearch(array,new Element(5));
        assertTrue(exists);
    }

    @Test
    public void binarySearchInexistTest() {
        Element<Integer>[] array = UtilTest.createInvertedArray(SIZE_ARRAY);
        boolean exists = Searching.binarySearch(array,new Element(SIZE_ARRAY+1));
        assertFalse(exists);
    }
}