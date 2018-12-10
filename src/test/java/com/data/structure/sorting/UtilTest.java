package com.data.structure.sorting;

import com.data.structure.general.Element;

import java.util.*;

public class UtilTest {
    public static Element<Integer>[] createRandomArray(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<n+1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return toArray(list);
    }

    public static Element<Integer>[] toArray(List<Integer> list) {
        Element<Integer> [] array = new Element[list.size()];
        for (int i=0; i<list.size(); i++) {
            array[i] = new Element<Integer>(list.get(i));
        }
        return array;
    }

    public static Element<Integer>[] createSortedArray(int n) {
        Element<Integer> [] array = new Element[n];
        for (int i=1; i<n+1; i++) {
            array[i-1] = new Element<Integer>(i);
        }
        return array;
    }

    public static Element<Integer>[] createInvertedArray(int n) {
        Element<Integer> [] array = new Element[n];
        for (int i=n; i>0; i--) {
            array[n-i] = new Element<Integer>(i);
        }
        return array;
    }
}
