package com.data.structure.list;

import com.data.structure.general.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void basicOperationsTest() {
        Element element = new Element(1);
        LinkedList list = new LinkedList(element);
        list.insertBegin(new Element(0));
        list.insertEnd(new Element((2)));
        assertNotNull(list.search(new Element(0)));
        assertNotNull(list.search(new Element(1)));
        assertNotNull(list.search(new Element(2)));
        assertNull(list.search(new Element(3)));
        assertTrue(list.delete(new Element(2)));
        assertFalse(list.delete(new Element(3)));
        assertTrue(list.delete(new Element(1)));
        assertTrue(list.delete(new Element(0)));
    }

    @Test
    public void transversalTest(){
        Element element = new Element(1);
        LinkedList list = new LinkedList(element);
        list.insertBegin(new Element(0));
        list.insertEnd(new Element((2)));
        assertEquals(0, list.removeHead().element.getValue());
        assertEquals(1, list.removeHead().element.getValue());
        assertEquals(2, list.removeHead().element.getValue());
    }

}